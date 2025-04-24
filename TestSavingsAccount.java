public class TestSavingsAccount {
        
    public static void main(String[] args) {
        SavingsAccount s1 = new SavingsAccount("S12345", 1000.00);        
            
        System.out.println("Current Balance: " + s1.getBalance() + " MYR");
        
        s1.deposit(1000.00);
        System.out.println("Updated balance: " + s1.getBalance() + " MYR");
        
        if (s1.withdraw(500.00))
            System.out.println("Updated balance AFTER withdrawal: " + s1.getBalance() + " MYR");
        else
            System.out.println("Lol no money loser");
            
            SavingsAccount.setInterestRate(0.05);
            
            System.out.println(s1.toString());
        
    }
}
