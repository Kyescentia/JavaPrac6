import java.util.Date;

public class Account {

     private String accountNum;
     private double balance;
     private Date dateCreated; // Auto Generated.
     
     public Account() {
        this(" ", 0.0);
     }   
        
     public Account(String accountNum, double balance){
        this.accountNum = accountNum;
        this.balance = balance;
        dateCreated = new Date();
        
     }
     
     public String getAccount(){
        return accountNum;
     }
     
     public double getBalance(){
        return balance;
     }
     
     public Date getDateCreated(){
        return dateCreated;
     }
     
     public void setAccountNum(String accountNum){
        this.accountNum = accountNum;
     }
     
     public void setBalance(double balance){
        this.balance = balance;
     }
     
     public void deposit(double amount){
        balance += amount;
     }
     
     public boolean withdraw(double amount){
        
        if (amount > balance){
            return false;
        }
        else 
            balance -= amount;
            return true;
        
     }
     
     public String toString(){
        return ("Account Number: " + accountNum + "\nBalance: " + balance + " (MYR)\nDate Created: " + dateCreated);
     }
     
     // Q2c Section
     public boolean equals(Object o){
        Account a = (Account)o;
        
        if (this.accountNum == a.accountNum)
            return true;
        else
            return false;
     }
     
     
   
}
