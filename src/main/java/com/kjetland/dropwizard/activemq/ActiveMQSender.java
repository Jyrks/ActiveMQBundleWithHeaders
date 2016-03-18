package com.kjetland.dropwizard.activemq;

import javax.jms.Message;
import javax.jms.Session;
import java.util.Map;

public interface ActiveMQSender {

    void sendJson(String json);
    void sendJson(String json, Map<String, String> headerMap);
    void send(Object object);
    void send(JMSFunction<Session, Message> messageCreator);
}
