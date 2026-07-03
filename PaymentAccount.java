// SECTION A - QUESTION TWO, Part (c): withdraw() that declares/throws
// InsufficientFundsException
public class PaymentAccount {
    private double balance;

    public PaymentAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException(
                "Cannot withdraw UGX " + amount + "; available balance is UGX " + balance);
        }
        balance -= amount;
    }

    public static void main(String[] args) {
        PaymentAccount account = new PaymentAccount(20000);
        try {
            account.withdraw(50000);
        } catch (InsufficientFundsException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }
    }
}
