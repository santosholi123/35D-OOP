public class ifelse {
    public static void main(String[] args) {
        /* Simple if example */
        if (true){
            System.out.println("True statement");
        }
        /*If take an expression with boolean value */
        int num1 = 10, num2=20;
        if  (num1>num2){
            System.out.println("Greater");
        }else{
            System.out.println("Lesser");
        }
        /*if else if, two condition */
        if (num1==num2){
            System.out.println("Equals");
        }else if (num1<num2){
            System.out.println("Lesser num2");
            }else{
                System.out.println("Greater");
            }
        /*Note that else should bo at last and is not mandatory */
        /* if else if ladder multiple condition   */
        if (num1<0) {
            System.out.println("Num1 is nagative ");
        }else if (num2 <0){
            System.out.println("Num2 is nagative ");
        }else if (num1 !=num2){
            System.out.println("Greater");
        }else{
            System.out.println("Default statement ");
        }
        /*If any condition matches it will skip all the remaining
         * condition including else, codition will be checked from top-bottom */


        /* Nested if condition */
        if (num1>0){
            if (num1>num2){
                  System.out.println(" Possitive and greater");
            }else{
                 System.out.println("Possitive and lesser");
            }
        }else{
            if (num1>num2){
                System.out.println("Negative and greater");

            }else{
                System.out.println("NEgative and lesser");
            }
        }


         
    }
}
