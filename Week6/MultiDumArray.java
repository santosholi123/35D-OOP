public class MultiDumArray {
    public static void main(String[] args) {
        /* create N-dimension  array add number of square bracket  */
        /* 1D Array */
        int [] oneDarray;
        /*2D Array  */
      int [] [] twoDarray;
       /*3D Array  */
       int [] [] [] threeDarray;

       /*Allocating memory / size  */
       twoDarray = new int [3] [5];
       /*First size 3 represent how many inner array  */
       /*second size 5 represent how many value in inner array  */
       /*[
        [0,0,0,0,0], ->0
        [0,0,0,0,0], ->1
        [0,0,0,0,0]  ->2
       ] */
       /* to take the first inner array use index  */
        twoDarray [0] ;
       /*to take the value in first inner array use internal index */
       twoDarray [0] [0]=10;
       twoDarray [0] [1]=20;
       twoDarray [1] [2]=100;
       twoDarray [2] [4]=200;

       /* Task
        * fill the array like this following 
        [
            [10, 20, 30,40 ,40, 50], ->0
            [80, 90, 100, 110, 120], ->1
            [150, 160, 170, 180,200] ->2
        ]
        */
        /* Now print the 1th  index  array like
         * 80
         * 90
         * 100
         * 110
         * 120
         * Note: without using loop
         */           
  }  
}
