package ru.tinkoff.asashina.client.after;

import ru.tinkoff.asashina.enumeration.ActionType;
import ru.tinkoff.asashina.game.after.MessageSender;

import java.util.logging.Logger;

public class ConsoleClient implements ActionTypeProcessor, MessageSender {

    private final Logger log = Logger.getLogger("MonopolyLogger");

    @Override
    public void processAction(ActionType action) {
        log.info("Processing Action " + action.name());
    }

    @Override
    public void sendMessage(String message) {
        log.info(message);
    }

}
