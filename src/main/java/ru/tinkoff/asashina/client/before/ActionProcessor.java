package ru.tinkoff.asashina.client.before;

import ru.tinkoff.asashina.enumeration.ActionType;

import java.net.http.HttpRequest;

public interface ActionProcessor {

    void processAction(ActionType action);

    void processAction(HttpRequest request);

}
