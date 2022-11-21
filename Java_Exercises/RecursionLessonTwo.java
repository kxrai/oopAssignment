public class RecursionLessonTwo {
    public static void main(String[] args) {
        //recursivePrint(5);
        //System.out.println(rFib(8));
        //System.out.println(recursiveHa(5));
        recursiveThrees(12345678);
    }
    /*
     * Write a recursive method that beraks and prints a
     * large number into groups of 3 digits.
     * Ex. 12345678 would be outputted as 12, 345, 678
     */
    public static void recursiveThrees(int n) {
        String num = Integer.toString(n);
        if (num.length() <= 3) {
            System.out.print(num);
        }
        else {
            recursiveThrees(num.substring(0, num));
            System.out.println("," + num.substring(num.length()-4, num.length()-1));
            
        }


    }
    public static String recursiveHa(int n) {
         // Base Case
         if (n == 1) {
            return "Ha";
        }
        return "Ha " + recursiveHa (n - 1);
    }
    public static void recursiveVoidHa(int n) {
        // Base Case
        if (n == 1) {
            System.out.print("Ha");
        }
        else {
            System.out.print("Ha ");
            recursiveHa(n - 1);
        }
    }
    /*
     * Print a series of numbers with recursive Java methods
     * Assume we count down
     */
    public static void recursivePrint(int num) {
        // Base case first
        // If statement is exit condition, if it does't exit, it will have to keep repeating
        // If this is not true, there will always be an else statement to run
        if(num <= 1) {
            System.out.println(num);
        }
        // Recursive Case(s) below
        else {
            //System.out.println(num);
            recursivePrint(num - 1);
            System.out.println(num);
            // Change the order it prints by switchitng the System.out.println(num); 
            // eg. 5 4 3 2 1 --> 1 2 3 4 5 with println on bottom
        }
    }
    /*
     * Sum a series of numbers with Java recursion
     */
    public static int recursiveSum(int n) {
        // Base Case
        if(n < 0) {
            return -1;
        }
        if(n == 0) {
            return 0;
        }
        // Recursive Cases
        return n + recursiveSum(n - 1);
    }
    /*
     * Print the Fibnoacci series with Java and recursion
     */
    public static int rFib(int n) {
        // Base Case
        if(n == 1 || n == 2) {
            return 1;
        }

        // Recursive Cases
        else {
            return rFib(n - 1) + rFib(n - 2);
        }
    }
}
