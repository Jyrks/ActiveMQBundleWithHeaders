package com.kjetland.dropwizard.activemq;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class ActiveMQConfig {

    @JsonProperty
    @NotNull
    public String brokerUrl;

    @JsonProperty
    public long healthCheckMillisecondsToWait = 2000; // 2 seconds

    @JsonProperty
    public int shutdownWaitInSeconds = 20;

    @JsonProperty
    @Valid
    public ActiveMQPoolConfig pool;

    @Override
    public String toString() {
        return "ActiveMQConfig{" +
                "brokerUrl='" + brokerUrl + '\'' +
                ", healthCheckMillisecondsToWait=" + healthCheckMillisecondsToWait +
                ", shutdownWaitInSeconds=" + shutdownWaitInSeconds +
                ", pool=" + pool +
                '}';
    }
}
