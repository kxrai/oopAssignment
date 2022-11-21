// Scanner package
import java.util.Scanner;

class javaReviewPart2 {
    public static void main(String[] args) {

        /*
         * a > b : a greater than b
         * a > b : a less than b
         * a >= b : a is greater than or equal to b
         * a <= b : a is less than or equal to b
         * a == b : a is exactly equal to b
         * a != b : a is NOT equal to b
         */

        // Setting up Scanner: Initialize a scanner object meant to take in the user input

        Scanner reader = new Scanner(System.in);
        
        /*
        System.out.println("Enter your name");

        // x = input("Type something")
        // This takes in the user input (String)
        String name = reader.nextLine();
        System.out.println("Greetings " + name);
        */

        /* 
        System.out.println("Enter a number");

        // This takes in the user input (int)
        int num1 = reader.nextInt();
        int num2 = reader.nextInt();

        System.out.println("Your first number is " + num1);
        System.out.println("Your second number is " + num2);

        System.out.println(num1 > num2);
        */

        /*
         * if(condition) {
         *      execute code when condition is true;
         * }
         * 
         * else if(condition) {
         *      execute code if the previous if statement did not execute AND the condition is true
         * }
         * 
         * else {
         *      execute code when no other if/else-if statements above it are executed
         * }
         * 
         */

        
        /* 
        if (num1 > num2) {
            System.out.println("Your first number is greater than your second number");
        }

        else if (num1 == num2) {
            System.out.println("The numbers are the same");
        }

        else {
            System.out.println("Your first number is less than your second number");
        }
        */

        //System.out.println("Hello World");

        /* 
        System.out.println("What is the best pizza?");
        String pizza = reader.nextLine();
        String bestPizza = "Hawaiian"

        // Strings must be compared using .equals() method
        if(pizza.equals(bestPizza)) {
            System.out.println("That is correct");
        }

        // Check if the pizza is NOT meat lovers (Just place exclamation mark ! in front of the variable name)
        // Avoid hard coding values into your if statements like in the example below
        else if(!pizza.equals("meat lovers")) {
            System.out.println("Why not meat lovers?");
        }
        */

        /*
         * For loops in Java is also called a counted loop
         * This is because a for loop has a counter built inside itself
         * 
         * int = 0 is where we declare the counter and set its intial value
         * i < 100 is the condition in which the for loop will continue up to 
         * i++ increase the counter (i) by 1 every iteration (repeat)
         */

        for(int i = 0; i < 100; i++) {
            System.out.println(i);
        }

        reader.close();

    }
    
}
