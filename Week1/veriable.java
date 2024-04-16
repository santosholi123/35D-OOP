// import java.nio.file.FileAlreadyExistsException;

// public class veriable {

//     public static void main(String[] args) {
//         //  non primitive data type
//         // Decleration
//         byte byteValue;
//         // Initialization
//         byteValue = 100;
//         // Multiple Decleration
//         int intValue1, intValue2;
//         intValue1=10000;
//         intValue2=2000;
//         // multiple declation and initialization 
//         long longVal1= -9000, longVal2= 9000;
//         float floatValue= 90.90f; //the letter 'f' is needed
//         double doubleValue= 100.89d; //the letter 'd' is optional
//         char charValue= 'c';
//         // must use single quote'
//         boolean booleanvalu= False;
//         // illegal action below 
//         // byte byteValue= 100; we can not redeclare the variable 
//         // byteValue=200; instead use reassignment 
//         // boolean booleanValue2= 'False' can not use different type
//         // byte byteValue2=100000000; cannot exceed min and max
//         // Non primited data type 
//         String stringValue="This is a string value";
//         // Using class 
//         String stringValue2= new String(Original:"This string uses class");
//         System.out.println(stringValue);
//         // object, for this we use the same public class made 
//         veriable variableobject= new veriable();
        

//     }
// }



public class veriable {
 
    // intance variable
    // will need object to acess this variable
    // Not shared between the object
 
    int instanceVariable =100;
    // Static/class variable
    // No needed of object , can be called from class
    // shared between the objects
 
    static int  staticVariable=20;

    //  Type Casting 
    int intValueType =100;
    double intvalueConvertedToDouble = intValueType;
    // Automatically cast from low datatype to high datatype 
    
    // Explicit Casting
    double doubleValueType = 190.8109;
    // Manually specify data type for eg. (int)

    // Task
    // Make one double variable called doubleVar1 =1000.12
    // Explicitly cast the variable into float, floatVar1
    //   Explicitly cast the floatVar1 into int, intVar1
    // Make a String variable with "The integer is"
    // print the string variable and print the int variable in another  
}