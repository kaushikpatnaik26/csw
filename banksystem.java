package bank;

public class banksystem {
    private String accountNumber;
    private double balance;

    private banksystem(String accountNumber , double balance)
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public double getBalance()
    {
        return balance;
    }
    public String getAccNo()
    {
        return accountNumber;
    }
    public void withdraw(double amount) 
    {
        balance = balance - amount;
        System.out.println("widthdrawl amount: Rs " + amount);
        System.out.println("balance: Rs " + balance);
        System.out.println();
    }
    public void deposit(double amount)
    {
        balance = balance + amount;
        System.out.println("Deposit amount: Rs " + amount);
        System.out.println("Available balance: Rs " + balance);
        System.out.println();
    }
    public void viewBalance()
    {
        System.out.println("Availd balance: Rs " + balance);
    }
    public static void main(String[] args) 
    {
        banksystem b = new banksystem("jett",500000000);
        b.withdraw(500);
        b.deposit(1500);
        b.viewBalance();
    }
}
