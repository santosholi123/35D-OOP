
/*Task 
 * Use a while loop to 
 * ask user for an int value 
 * if the user input possitive value 
 * promt user to input nagative value 
 * loop until the user input negative int value
 */
import java.util.Scanner;

public class Task {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input= scan.nextInt();
        while(input>=0){
            System.out.println("please enter negative number ");
            input =scan.nextInt();

        }
        System.out.println("The negative value is"+ input);
        scan.close();



        /*Task
     * WAP to run for loop from -5 to 5
     * break the loop if the index is positive
     *  
     * Task2
     * Loop from 1-20 using any loop 
     * only print the value if it is even
     * Use continue to do this task
     */

    for(int i=-5; i<=5; i++ ){
        if(i <=0){
            break;
        }else{
            System.out.println("count"+i);
        }
       
    }

    }

}                                    




