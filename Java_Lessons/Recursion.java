package Java_Lessons;

public class Recursion {

    public static void main(String[] args) {
        //printNums(10);
        recursivePrint(10);
    }
    public static void printNums(int x) {
        for(int i = 1; i <= x; i++) {
            System.out.println(i);
        }
    }
    public static void recursivePrint(int x) {
        // base case: This is the last execution of the recursive print
        // The base case MUST BE AT THE TOP
        if (x <= 1) {
            System.out.println(x);
        }
        else {
            System.out.println(x);
            recursivePrint(x - 1);
        }
    }
    public static int factorial(int n) {
        // base case
        if (n == 1) {
            return 1;
        }
        else {
            return n * factorial(n - 1);
        }
    }
}
