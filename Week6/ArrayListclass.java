import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListclass {
    public static void main(String[] args) {
        /* To use ArrayList import at the top like Scanner from java.utils) */
        ArrayList<String> animals = new ArrayList<>();
        /* size is automaticlly allocated according to the element  */
        /* To the add data in animals */
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Elephant");
        System.out.println(animals);
        /* Can add element directly to index , it will shift rest to + 1 of index  */
        animals.add(1, "Tiger");
        System.out.println(animals);
        /* Notice how the previous 1 and rest are shifted by 1 index */

        /* To remove use .remove(index) */
        animals.remove(2);
        System.out.println(animals);
        /* It will remove the item/element in 2nd index */

        //To update .set (index, value )
        animals.set(1, "snake");
        System.out.println(animals);
        /* to access cannot use [index] -> square bracket, use .get(index) */
        System.out.println(animals.get(0)); //get 0th indexed element

        /* Task 
         * make an arrayList of int
         * [100, 200, 300, 400, 500]
         * remove the value 300
         * Add -100 at the first of Array list 
         * Change 200 -> 210
         * Change 400 -> 420
         * print the array list 
         */
        ArrayList<Integer> intArrayList= new ArrayList<>();
        Arrays.asList(100,200,300,400,500);
        // intList.add(100);
        // intList.add(200);
        // intList.add(300);
        // intList.add(400);
        // intList.add(500);


        intArrayList.remove(2);
        intArrayList.add(0,-100);
        intArrayList.set(1,210);
        intArrayList.set(3,420);
        System.out.println(intArrayList);

       }
    
}
