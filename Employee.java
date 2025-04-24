public class Employee {

    private String name;
    private int yearJoined;
    private double basicSalary;

    public Employee() {
        this(" ", 0, 0.0);
    }
    
    public Employee(String name, int yearJoined, double basicSalary){
        this.name = name;
        this.yearJoined = yearJoined;
        this.basicSalary = basicSalary;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setYearJoined(int yearJoined){
        this.yearJoined = yearJoined;
    }
    
    public void setBasicSalary(double basicSalary){
        this.basicSalary = basicSalary;
    }
    
    public String getName(){
        return name;
    }
    
    public int getYearJoined(){
        return yearJoined;
    }
    
    public double getBasicSalary(){
        return basicSalary;
    }


    public String toString(){
       return("Name: " + name + "\nYear Joined: " + yearJoined + "\nBasic Salary: " + basicSalary + " MYR"); 
    }
        
    public double calculateSalary(){
        return basicSalary;
    }
        
        
        
}
