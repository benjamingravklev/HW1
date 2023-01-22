public class PremiumAccount extends StandardAccount{
    //STATE

    //constructor
    public PremiumAccount(int accountNumber) {
        super(accountNumber, Integer.MAX_VALUE);
    }

    @Override
    public double Withdraw(double amount) {
        Balance -= amount;
        return amount;
    }


}
