package org.example.app.handler;

public interface UserInputHandler {
    void buttonPushed(int n);
    void moneyInserted(double amount);
    void abort();
}
