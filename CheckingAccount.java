//public class CheckingAccount extends Account {
//    private int id = 0;
//    private double balance = 0;
//    private static double annualInterestRate = 0;
//    private java.util.Date dateCreated;
//
//    public CheckingAccount() {
//        dateCreated = new java.util.Date();
//    }
//
//    public CheckingAccount(int id, double balance) {
//        this.id = id;
//        this.balance = balance;
//        this.annualInterestRate = 0;
//    }
//
//    public int getId() {
//        return this.id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public double getBalance() {
//        return this.balance;
//    }
//
//    public void setBalance(double balance) {
//        this.balance = balance;
//    }
//
//    public double getAnnualInterestRate() {
//        return annualInterestRate;
//    }
//
//    public static void setAnnualInterestRate(double rate) {
//        annualInterestRate = rate ;
//    }
//
//    public String getdateCreated() {
//        return this.dateCreated.toString();
//    }
//
//    //public double getMonthlyInterestRate() {
//    //    return this.annualInterestRate / 12 / 100;
//    //}
//
//    public double getMonthlyInterest() {
//        return getMonthlyInterestRate() * balance;
//    }
//
//    public void withdraw(double value) {
//        if (this.balance - value < -5000) {
//            System.out.println("over limit");
//        } else {
//            this.balance -= value;
//        }
//    }
//
//    public void deposit(double value) {
//        this.balance += value;
//    }
//}

public class CheckingAccount extends Account {
    private int id = 0;
    private double balance = 0;
    private static double annualInterestRate = 0;
    private java.util.Date dateCreated;

    public CheckingAccount() {
        dateCreated = new java.util.Date();
    }

    public CheckingAccount(int id, double balance) {
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
        if (this.balance - value > 5000 || this.balance <= -5000) {
            System.out.println("over limit");
        } else {
            this.balance -= value;
        }
    }

    public void deposit(double value) {
        this.balance += value;
    }

}



