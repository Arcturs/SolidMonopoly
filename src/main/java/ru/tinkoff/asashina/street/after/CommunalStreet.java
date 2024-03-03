package ru.tinkoff.asashina.street.after;

import lombok.Getter;
import ru.tinkoff.asashina.enumeration.Colour;

@Getter
public class CommunalStreet extends Street {

    public CommunalStreet(
            String name,
            int price,
            int collateralPrice,
            int maxMonopolyLevel,
            int[] possibleMonopolyPrices) {

        super(name, price, collateralPrice, maxMonopolyLevel, Colour.ENERGY, possibleMonopolyPrices);
    }

    @Override
    public int getRent(int dice) {
        if (currentMonopolyLevel == 1) {
            return dice * 4;
        }
        return dice * 10;
    }

}
