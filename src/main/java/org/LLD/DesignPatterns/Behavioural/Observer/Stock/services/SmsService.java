package org.LLD.DesignPatterns.Behavioural.Observer.Stock.services;

import org.LLD.DesignPatterns.Behavioural.Observer.Stock.Observer;
import org.LLD.DesignPatterns.Behavioural.Observer.Stock.utils.NotificationUtils;

public class SmsService implements Observer {


    @Override
    public void notifyObserver(String stockName, double currentPrice) {
        String subject = "Price update for " + stockName;
        String message = "New price is " + currentPrice;
        NotificationUtils.sendSms(subject, message);
    }
}
