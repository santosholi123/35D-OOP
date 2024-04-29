
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
    }
}