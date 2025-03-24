package org.LLD.DesignPatterns.Behavioural.Strategy.StockTrading;

public class StockTradingManager {

    private TradingStrategyType strategyType;
    private TradingIndicatorStrategy tradingIndicatorStrategy;

    public StockTradingManager(TradingStrategyType strategyType,
                               TradingIndicatorStrategy tradingIndicatorStrategy) {
        this.strategyType = strategyType;
        this.tradingIndicatorStrategy = tradingIndicatorStrategy;
    }

    public Double calculateIndicator(Stock stock) {
       return tradingIndicatorStrategy.calculateIndicator(stock);
    }
}
