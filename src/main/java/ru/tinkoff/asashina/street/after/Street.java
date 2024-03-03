package ru.tinkoff.asashina.street.after;

import lombok.Getter;
import lombok.Setter;
import ru.tinkoff.asashina.player.Player;
import ru.tinkoff.asashina.enumeration.StreetStatus;

@Getter
@Setter
public abstract class Street {

    private final String name;
    private final int price;
    private final int collateralPrice;
    private final int basicRent;
    private final int maxMonopolyLevel;
    private final int[] possibleMonopolyPrices;

    protected int currentMonopolyLevel = 0;
    protected StreetStatus status = StreetStatus.AVAILABLE;
    protected Player holder = null;

    public Street(
            String name,
            int price,
            int collateralPrice,
            int maxMonopolyLevel,
            int[] possibleMonopolyPrices) {

        this.name = name;
        this.price = price;
        this.collateralPrice = collateralPrice;
        this.possibleMonopolyPrices = possibleMonopolyPrices;
        this.basicRent = possibleMonopolyPrices[0];
        this.maxMonopolyLevel = maxMonopolyLevel;
    }

    public int getRent(int dice) {
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

}
