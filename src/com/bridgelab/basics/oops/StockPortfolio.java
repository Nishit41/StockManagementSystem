package com.bridgelab.basics.oops;

import java.util.ArrayList;
import java.util.Scanner;

public class StockPortfolio {
    ArrayList<Stock> listOfStocks = new ArrayList<>();
   void stockDetails(){
        System.out.println("Enter no of stocks");
        Scanner sc = new Scanner(System.in);
        int numberOfStocks = sc.nextInt();
        for (int i = 0 ; i < numberOfStocks ;  i++){
            Stock stock = new Stock();
            System.out.println("Enter stock name");
            stock.setStockName(sc.next());
            System.out.println("Enter stock no Of shares");
            stock.setNumOfShares(sc.nextInt());
            System.out.println("Enter share price");
            stock.setSharePrice(sc.nextInt());
            listOfStocks.add(stock);
        }
   }
   void valueOfStocks()
   {
       double totalValue = 0;
       for (Stock stock : listOfStocks) {
            double stockValue = stock.getNumOfShares() * stock.getSharePrice();
            System.out.println("stock value of " + stock.getStockName() + " " + stockValue);
            totalValue += stockValue;
       }
        System.out.println("value of  total stock is: " + totalValue);
   }
   void displayData(){
       for (Stock stock : listOfStocks )
           System.out.println(stock);
   }
}
