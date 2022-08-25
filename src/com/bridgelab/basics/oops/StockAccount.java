package com.bridgelab.basics.oops;

public class StockAccount {
    public static void main(String[] args) {
        StockPortfolio sp = new StockPortfolio();
        sp.stockDetails();
        System.out.println(sp.listOfStocks);
        sp.valueOfStocks();
    }
}
