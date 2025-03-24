package org.LLD.DesignPatterns.Behavioural.Strategy.StockTrading;

public interface TradingIndicatorStrategy {
    TradingStrategyType supportsType();

    Double calculateIndicator(Stock stock);
}
