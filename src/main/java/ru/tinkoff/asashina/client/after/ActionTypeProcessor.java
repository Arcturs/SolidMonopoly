package ru.tinkoff.asashina.client.after;

import ru.tinkoff.asashina.enumeration.ActionType;

public interface ActionTypeProcessor {

    void processAction(ActionType action);

}
