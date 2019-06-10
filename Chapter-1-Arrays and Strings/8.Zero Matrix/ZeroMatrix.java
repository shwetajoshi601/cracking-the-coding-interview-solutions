import java.util.*;
public class ZeroMatrix {

    /**
     * Finds the rows and columns with a zero and sets them to 0
     */
    public static void setZeroes(int[][] matrix) {
        // for finding which rows and columns have 0
        boolean[] rows = new boolean[matrix.length];
        boolean[] cols = new boolean[matrix[0].length];
        
        // first find which rows and columns have a 0
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[0].length;j++) {
                if(matrix[i][j] == 0) {
                    // set the flag for the row and column
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }

        // iterate through rows and set the row to 0
        for(int i=0;i<rows.length;i++) {
            if(rows[i]) setRowToZero(matrix, i);
        }
        // iterate through cols and set the col to 0
        for(int j=0; j<cols.length;j++) {
            if(cols[j]) setColToZero(matrix, j);
        }
    }

    /**
     * Set the row passed as a parameter to 0
     */
    public static void setRowToZero(int[][] matrix, int row) {
        for(int j=0;j<matrix[0].length; j++) matrix[row][j] = 0;
    }

    /**
     * Set the col pssed as a parameter to 0
     */
    public static void setColToZero(int[][] matrix, int col) {
        for(int i=0;i<matrix.length; i++) matrix[i][col] = 0;
    }

    public static void printMatrix(int[][] matrix) {
        for(int i=0; i< matrix.length; i++) {
            for(int j=0; j< matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "   ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4}, {1,0,4,5}, {3,4,7,0}};
        System.out.println("Original matrix : ");
        printMatrix(matrix);
        setZeroes(matrix);
        System.out.println("Zero matrix : ");
        printMatrix(matrix);
    }
}