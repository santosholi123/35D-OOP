public class Encapsulation {
    public static void main(String[] args) {
        
    }
    
}
//bundle similar properties and function into class
class Laptop{
    private String name;
    private String brand;
    private double price;
    private int year;
    // make read-only access using getter
    public void setName(String name){
        this.name =name;
    }
    //Task make getter and setter for all attributes 
    //Make 2 objects of laptop
    //output:
    //Name:Apple M1
    //brand:Apple
    //price:100000
    //Year: 2023
}
