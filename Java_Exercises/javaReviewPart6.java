import java.util.Scanner;
import java.util.InputMismatchException;

public class javaReviewPart6 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Type in a number");
        //int num = reader.nextInt();
        //System.out.println(num);
        // Try catch is a tool that can help validate exceptions
        
        /*
         * Code inside the "try" block is the section of code where we expect 
         * errors to potentially occur
         */

        /*
        try {
            // Block of code to try
            int num = reader.nextInt();
            System.out.println(num);
        }
        // If there is an error, the "catch" block with the associated error is ran
        catch(Exception e){ // Generic exception
            // Block of code to handle errors
            System.out.println("Please type in an integer");
        }
        */
    
    public static int Response1 (int x){
        if(response == 1){
            break;
        }

    }


        int[] numArray = {6, 8, 9, 5, -1};
        int response, arrayIndex;
        // Don't do this unless you are testing stuff

        /*
         * 1. Change Response 1 into a method
         * 2. Fix Response 1 to output different error messages based on potential errors
         * 3. Create the Response 2 method with try/catch
         */

        

        while(true){
            System.out.println("Type 1 to select element from array");
            System.out.println("Type 2 to change an element in the array");
            System.out.println("Type -1 to exit");
            response = reader.nextInt();

            //Exit condition first
            if(response == -1){ 
                break;
            }
            else if(response == 1){
                System.out.println("Which element did you want to print");
                try{
                    arrayIndex = reader.nextInt();
                    System.out.println("Element number " + arrayIndex + " is " + numArray[arrayIndex]);
                }
                catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("Index out of bounds");
                }
                catch(InputMismatchException e){
                    System.out.println("Input mismatch");
                }
                catch(Exception e){
                    System.out.println("This exception covers all other cases");
                }
            }
            else if(response == 2){
                continue;
            }
        }
        System.out.println("End of program");
        reader.close();

    }
}
