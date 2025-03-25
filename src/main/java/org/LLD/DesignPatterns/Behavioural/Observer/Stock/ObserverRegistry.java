package org.LLD.DesignPatterns.Behavioural.Observer.Stock;

public interface ObserverRegistry {

    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers(String stockName, double currentPrice);
}
