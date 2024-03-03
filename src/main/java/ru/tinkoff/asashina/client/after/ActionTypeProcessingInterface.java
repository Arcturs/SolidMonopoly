package ru.tinkoff.asashina.client.after;

import ru.tinkoff.asashina.enumeration.ActionType;

public interface ActionTypeProcessingInterface {

    void processAction(ActionType action);

}
