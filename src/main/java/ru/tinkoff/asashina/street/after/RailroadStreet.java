package ru.tinkoff.asashina.street.after;

import lombok.Getter;

@Getter
public class RailroadStreet extends Street {

    public RailroadStreet(
            String name,
            int price,
            int collateralPrice,
            int maxMonopolyLevel,
            int[] possibleMonopolyPrices) {

        super(name, price, collateralPrice, maxMonopolyLevel, possibleMonopolyPrices);
    }

}
