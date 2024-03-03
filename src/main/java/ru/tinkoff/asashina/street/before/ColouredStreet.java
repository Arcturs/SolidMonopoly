package ru.tinkoff.asashina.street.before;

import lombok.Getter;
import lombok.Setter;
import ru.tinkoff.asashina.enumeration.Colour;

@Getter
@Setter
public class ColouredStreet extends Street {

    private final int housePrice;
    private final int hotelPrice;

    public ColouredStreet(
            String name,
            int price,
            int collateralPrice,
            int maxMonopolyLevel,
            Colour colour,
            int[] possibleMonopolyPrices,
            int housePrice,
            int hotelPrice) {

        super(name, price, collateralPrice, maxMonopolyLevel, colour, possibleMonopolyPrices);
        this.housePrice = housePrice;
        this.hotelPrice = hotelPrice;
    }

    @Override
    public int getHousePrice() {
        return housePrice;
    }

    @Override
    public int getHotelPrice() {
        return hotelPrice;
    }

}
