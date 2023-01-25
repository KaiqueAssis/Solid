package srp;

public class Account {
    private int account;
    private String nameAccount;
    private double balance;


    public void Account(int account, String nameAccount){
        this.account = account;
        this.nameAccount = nameAccount;
    }

    public void withDraw(double amount){
        balance -= amount;
    }

    public String getNameAccount() {
        return nameAccount;
    }

    public int getAccount() {
        return account;
    }

    public void setBalance (double amount) {
        balance = amount;
    }

    public double getBalance() {
        return balance;
    }
}
