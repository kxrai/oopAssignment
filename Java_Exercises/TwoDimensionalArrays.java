public class TwoDimensionalArrays {
    public static void main(String[] args){
        // Pre-set 2D Array
        // Referencing elements in a 2d array require a set of two numbers
        // Think row, then column, OR x, then y
        String[][] stringArray = {
            {"one", "two", "three"},
            {"FOUR", "FIVE", "SIX"},
            {"seven", "eight", "nine", "ten"},
        };
        System.out.println(stringArray[1][2]);

        /*
         * This prints the 2D array row by row, from left to right
         */
        // loops across the rows of the 2D Array
        for(int i = 0; i < stringArray.length; i++){
            System.out.println(stringArray[i]);
            System.out.println("Printing row " + i);
            // loops across the columns of a single row
            for(int j = 0; j < stringArray[i].length; j++){
                System.out.println(stringArray[i][j]);
            }
        }
        /*
         * Here, we will print the 2D array column by column, left to right
         * This example assumes that all rows are the same length
         */

         // stringArray[0] is the length of the first row
        for(int i = 0; i < stringArray[0].length; i++){
            // stringArray.length represents the number of rows we need to iterate across
            for(int j = 0; j < stringArray.length; j++){
                // i stays fixed for this iteration, so this means the column number is fixed
                // and we are moving down the rows
                System.out.print(stringArray[j][i]);
                
            }
            System.out.println();
            
        }
        // Dynamically define a 2d array
    }

    public static void printTwoDColumn(String[][] arr){
        // Search for the longest row
        int MAX = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i].length > MAX){
                MAX = arr[i].length;
            }
        }

        // Prints the array by columns
        for(int i = 0; i < MAX; i++){
            // stringArray.length represents the number of rows we need to iterate across
            for(int j = 0; j < arr.length; j++){
                if(arr[j].length > i){
                    System.out.print(arr[j][i]);
                }
                // i stays fixed for this iteration, so this means the column number is fixed
                // and we are moving down the rows
                // System.out.print(arr[j][i]);
                
            }
            System.out.println();
            
        }
    }
}

