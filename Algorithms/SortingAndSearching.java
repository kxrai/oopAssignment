package Algorithms;

public class SortingAndSearching {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        /*
         * Searches int[] arr for specific number
         * Goes through each index until n appears
         * If number appears, returns true, otherwise, false
         */
        
        System.out.println(searchForInt(arr, 6));
    }
    // Find the max value inside the array
    public static int maxValueOfArray(int[] numArr) {
        int max = numArr[0];
        for(int i = 0; i < numArr.length; i++) {
            if (max < numArr[i]) {
                max = numArr[i];
            }
        }
        return max;
    }
    // Linear Search
    // Find wether a number exists in the array
    // Find the max value inside the array

    public static boolean searchForInt(int[] numArr, int n) {
        // Search Array for whether the value n exists in array
        // Checking to see if a specific number exists inside the array
        for(int i = 0; i < numArr.length; i++) {
            if(numArr[i] == n) {
                return true;
            }
        }
        // if it fails to find the number, it returns false
        // why is it linear? because 1, it will go through the array, and the time is linear
        return false;
    }
}

/*
 * Binary Search
 * 
 */