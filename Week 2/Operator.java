public class Operator {
    public static void main(String[] args) {
        // Arithemetic Operators 
         int a = 10,  b =10;
         int sum = a+b; //here the "+" is an arithemitic operators
         System.out.print("Addition for a+b is " + sum);
         System.out.print("Difference  for a-b is " + (a-b));
         System.out.print("Multiplication  for axb is " + (a*b));
         System.out.print("Division  for a/b is " + (a/b));
         System.out.print("Modulo  for a and b is " + (a%b));

        // Assignment Operators
        int aNumber1;
        aNumber1 = 10;
        // or decclare and assign
        int aNumber2 = 20;
        // assign with another variable
        int aNumber3 = aNumber1;
        System.out.println("Assignment with +=" + (aNumber1+=10));
        aNumber2 -=30; //same as aNumber2= aNumber2-30;
        System.out.println("Assignment with +=" + aNumber2);


        // Relational Operators
        int rNumber1 = 10, rNumber2 = 20;
        System.out.println("rNumber1 equal to rNumber2?" + (rNumber1==rNumber2));
        System.out.println("rNumber1 greater than  rNumber2?" + (rNumber1>rNumber2));
        System.out.println("rNumber1 lessthan or equal to rNumber2?" + (rNumber1<=rNumber2));
        System.out.println("rNumber1 not equal to rNumber2?" + (rNumber1!=rNumber2));
        
        //Logical Operator 
        int lNumber1 = 10, lNumber2= 12;
        boolean lExpression1 = lNumber1 == lNumber2;
        boolean lExpression2 = lNumber1 <= lNumber2;
        System.out.println("And operator uses &&"+ (lExpression1 && lExpression2));
        System.out.println("Or operator uses || "+ (lExpression1 || lExpression2));
        System.out.println("Not operator uses !"+ !lExpression1);

        //  Unary Operator 
        int uNumber1 = 10;
        uNumber1++; //meaning uNumber1 = uNumber1 + 1;
        System.out.println("Unary for increment is ++" + uNumber1);
        uNumber1--;
        System.out.println("Unary for decrement is --" + uNumber1);

        

        // Ternary operator 
        int tNumber1= 10, tNumber2=10;
        boolean tExpression = tNumber1== tNumber2;

        // One line if else, see the given example in if else
        // Strint output;
        // if (tExpression == true){
        /* output = "True statement";
         } else{
            output="False statement";
         }
         */
        String output = tExpression ? "True Statement " : "False Statement ";
        //  Here we can assign a string out with one expression 
        // if expression is true it will return the value after the "?"
        // if expression is false it will return the value after the ":"

        int numberOutput = tNumber1 < tNumber2 ? 10 :20;
        System.out.println(output);
        System.out.println(numberOutput);


//1. WAP to print whether a variable is grater or equal to 18  Complete the task1 using ternary operator

    int wVar =12;
    boolean expression = wVar >= 18;
    System.out.println(expression ? "True":"false");
    //2.WAP to print simple interest from variable
    //Make 3 variable for amount ,time and rate and save the calculation into a varaible
    // si = amount * time * rate/100;

    int amount  = 1000 ,time  =2 ,rate = 4;
    int si  = (amount * time * rate)/100;
    System.out.println("The SI OF THE FOLLOWING IS : "+si);

    //3.WAP TO print the area of perimeter of rectangle
    int l = 10 , br =20;
    int ar  = l * br;
    int p  = 2*(l + br);
    System.out.println("Area of rectangle:"+ar);
    System.out.println("Perimeter of rectangle:"+p);

    

        

        


        




        



    }
    
}
