package ru.tinkoff.asashina.street.after;

import lombok.Getter;
import ru.tinkoff.asashina.enumeration.Colour;

@Getter
public class ColouredStreet extends Street {

    private final Colour colour;
    private final int housePrice;
    private final int hotelPrice;

    private int houses = 0;
    private boolean isHotelBuilt = false;

    public ColouredStreet(
            String name,
            int price,
            int collateralPrice,
            int maxMonopolyLevel,
            int[] possibleMonopolyPrices,
            Colour colour,
            int housePrice,
            int hotelPrice) {

        super(name, price, collateralPrice, maxMonopolyLevel, possibleMonopolyPrices);
        this.colour = colour;
        this.housePrice = housePrice;
        this.hotelPrice = hotelPrice;
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
