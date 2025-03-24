package org.LLD.DesignPatterns.Behavioural.Strategy.StockTrading;

public class VolatilityTradingStrategy implements TradingIndicatorStrategy{


    @Override
    public TradingStrategyType supportsType() {
        return TradingStrategyType.VOLATILITY;
    }

    @Override
    public Double calculateIndicator(Stock stock) {
        return Math.abs(stock.getPrice() - stock.getPreviousPrice());
    }
}
