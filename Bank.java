
public class Bank {
    private double amount;
    // Parameterized constructor 
    public Bank(double amount) {
        this.amount = amount;
    }
    //  withdraw amount
    public void withdraw(double withdrawmoney) {
        String message=(amount >= withdrawmoney)? "successful":"insufficient balance";
        System.out.println("withdraw successful");
    }
    // deposit amount
    public void deposit(double depositmoney) {
        amount += depositmoney;
        System.out.println("Deposit successful");
    }
    //  total balance
    public void displayBalance() {
        System.out.println("Total balance: " + amount);
    }
    public static void main(String[] args) {
        Bank bank = new Bank(2000.0);
        System.out.println("Initial balance: " + bank.amount);
        bank.withdraw(1000);
        bank.deposit(5000);
        bank.displayBalance();
    }
}

 