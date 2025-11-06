package linearsearch.questions;

import java.util.Random;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int n = 10;
        int[][] arr = new int[n][n];
        Random random = new Random();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = random.nextInt(100);
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(" " + arr[i][j] + " ");
            }
            System.out.println();
        }
        int target = random.nextInt(100);
        int[] ans = search(arr, target);
        if(ans[0] != -1) System.out.printf(target + " is found at Row=" + (ans[0] + 1) + " and Column=" + (ans[1] + 1));
        else System.out.printf(target + " is not found");
    }
    static int[] search(int[][] arr, int target){
        if(arr == null) return new int[]{-1,-1};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
