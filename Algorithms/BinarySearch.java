package Algorithms;

public class BinarySearch {
    public static void main (String[] args) {
        int[] myArray = {10, 20, 30, 40, 50};
        // Array has 5 elements
        System.out.println(itterBinarySearch(myArray, 35, 0, myArray.length-1));
    }
    public static boolean itterBinarySearch(int[] arr, int x, int low, int high) { 
        // arr is the array we are searching across, x is the value we are searching for
        /*
         * Checks dead centre of array: 30
         * 3 outcomes
         * 1. 30 was the number I was looking for
         * 2. 30 is less than that number - in that case, 30 becomes the low, if number is smaller,
         * 30 becomes the high, not the low
         * 3. 
         */
        int mid;
        while(low <= high) {
            mid = (high + low)/2;
            if (x == arr[mid]) {
                return true;
            }
            else if (x > arr[mid]) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return false;
        // if it exits the loop, than the value probably does not exist
    }
    public static boolean recursiveBinarySearch(int[] arr, int x, int low, int high) {
        int mid;
        if (low > high) {
            return false;
        }
        else {
            mid = (high + low)/2;
            if(x == arr[mid]) {
                return true;
            }
            else if(x > arr[mid]) {
                return recursiveBinarySearch(arr, x, mid + 1, high);
            }
            else {
                return recursiveBinarySearch(arr, x, low, mid - 1);
            }
    }
}
