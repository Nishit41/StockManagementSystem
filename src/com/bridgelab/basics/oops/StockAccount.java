package com.bridgelab.basics.oops;

import java.util.Scanner;

public class StockAccount {
    public static void main(String[] args) {
        StockPortfolio sp = new StockPortfolio();
        sp.stockDetails();
        System.out.println(sp.listOfStocks);
        sp.valueOfStocks();
        Scanner sc =  new Scanner(System.in);

        System.out.println("enter total money in account ");
        int totalMoneyInAccount = sc.nextInt();
        sp.debit( totalMoneyInAccount );
    }
}
