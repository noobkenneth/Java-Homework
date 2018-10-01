public class Account {
    private int id = 0;
    private double balance = 0;
    private static double annualInterestRate = 0;
    private java.util.Date dateCreated;

    public Account() {
        dateCreated = new java.util.Date();
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;

    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(double rate) {
        annualInterestRate = rate ;
    }

    public String getdateCreated() {
        return this.dateCreated.toString();
    }

    public static double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest() {
        return getMonthlyInterestRate() * balance;
    }

    public void withdraw(double value) {
        this.balance -= value;
    }

    public void deposit(double value) {
        this.balance += value;
    }

}


