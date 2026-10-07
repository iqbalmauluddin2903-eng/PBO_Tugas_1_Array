public class TestBanking {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.addCustomer("Iqbal", "Mauluddin");

        Customer customer = bank.getCustomer(0);
        customer.setAccount(new Account(100000));

        Account acc = customer.getAccount(0);

        System.out.println("Nasabah: " + customer.getFirstName() + " " + customer.getLastName());
        System.out.println("Saldo Awal: Rp " + (int) acc.getBalance());

        acc.deposit(50000);
        System.out.println("Setelah Deposit 50000: Rp " + (int) acc.getBalance());

        acc.withdraw(30000);
        System.out.println("Setelah Withdraw 30000: Rp " + (int) acc.getBalance());

        acc.withdraw(200000);
        System.out.println("Saldo Akhir: Rp " + (int) acc.getBalance());

        System.out.println("\nTotal Nasabah di Bank: " + bank.getNumOfCustomers());
    }
}