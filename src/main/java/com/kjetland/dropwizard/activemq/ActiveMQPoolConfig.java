package com.kjetland.dropwizard.activemq;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ActiveMQPoolConfig {

    @JsonProperty
    public Integer maxConnections;

    @JsonProperty
    public Integer maximumActiveSessionPerConnection;

    @JsonProperty
    public Boolean blockIfSessionPoolIsFull;

    @JsonProperty
    public Integer idleTimeoutSeconds;

    @JsonProperty
    public Long expiryTimeoutMills;

    @JsonProperty
    public Boolean createConnectionOnStartup;

    @JsonProperty
    public Long timeBetweenExpirationCheckMillis;

    @Override
    public String toString() {
        return "ActiveMQPoolConfig{" +
                "maxConnections=" + maxConnections +
                ", maximumActiveSessionPerConnection=" + maximumActiveSessionPerConnection +
                ", blockIfSessionPoolIsFull=" + blockIfSessionPoolIsFull +
                ", idleTimeoutSeconds=" + idleTimeoutSeconds +
                ", expiryTimeoutMills=" + expiryTimeoutMills +
                ", createConnectionOnStartup=" + createConnectionOnStartup +
                ", timeBetweenExpirationCheckMillis=" + timeBetweenExpirationCheckMillis +
                '}';
    }
}
