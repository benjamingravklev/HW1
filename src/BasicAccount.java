public class BasicAccount extends StandardAccount{
    //STATE
    double WithdrawalLimit;

    //constructor
    public BasicAccount(int accountNumber, double withdrawalLimit) {
        super(accountNumber,0);
        if (withdrawalLimit < 0) {
            this.WithdrawalLimit = 0;
        } else {
            this.WithdrawalLimit = withdrawalLimit;
        }
    }
    //Behaviour
    @Override
    public double Withdraw(double amount) {
        if (amount > WithdrawalLimit) {
            amount = WithdrawalLimit;
        }
        if (Balance - amount < 0) {
            amount = Balance;
        }
        Balance -= amount;
        return amount;
    }
}
