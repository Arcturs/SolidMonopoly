package ru.tinkoff.asashina.street.before;

import lombok.Getter;
import lombok.Setter;
import ru.tinkoff.asashina.player.Player;
import ru.tinkoff.asashina.enumeration.Colour;
import ru.tinkoff.asashina.enumeration.StreetStatus;

@Getter
@Setter
public class Street {

    private final String name;
    private final int price;
    private final int collateralPrice;
    private final int basicRent;
    private final int maxMonopolyLevel;
    private final Colour colour;
    private final int[] possibleMonopolyPrices;

    private int currentMonopolyLevel = 0;
    private int houses = 0;
    private boolean isHotelBuilt = false;
    private StreetStatus status = StreetStatus.AVAILABLE;
    private Player holder = null;

    public Street(
            String name,
            int price,
            int collateralPrice,
            int maxMonopolyLevel,
            Colour colour,
            int[] possibleMonopolyPrices) {

        this.name = name;
        this.price = price;
        this.collateralPrice = collateralPrice;
        this.possibleMonopolyPrices = possibleMonopolyPrices;
        this.basicRent = possibleMonopolyPrices[0];
        this.colour = colour;
        this.maxMonopolyLevel = maxMonopolyLevel;
    }

    public int getRent() {
        return possibleMonopolyPrices[currentMonopolyLevel];
    }

    /**
     * Метод для покупки улицы
     */

    public void occupy(Player player) {
        holder = player;
        status = StreetStatus.OCCUPIED;
    }

    /**
     * Методы для продажи улицы или поставить в залог
     */

    public void setOnBail () {
        setCurrentMonopolyLevel(0);
        this.status = StreetStatus.ON_BAIL;
    }

    public void sell() {
        setCurrentMonopolyLevel(0);
        setStatus(StreetStatus.AVAILABLE);
    }

    /**
     * Методы для покупки домов/отеля
     */

    public int getHousePrice() {
        return 0;
    }

    public int getHotelPrice() {
        return 0;
    }

    public void buildHouse() {
        currentMonopolyLevel++;
        houses++;
    }

    public void buildHotel() {
        houses = 0;
        currentMonopolyLevel++;
        isHotelBuilt = true;
    }

}
