public class TestQ2C {
        
  
    public static void main(String[] args) {
        
        //Creation of 2 objects
        CurrentAccount c1 = new CurrentAccount("C1234", 100.00);
        SavingsAccount s1 = new SavingsAccount("C1234", 1000.00);
        
        System.out.println(c1.equals(s1));
        
    }
}
