public class arraytwo {
        public static void main(String[] args) {
            /* 3 ways to create array */
            int[] arrayone;
            arrayone = new int[2];//->[0,0]
            int[]arraysecond = new int[2];// ->[0,0]
            int[] arraytwo = {1,2,4,5,10};//->(1,2,4,5,10)
            System.out.println(arraytwo[3]);  
            arraytwo[1] = 200;
            /*looping an array */
            int arraytwolength = arraytwo.length;
            for(int index = 0; index < arraytwolength; index ++){
                System.out.println("Index" + index + "Value" + arraytwo[index]);
     
            }
            /* or loop from <= arraytwolength */
            String [] names ={"Ram", "john","Shyam", "Doe"};
            String finder ="Shyam";
            /* find names and find the index of shyam */
            for(int index =0; index<names.length; index++){
                if (names [index]==finder){
                    System.out.println("Index found" + index);
                    break;
                  /* make a functiioo */
                  

                }
            }

    }
}

