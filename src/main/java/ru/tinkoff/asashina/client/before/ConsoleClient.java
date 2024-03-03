package ru.tinkoff.asashina.client.before;

import ru.tinkoff.asashina.enumeration.ActionType;

import java.net.http.HttpRequest;
import java.util.logging.Logger;

public class ConsoleClient implements ActionProcessingInterface {

    private final Logger log = Logger.getLogger("MonopolyLogger");

    @Override
    public void processAction(ActionType action) {
        log.info("Processing Action " + action.name());
    }

    @Override
    public void processAction(HttpRequest request) {
        // no logic here
    }

    public void sendMessageInConsole(String message) {
        log.info(message);
    }

}
