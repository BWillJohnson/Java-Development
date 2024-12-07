import com.pluralsight.finance.IValuable;

public class BankAccount implements IValuable {
    private String name;
    private String accountNumber;
    private double balance;

    public BankAccount(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
    public void withdraw(double amount){

    }
    public  void deposit(double amount){

    }

    @Override
    public double getValue() {
        return 0;
    }
}
