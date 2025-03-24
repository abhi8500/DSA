package org.LLD.DesignPatterns.Behavioural.Strategy.StockTrading;

public class Stock {

    private Double price;
    private Double previousPrice;

    public Stock(Double price, Double previousPrice) {
        this.price = price;
        this.previousPrice = previousPrice;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPreviousPrice() {
        return previousPrice;
    }

    public void setPreviousPrice(Double previousPrice) {
        this.previousPrice = previousPrice;
    }
}
