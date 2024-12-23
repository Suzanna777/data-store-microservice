package com.bank.service;

public interface CDCEventConsumer {
    void handle(String messages);
}
