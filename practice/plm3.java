package practice;

public class plm3 {

    enum TransactionType {
        DEPOSIT, WITHDRAWAL, INTEREST_PAYMENT
    }

    public static class Transaction {
        public TransactionType type;
        public double amount;

        public Transaction(TransactionType type, double amount) {
            this.type = type;
            this.amount = amount;
        }
    }

    public static double calculateTotalEarnings(Transaction... transactions) {
        double total = 0;
        for (int i = 0; i < transactions.length; i++) {
            total += (transactions[i].type == TransactionType.WITHDRAWAL) ? -transactions[i].amount : transactions[i].amount;
        }
        return total;
    }

    public static void main(String[] args) {
        Transaction t1 = new Transaction(TransactionType.DEPOSIT, 1000);
        Transaction t2 = new Transaction(TransactionType.WITHDRAWAL, 500);
        Transaction t3 = new Transaction(TransactionType.INTEREST_PAYMENT, 50);

        double totalEarnings = calculateTotalEarnings(t1, t2, t3);
        System.out.println("Total earnings: $" + totalEarnings);
    }
}
