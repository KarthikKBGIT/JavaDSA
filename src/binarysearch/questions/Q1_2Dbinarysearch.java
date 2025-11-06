package binarysearch.questions;

/*
Let's consider a 2D matrix where each row and each column is sorted in ascending order.
Write an efficient algorithm that searches for a target value in this matrix. The algorithm should return the
row and column indices of the target if found, or (-1, -1) if the target is not present in the matrix.

For example, consider the following matrix:
10 20 30 40
15 25 35 45
17 26 37 48
19 27 39 50
Target: 37
Output: (2, 2)  // since matrix[2][2] = 37

Algorithm:
1. Start from the top-right corner of the matrix (row = 0, column = n-1).
2. While the current position is within the bounds of the matrix:
   a. If the current element equals the target, return its indices (row, column).
        Diagram:
        [ 10, 20, 30, 40 ]
        [ 15, 25, 35, 45 ]
        [ 17, 26, 37, 48 ]  <- Target found here (2,2)
        [ 19, 27, 39, 50 ]
   b. If the current element is less than the target, move down to the next row (row++).
        Diagram:
        [ 10, 20, 30, 40 ]
        [ 15, 25, 35, 45 ]
        [ 17, 26, 37, 48 ]
        [ 19, 27, 39, 50 ]  <- Move down to next row
   c. If the current element is greater than the target, move left to the previous column (column--).
        Diagram:
        [ 10, 20, 30, 40 ]
        [ 15, 25, 35, 45 ]
        [ 17, 26, 37, 48 ]
        [ 19, 27, 39, 50 ]  <- Move left to previous column
3. If the target is not found, return (-1, -1).
 */

import java.util.Arrays;

public class Q1_2Dbinarysearch {

    public static void main(String[] args) {
        int[][] matrix = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {17, 26, 37, 48},
            {19, 27, 39, 50}
        };
        int target = 37;
        System.out.println(Arrays.toString(searchMatrix(matrix, target)));
    }

    static int[] searchMatrix(int[][] matrix, int target){
        int row = 0;
        int column = matrix.length - 1;
        while(row < matrix.length && column > 0){
            if(matrix[row][column] == target) {
                return new int[]{row, column};
            }
            else if (matrix[row][column] < target){
                row++;
            }
            else{
                column--;
            }
        }
        return new int[]{-1, -1};
    }

}
