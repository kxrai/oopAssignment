public class TwoDArray3 {
    public static void print2DArray(int[][] arr){
        for(int [] row: arr){
            for(int i: row){
                System.out.println(i + " ");
            }
            System.out.println();
        }
    }
    public static int maxRowLength(int[][] arr){
        int max = 0;
        for(int[] row:arr){
            if (max < row.length){
                max = row.length;
            }
        }
        return max;
    }
    public static int[] newTransposedRow(int[][] arr, int col){
        int max = arr.length;
        int[] row = new int[max];
        for(int i = 0; i < max; i++){
            row[i] = arr[i][col];
        }
        return row;
    }
    public static int[][] transposeArray(int[][] arr){
        int arraySize = maxRowLength(arr);
        int[][] newArray = new int[arraySize][];

        for(int i = 0; i < arraySize; i++){
            newArray[i] = newTransposedRow(arr, 1);
        }
        return newArray;
    }

    public static void main(String[] args){
        int[][] numArr = {

        }
    } 
}
