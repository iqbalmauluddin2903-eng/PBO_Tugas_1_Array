import java.util.ArrayList;

public class Bank {
    private ArrayList<Customer> customers;

    public Bank() {
        this.customers = new ArrayList<>();
    }

    public void addCustomer(String f, String l) {
        Customer customer = new Customer(f, l);
        this.customers.add(customer);
    }

    public int getNumOfCustomers() {
        return this.customers.size();
    }

    public Customer getCustomer(int index) {
        return this.customers.get(index);
    }
}