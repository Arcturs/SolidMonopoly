package ru.tinkoff.asashina.client.after;

import java.net.http.HttpRequest;

public interface HttpActionProcessor {

    void processAction (HttpRequest request);

}
