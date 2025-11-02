package rvt;

public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        balance = openingBalance;
    }

    public String toString() {
        return "The card has a balance of " + balance + " euros";
    }
    public void eatAffordably() {
        double price = 2.6;
        if (balance >= price) {
            balance -= price;
        }
    }

    public void eatHeartily() {
        double price = 4.6;
        if (balance >= price) {
            balance -= price;
        }
    }
    public void addMoney(double amount) {
        if (amount > 0){
            balance += amount;
            if (balance > 150){
                balance = 150;
            }
        }
    }
}