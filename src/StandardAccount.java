public class StandardAccount implements IAccount{
    //STATE
    int AccountNumber;
    double CreditLimit;
    double Balance;

    //constructor
    public StandardAccount (int accountNumber, double creditLimit) {
        this.AccountNumber = accountNumber;
        if (creditLimit > 0) {
            this.CreditLimit = 0;
        } else {
            this.CreditLimit = creditLimit;
        }
        this.Balance = 0;
    }
    //Behaviour
    @Override
    public void Deposit(double amount) {
        Balance += amount;
    }

    @Override
    public double Withdraw(double amount) {
        if (Balance - amount > CreditLimit) {
            Balance -= amount;
            return amount;
        } else {
            double allowedWithdrawal = Balance - CreditLimit;
            Balance = CreditLimit;
            return allowedWithdrawal;
        }
    }

    @Override
    public double GetCurrentBalance() {
        return Balance;
    }

    @Override
    public int GetAccountNumber() {
        return AccountNumber;
    }
}
