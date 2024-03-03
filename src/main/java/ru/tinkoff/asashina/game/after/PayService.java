package ru.tinkoff.asashina.game.after;

import lombok.AllArgsConstructor;
import ru.tinkoff.asashina.player.Player;

@AllArgsConstructor
public class PayService {

    private final SendMessageInterface sendMessageInterface;

    public void checkCash (Player player, int price) {
        while (player.getCash() < price && !player.getAllStreets().isEmpty()) {
            // bail or sell
        }
        if (player.getCash() < price && player.getAllStreets().isEmpty()) {
            sendMessageInterface.sendMessage("Player is bankrupt");
        }
    }

}
