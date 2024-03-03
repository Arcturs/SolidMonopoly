package ru.tinkoff.asashina.client.before;

import ru.tinkoff.asashina.enumeration.ActionType;

import java.net.http.HttpRequest;

public class UiClient implements ActionProcessingInterface {

    @Override
    public void processAction(ActionType action) {
        // process
    }

    @Override
    public void processAction(HttpRequest request) {
        // no logic here
    }

    public void showMessageOnPanel(String message) {
        // process
    }

}
