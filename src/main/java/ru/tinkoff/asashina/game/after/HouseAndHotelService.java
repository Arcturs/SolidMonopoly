package ru.tinkoff.asashina.game.after;

import ru.tinkoff.asashina.street.before.Street;

public class HouseAndHotelService {

    public void buildHouseOrHotel(Street street) {
        if (street.getHouses() == 4) {
            street.setHouses(0);
            street.buildHotel();
        } else {
            street.buildHouse();
        }
    }

}
