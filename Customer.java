import java.util.ArrayList;

public class Customer {
    private String firstName;
    private String lastName;
    private ArrayList<Account> accounts;

    public Customer(String f, String l) {
        this.firstName = f;
        this.lastName = l;
        this.accounts = new ArrayList<>();
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setAccount(Account acct) {
        this.accounts.add(acct);
    }

    public Account getAccount(int index) {
        return this.accounts.get(index);
    }

    public int getNumOfAccounts() {
        return this.accounts.size();
    }
}