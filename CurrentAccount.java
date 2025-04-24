public class CurrentAccount extends Account {

    private static int freeTransactions;
    private static double transactionFee;
    private int transactionCount; // Must be counted by the system autonomously.

    public CurrentAccount() {
        this(" ", 0.0);
    }
    
    public CurrentAccount(String accountNum, double balance){
        super(accountNum, balance);
    }
    
    public static int getFreeTransactions(){
        return freeTransactions;
    }
    
    public static double getTransactionFee(){
        return transactionFee;
    }
    
    public int getTransactionCount(){
        return transactionCount;
    }
    
    public static void setFreeTransactions(int freeTransactions){
        CurrentAccount.freeTransactions = freeTransactions;
    }
    
    public static void setTransactionFee(double transactionFee){
        CurrentAccount.transactionFee = transactionFee;
    }
    
    public void addTransactionCount(){
        transactionCount++;
    }
    
    public void deductTransactionFee(){
        // If transaction count more than freeTransactions, deduct transaction fee from balance.
        if (transactionCount > freeTransactions)
            super.withdraw(transactionFee);
    }
    
    public void deposit(double amount){
        super.deposit(amount);
        addTransactionCount();
        deductTransactionFee();
    }
    
    public boolean withdraw(double amount){
        if (super.withdraw(amount)){
             addTransactionCount();
            deductTransactionFee();
            return true;
            }
        else
            return false;
    }
    
    public String toString(){
        return (super.toString() + "\nTransaction Count: " + transactionCount + " time(s)");
    }
    
}
