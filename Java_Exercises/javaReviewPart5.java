public class javaReviewPart5 {
    public static void main(String[]args){
        
        /*
         * When we are programming, many times, we want to store multiple pieces of information into a single variable
         * 
         * An array is the simplest way of storing multiple values of THE SAME DATA TYPE in one location
         * 
         * Arrays have 3 properties
         * 1) Index - The integer values referencing the location of elements within the array
         * 2) Allocation - The size of the array
         * 3) Value - The values that are within an array
         * _ _ _ _ _ 
         * |_|_|_|_|_|
         * 0 1 2 3 4
         * 
         * The indexs of the array are the numbers below (start counting from 0)
         * The allocation is 5, meaning that there are 5 slots to fill
         * The elements are the values "stored" inside these boxes
         * 
         * In java, arrays are imutable, meaning you CAN NOT change the size of an array once it is declared.
         * Arrays are ORDERED data stuctures
         * You can only store one data type inside an array
         * Lastly, when you declare an array, the array is NOT blank/empty. 
         * Depending on the data type, the array will contain its respective default value
         * 
         * [] means array
         * int[] are filled with 0
         * double[] should also be filled with 0
         * boolean[] are filled with false
         * String[] are filled with null (This is also true for objects) null means empty, but does not mean empty space
         */

        // The first way of declaring an array is:
        /*
         * I will typically declare an array this way when I need to quickly create test data or I know that
         * this array is full of constants or I expect the array to never change on initializatoin. - Mr. Ho
         */

         
        //String x = null;
        //String y = "";
        String[] nameList = {"Deen", "Karun", "Param", "Himesh", "Arvindh"};
        //System.out.println(nameList);
        printStrArr(nameList);
        /*
         * The upgradeArray method passes an object(String[]) as its parameter
         * which means we are experiencing the pass by reference behaviour in java
         * 
         * What this means is that any changes done by the method to the array 
         * remain instead of being discarded like in the case of int, String, etc...
         * 
         * This is because Java is passing the memory address of the array to the
         * method instead of making a copy of the variable (which is what it would
         * do for int, Strings, etc...)
         */
        upgradeArray(nameList);
        printStrArr(nameList);
        
        /* 
        // Declaring an array without populating my own elements
        int MAX = 96;
        int[] numArray = new int[MAX];
        printIntArr(numArray);
        for(int i = 0; i < numArray.length; i++){
            numArray[i] = i;
        }
        printIntArr(numArray);
        */
    
    }
    public static void upgradeArray(String[] arr){
        for(int i = 0; i < arr.length; i++){
            arr[i] = "Sir " + arr[i];
        }
    }

        
    
    public static void printStrArr(String[] arr){
        for(int i = 0; i < arr.length; i++){
            // To call the element within an array, we use [] and put the index inside the brackets
            System.out.println(arr[i]);
        }
    }

    public static void printIntArr(int[] arr){
        // For each loops will iterate across a collection regardless of whether the collection is ordered
        /*
         * For Each Loop Syntax
         * for(dataType element: collection){
         *      execute code, where element changes based on the iteration
         * }
         */
        for (int num: arr){
            System.out.println(num);
        }
        /*
        for(int i = 0; i < arr.length; i++){
            // To call the element within an array, we use [] and put the index inside the brackets
            System.out.println(arr[i]);
        }
        */
    }

}
