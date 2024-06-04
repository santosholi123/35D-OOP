import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListoop {
    public static void main(String[] args) {
        /* Import ArrayList from java.utill */
        ArrayList<String> names = new ArrayList<>();

        names.add("Aayam");
        names.add("Adhar");
        names.add("Yausan");
        names.add("Niraj");
        names.add("Ayush");
        names.add("Rijal");
        

        /* To loop find the length/element count, .size */
        int namesLength = names.size();
        /*Loop same as array */
        for(int index =0; index<namesLength; index++){
            //Get each element with .get(index)
            String singleName = names.get (index);
            System.out.println("Index :" + index + "Value "+ singleName);


        }
        /* Using foreach i java , iterate with element/actual value  */
        for(String element : names){
            System.out.println(element); 
        }
   
           /*Task 
            * Make an ArrayList animals
            ["cat", "TIger","Dog", "Elephant"]
            make two more ArrayList called, wildAnimal , domesticAnimal
            Loop the animals
            If the element/value is "cat", "Dog" add in domesticAnimal
            If the element/value is "Tiger", "Elephant " add in wildAnimal
            print domesticAnimal, wildAnimal
            */

            ArrayList <String> animals = new ArrayList<String>(Arrays.asList("Cat","Tiger","Dog","Elephant"));
                ArrayList<String> wildanimal = new ArrayList<>();
                ArrayList<String> domesticanimal = new ArrayList<>();
                for(String animal : animals) {
                    if(animal == "Cat" || animal == "Dog") {
                        domesticanimal.add(animal);
                }else{
                    wildanimal.add(animal);
                }
                System.out.println("wild animal"+ wildanimal);
                System.out.println("Domestic animal"+ domesticanimal);
                                                                         
 
            }

    }
    
}
