package ru.tinkoff.asashina.game.after;

import lombok.AllArgsConstructor;
import ru.tinkoff.asashina.player.Player;

@AllArgsConstructor
public class PayService {

    private final MessageSender messageSender;

    public void checkCash(Player player, int price) {
        while (player.getCash() < price && !player.getAllStreets().isEmpty()) {
            // bail or sell
        }
        if (player.getCash() < price && player.getAllStreets().isEmpty()) {
            messageSender.sendMessage("Player %s is bankrupt".formatted(player));
        }
    }

}
