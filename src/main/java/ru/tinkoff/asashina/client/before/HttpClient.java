package ru.tinkoff.asashina.client.before;

import ru.tinkoff.asashina.enumeration.ActionType;

import java.net.http.HttpRequest;

public class HttpClient implements ActionProcessor {

    @Override
    public void processAction(ActionType action) {
        // no logic here
    }

    @Override
    public void processAction(HttpRequest request) {
        // process request
    }

    public void sendMessage(String message) {
        // send Message via HTTP
    }

}
