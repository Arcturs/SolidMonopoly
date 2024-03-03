package ru.tinkoff.asashina.client.after;

import ru.tinkoff.asashina.enumeration.ActionType;
import ru.tinkoff.asashina.game.after.SendMessageInterface;

public class UiClient implements ActionTypeProcessingInterface, SendMessageInterface {

    @Override
    public void processAction(ActionType action) {
        // process
    }

    @Override
    public void sendMessage(String message) {
        // process
    }

}
