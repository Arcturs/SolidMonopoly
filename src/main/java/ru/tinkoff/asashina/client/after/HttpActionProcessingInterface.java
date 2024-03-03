package ru.tinkoff.asashina.client.after;

import java.net.http.HttpRequest;

public interface HttpActionProcessingInterface {

    void processAction (HttpRequest request);

}
