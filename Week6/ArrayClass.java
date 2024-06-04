public class ArrayClass {

    public static void main(String[] args) {
        /*To create an array define database fllowed by */
        int [] myfirstArray;
        /* Initialize the array we need new refrence  */
        myfirstArray = new int[6]; //Here the new int [6]-> reffers to the size of array 
        /*The size of an arraycan be further access by length */
        int myfirstArrayLength = myfirstArray.length;
        System.out.println("My first array size is"+myfirstArrayLength);

        /* Using index for array operation  */
        myfirstArray[0]=10;
        myfirstArray[1]=30;
        myfirstArray[2]=100;

        /*To print the array use the same index */
        System.out.println("the first element is in 0 index "+ myfirstArray[0]);
        /*can also create a new int valmyue */
        int secondArrayIndex = myfirstArray[1];
        System.out.println("The second element stored "+ secondArrayIndex);

        /* Declaration and initialization and value assign */
        int[] mySecondArray = new int[6];

        /*Declaration , initialization and value assign */
        int[]myThirdArray ={10,20,30,0,100};
        /* Or using constructor */
        int[]myFourthArray = new int[]{1 , 2, 3, 4};


        /*Task
         * create  a array of int called myFifth array
         * with size if 5
         * insert the value if 10,20,30,40,50
         * print the value of an array as well as the multiplication by 2
         * Eg:
         * 10 20
         * 20 40
         * 30 60 
         * 40 80
         * 50 100
         */
        int[] myFifthArray;
        myFifthArray =new int[5];
        myFifthArray[0]=10;
        myFifthArray[1]=20;
        myFifthArray[2]=30;
        myFifthArray[3]=40;
        myFifthArray[4]=50;
        System.out.println(myFifthArray[0] +" " + myFifthArray[0] * 2 );
        System.out.println(myFifthArray[1] +" " + myFifthArray[1] * 2 );
        System.out.println(myFifthArray[2] +" " + myFifthArray[2] * 2 );
        System.out.println(myFifthArray[3] +" " + myFifthArray[3] * 2 );
        System.out.println(myFifthArray[4] +" " + myFifthArray[4] * 2 );
        System.out.println("my first coding languages is python python is the most popular language in the world  ");


            
                
        

    }
}