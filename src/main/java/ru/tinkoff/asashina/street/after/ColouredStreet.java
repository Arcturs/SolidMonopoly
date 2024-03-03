package ru.tinkoff.asashina.street.after;

import lombok.Getter;
import ru.tinkoff.asashina.enumeration.Colour;

@Getter
public abstract class ColouredStreet extends Street {

    private int houses = 0;
    private boolean isHotelBuilt = false;

    public ColouredStreet(
            String name,
            int price,
            int collateralPrice,
            int maxMonopolyLevel,
            Colour colour,
            int[] possibleMonopolyPrices) {

        super(name, price, collateralPrice, maxMonopolyLevel, colour, possibleMonopolyPrices);
    }

    /**
     * Методы для покупки домов/отеля
     */

    public abstract int getHousePrice();

    public abstract int getHotelPrice();

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
