public class JumpStatement {
    public static void main(String[] args) {
        /* break and continue are jump statment in java
         * break will terminate the loop*/
        for(int index = 0; index < 5; index++) {
            if(index == 3) {
                break;
       
    }System.out.println("Index " + index );
 
   
}/*Can be used on any loop */
    int count =0;
    while(count <=10) {
 
        if(count == 1) {
            break;
        }
        System.out.println("Count " + count);
        count++;
    }
    /* continue statement will skip the loop */
    for(int index =0; index <5; index++){
        if(index==3){
            continue;
        }
        System.out.println("continue index"+ index);
    }
    /*Task
     * WAP to run for loop from -5 to 5
     * break the loop if the index is positive
     *  
     * Task2
     * Loop from 1-20 using any loop 
     * only print the value if it is even
     * Use continue to do this task
     */
    }
}
