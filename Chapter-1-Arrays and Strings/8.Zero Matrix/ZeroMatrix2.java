import java.util.*;
public class ZeroMatrix2 {

    /**
     * Finds the rows and columns with a zero and sets them to 0
     */
    public static void setZeroes(int[][] matrix) {
        // flags to identify if first row and column has a zero
        boolean rowHasZero = false;
        boolean colHasZero = false;

        // check if the first row has zero
        for(int j=0; j<matrix[0].length;j++) {
            if(matrix[0][j] == 0) rowHasZero = true;
        }

        // check if the first column has zero
        for(int i=0;i<matrix.length;i++) {
            if(matrix[i][0] == 0) colHasZero = true;
        }

        // iterate through rest of the matrix to find zero positions
        for(int i=1;i<matrix.length;i++) {
            for(int j=1;j<matrix[0].length;j++) {
                if(matrix[i][j] == 0) {
                    // set the flag in the first row and column
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // iterate through the first row and set the values in the columns to 0
        for(int i=0;i<matrix[0].length;i++) {
            if(matrix[0][i] == 0) setColToZero(matrix, i);
        }

        // iterate through cols and set the col to 0
        for(int j=0; j<matrix.length;j++) {
            if(matrix[j][0] == 0) setRowToZero(matrix, j);
        }

        // now check if first row has zero and set the entire row to zero
        if(rowHasZero) setRowToZero(matrix, 0);
        // now check if first col has zero and set the entire col to zero
        if(colHasZero) setColToZero(matrix, 0);
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