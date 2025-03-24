package org.LLD.DesignPatterns.Behavioural.Strategy.StockTrading;

public class MomentumTradingStrategy implements TradingIndicatorStrategy{
    @Override
    public TradingStrategyType supportsType() {
        return TradingStrategyType.MOMENTUM;
    }

    @Override
    public Double calculateIndicator(Stock stock) {
        return  stock.getPrice() - stock.getPreviousPrice();
    }
}
