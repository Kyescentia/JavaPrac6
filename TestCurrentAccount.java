import java.util.Scanner;
public class TestCurrentAccount {
        
   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        CurrentAccount c1 = new CurrentAccount("C1223", 1000.00);
        
        int input;
        double amount;
        
        CurrentAccount.setFreeTransactions(3);
        CurrentAccount.setTransactionFee(2.00);
        
        do{
            System.out.println("====================================================");
            System.out.println("1. Deposit");
            System.out.println("2. Withdrawal");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.println("====================================================");
            
            input = scan.nextInt();
            
            switch(input){
                
                case 1: 
                    System.out.println("---- Deposit ----");
                    System.out.println("Current Balance: " + c1.getBalance() + " MYR");
                    System.out.println("Enter Amount to Deposit [RM]: ");
                    amount = scan.nextDouble();
                    c1.deposit(amount);
                    System.out.println("Updated Balance: " + c1.getBalance() + " MYR");
                    break;
                case 2:
                    System.out.println("---- Withdrawal ----");
                    System.out.println("Current Balance: " + c1.getBalance() + " MYR");
                    System.out.println("Enter Amount to Withdraw [RM]: ");
                    amount = scan.nextDouble();
                    if (c1.withdraw(amount))
                        System.out.println("Updated Balance: " + c1.getBalance() + " MYR");
                    else
                        System.out.println("Lol loser u have nyo money");
                    break;
                case 3:
                    System.out.println("---- Balance Checker ----");
                    System.out.println("Current Balance: " + c1.getBalance() + " MYR");
                    break;
                case 4:
                    System.out.println("Terminating Sesh. Buh bye");
                    System.out.println("====================================================");
                    System.out.println(c1.toString());
                    break;

                default:
                    System.out.println("Grow brains and not give invalid inputs mane");
            }
            
        }while(input >= 1 && input < 4);
        
        
        
    }
}
