package org.LLD.DesignPatterns.Behavioural.Strategy.StockTrading;

public class MovingAverageTradingStrategy implements TradingIndicatorStrategy{


    @Override
    public TradingStrategyType supportsType() {
        return TradingStrategyType.MOVING_AVERAGES;
    }

    @Override
    public Double calculateIndicator(Stock stock) {
        return (stock.getPrice()  + stock.getPreviousPrice())/2;
    }
}
