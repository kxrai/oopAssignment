import java.util.Scanner;
// 09/13/22

public class javaReviewPart3 {
    public static void main(String[] args) {

        // Question 1
        /*
         * 1
         * 1 2
         * 1 2 3
         * 1 2 3 4
         * 1 2 3 4 5
         * 
         * Nested Loop For The Solution
         * 
         */

        /* 
        int max = 10;
        // int max = reader.nextInt();

        // Outer Loop (i loop)
        for (int i = 1; i <= max; i++) {
            // System.out.println(i);

            // This loop is a nested loop because it sits inside another loop
            // Inner Loop (j loop)
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        */


        // Question 2: Sum of numbers from 1 to n

        /* 
        int n = 10;
        
        // Define our accumulator outside of our loop
        int total = 0;


        for (int i = 1; i <= n; i++){
            // System.out.println("i: " + i);
            // total = total + i;
            total += i;
            // System.out.println("total: " + total);
        }
        System.out.println("The sum of numbers from 1 to "+n+" is "+ total);
        */

        // Question 3

        /*
         * For Each Loop in Java
         * for(dataType variableName: collection) {
         *      variableName becomes "each" consecutive element within the collection
         * }
         */
        

         /* 
         String word = "computer";
         // Turns out, strings are not itterable in Java.... we'll do this with arrays later
         for(char letter: word) {
            System.out.println(letter);
         }
         */

         // While Loops in Java
         int count = 10;
         while (count > 0) {

            // Exit condition at the top
            if (count == 5) {
                // continue will immediately move the loop to the next iteration
                continue;
            }

            // Some exception we randomly created
            if (count == 3) {
                // break will terminate the loop at the exact location
                break;
            }

            // Execute this code if neither jump statement executes
            System.out.println(count);

            // Make sure the condition can change so the loop can exit
            count--;

         }

    }  
}  

  