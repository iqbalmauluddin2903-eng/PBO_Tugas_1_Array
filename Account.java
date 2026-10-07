public class Account {
    private double balance;

    public Account(double init_balance) {
        this.balance = init_balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public boolean deposit(double amt) {
        if (amt > 0) {
            this.balance += amt;
            return true;
        }
        return false;
    }

    public boolean withdraw(double amt) {
        if (amt > 0 && amt <= this.balance) {
            this.balance -= amt;
            return true;
        } else {
            System.out.println("Transaksi Gagal: Saldo tidak mencukupi!");
            return false;
        }
    }
}