package org.LLD.DesignPatterns.Behavioural.Observer.Stock;

public interface Observer {
    void notifyObserver(String stockName, double currentPrice);
}
