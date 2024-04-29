public class Forloop {
    public static void main(String[] args) {
    //     /* Use for loop when condition is fixed */
    //     for(int index = 0; index < 5; index ++){
    //         System.out.println("Loop running "+ index);
    //     }
    //     /* Decrement loop */
    //     for ( int index = 10; index>=0; index --){
    //         System.out.println("Loop running " + index);
    //     }
        /* Make the loop table for this  */
         

        /* Task
         * Make a multiplication table of 2
         * print like the following
         * 2 x 1 =2
         * 2 x 2 =4
         * .
         * .
         * 2 x 10 =20
         * Note: initialize 1
         * condition <=10 or < 11
         * Increament ++
         * 
         */
        // for (int i=1; i<=10; i++){
        //     System.out.println("2 x " + i +"="+2*i);
        // }
        // for (int i=1; i<=10; i++ ){
        //     System.out.println("3 x " + i + "=" + 3*i);
        // }
        // /* Nested loop */
        // for ( int outer =0; outer < 3; outer ++){
        //     for ( int inner = 2; inner >= 0; inner --){
        //         System.out.println("Inner" + inner);

        //     }
        //     System.out.println("Outer" + outer);
        // }
        /*Task
         * Make multiplication table from 1 - 10
         * eg:
         * Multiplication of 1
         * 1 x 1 =1
         * 2 x2 =2
         * .
         * .
         * 1x 10 =10
         * .
         * .
         * Multiplication of 10
         *  10x 1 =10
         * 10 x 2 =20
         * .
         * 10 x 10 =100
         */
        for (int i=1; i<=10; i++){
            for (int j=1; j<=10; j++){
                System.out.println(i + "x" + j + "=" + j*i);
            }
        }
    }  
}    
