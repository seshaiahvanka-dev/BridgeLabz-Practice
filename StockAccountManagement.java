package DAY11_12;

import java.util.ArrayList;
import java.util.Scanner;

// Class representing a single Stock
class Stock {
    private String name;
    private int numberOfShares;
    private double sharePrice;

    public Stock(String name, int numberOfShares, double sharePrice) {
        this.name = name;
        this.numberOfShares = numberOfShares;
        this.sharePrice = sharePrice;
    }

    public double getStockValue() {
        return numberOfShares * sharePrice;
    }

    public void printStockReport() {
        System.out.println("Stock Name: " + name);
        System.out.println("Number of Shares: " + numberOfShares);
        System.out.println("Share Price: " + sharePrice);
        System.out.println("Total Value: " + getStockValue());
        System.out.println("-----------------------------------");
    }
}

// Class representing a Portfolio of Stocks
class StockPortfolio {
    private ArrayList<Stock> stocks;

    public StockPortfolio() {
        stocks = new ArrayList<>();
    }

    public void addStock(Stock stock) {
        stocks.add(stock);
    }

    public void printPortfolioReport() {
        double totalValue = 0;
        System.out.println("----- Stock Portfolio Report -----");
        for (Stock stock : stocks) {
            stock.printStockReport();
            totalValue += stock.getStockValue();
        }
        System.out.println("Total Portfolio Value: " + totalValue);
    }
}

// Main class
public class StockAccountManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StockPortfolio portfolio = new StockPortfolio();

        System.out.print("Enter number of stocks: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Stock " + (i + 1) + ":");
            System.out.print("Stock Name: ");
            String name = sc.next();
            System.out.print("Number of Shares: ");
            int shares = sc.nextInt();
            System.out.print("Share Price: ");
            double price = sc.nextDouble();

            Stock stock = new Stock(name, shares, price);
            portfolio.addStock(stock);
        }

        portfolio.printPortfolioReport();
        sc.close();
    }
}
