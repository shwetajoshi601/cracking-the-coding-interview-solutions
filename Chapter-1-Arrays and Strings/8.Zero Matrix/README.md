# Problem Statement

Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column are set to 0.

## Points to remember

1. This problem may seems very easy. Just find the elements with 0 and set their rows and columns to 0. However, in the next pass you'll encounter the 0 again and eventually the entire matrix is set to 0. So, this is not the right solution.
2. We can maintain a list of rows and columns that contain a 0, since we only need to know the row and column, and then iterate the matrix to set the rows and columns to 0. This will need M+N additional space.
3. Once we have the lists, we can iterate through them to set the corresponding positions in the matrix to 0.

## Alternative solution
1. In the above solution, we use two additional arrays for storing the rows and columns that have zeroes.
2. We can optimize this usage by using the first row and the first column instead of two arrays.
3. Use two variables as flags for zeroes in the first row and first column. If the first row/col has a zero, set the flag to true.
4. Now iterate the matrix from the second row/col, if any position has a zero, set its corresponding row/col in the first row/col to 0. For example if matrix[2][3] = 0, matrix[2][0] = 0 and matrix[0][3] = 0
5. Set the rows and columns to 0 based on the values in the first row and column.
6. Finally, set the first row and column to zero if values in step 3 are true
This solution used only O(1) additional space