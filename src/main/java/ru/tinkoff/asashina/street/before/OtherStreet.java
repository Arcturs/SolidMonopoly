package ru.tinkoff.asashina.street.before;

import lombok.Getter;
import lombok.Setter;
import ru.tinkoff.asashina.enumeration.Colour;

@Getter
@Setter
public class OtherStreet extends Street {

    public OtherStreet(
            String name,
            int price,
            int collateralPrice,
            int maxMonopolyLevel,
            Colour colour,
            int[] possibleMonopolyPrices) {

        super(name, price, collateralPrice, maxMonopolyLevel, colour, possibleMonopolyPrices);
    }

}
