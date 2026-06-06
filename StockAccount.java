package DAY11_12;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class StockAccount {
    // Inner class representing a company's shares
    static class CompanyShares {
        private String symbol;
        private int numberOfShares;
        private LocalDateTime transactionDate;

        public CompanyShares(String symbol, int numberOfShares) {
            this.symbol = symbol;
            this.numberOfShares = numberOfShares;
            this.transactionDate = LocalDateTime.now();
        }

        public String getSymbol() {
            return symbol;
        }

        public int getNumberOfShares() {
            return numberOfShares;
        }

        public void addShares(int amount) {
            numberOfShares += amount;
            transactionDate = LocalDateTime.now();
        }

        public void removeShares(int amount) {
            if (amount <= numberOfShares) {
                numberOfShares -= amount;
                transactionDate = LocalDateTime.now();
            } else {
                System.out.println("Not enough shares to sell for " + symbol);
            }
        }

        public LocalDateTime getTransactionDate() {
            return transactionDate;
        }
    }

    // StockAccount fields
    private List<CompanyShares> sharesList;

    public StockAccount() {
        sharesList = new ArrayList<>();
    }

    // Buy shares
    public void buy(int amount, String symbol) {
        CompanyShares existing = findShares(symbol);
        if (existing != null) {
            existing.addShares(amount);
        } else {
            sharesList.add(new CompanyShares(symbol, amount));
        }
        System.out.println("Bought " + amount + " shares of " + symbol);
    }

    // Sell shares
    public void sell(int amount, String symbol) {
        CompanyShares existing = findShares(symbol);
        if (existing != null) {
            existing.removeShares(amount);
            System.out.println("Sold " + amount + " shares of " + symbol);
        } else {
            System.out.println("No shares found for symbol: " + symbol);
        }
    }

    // Calculate total value (dummy price for demo)
    public double valueOf() {
        double total = 0;
        for (CompanyShares cs : sharesList) {
            double pricePerShare = 100.0; // placeholder price
            total += cs.getNumberOfShares() * pricePerShare;
        }
        return total;
    }

    // Print report
    public void printReport() {
        System.out.println("----- Stock Account Report -----");
        for (CompanyShares cs : sharesList) {
            System.out.println("Symbol: " + cs.getSymbol() +
                               ", Shares: " + cs.getNumberOfShares() +
                               ", Last Transaction: " + cs.getTransactionDate());
        }
        System.out.println("Total Account Value: $" + valueOf());
    }

    // Save account (stub)
    public void save(String filename) {
        System.out.println("Saving account data to " + filename + " (not implemented fully).");
    }

    // Helper to find shares
    private CompanyShares findShares(String symbol) {
        for (CompanyShares cs : sharesList) {
            if (cs.getSymbol().equalsIgnoreCase(symbol)) {
                return cs;
            }
        }
        return null;
    }

    // Demo main
    public static void main(String[] args) {
        StockAccount account = new StockAccount();
        account.buy(50, "TCS");
        account.buy(30, "INFY");
        account.sell(10, "TCS");
        account.printReport();
    }
}
