public class SavingsAccount extends Account{
    private static double interestRate;
    
    public SavingsAccount() {
        this(" ", 0.0);
    }
    
    public SavingsAccount(String accountNum, double balance){
        // super() MUST be the first statement
        // Superclass portion must be created before the sublcass portions
        super(accountNum, balance);
    }
    
    public static double getInterestRate(){
        return interestRate;
    }
    
    public static void setInterestRate(double interestRate){
        SavingsAccount.interestRate = interestRate;
    }
    
    
    public double calculateInterest(){
        return (getBalance() * interestRate / 12); //  getBalance() is only available in the superclass, thus the usage of keyword "super" is not compulsory here
    }
    
    public void addInterest(){
        double interest = calculateInterest();
        super.deposit(interest); // Super keyword is not mandated here. Bcuz "deposit" is not a function in this class.
    }
    
    public String toString(){
        return super.toString() + "\nInterest Amount: " + calculateInterest() + " (MYR)";
    }
    
}
