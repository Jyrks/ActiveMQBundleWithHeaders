package com.kjetland.dropwizard.activemq;

import java.util.Map;

public interface ActiveMQReceiver<T> {

    public void receive(T message, Map<String, Object> headerMap);
}
