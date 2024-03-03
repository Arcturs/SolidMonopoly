package ru.tinkoff.asashina.game.after;

import ru.tinkoff.asashina.player.Player;
import ru.tinkoff.asashina.street.before.Street;

public class BailStreetService {

    public void setStreetOnBail(Street street, Player player) {
        street.setOnBail();
        player.addStreetOnBail(street);
    }

}
