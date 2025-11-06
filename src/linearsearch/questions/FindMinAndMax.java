package linearsearch.questions;

import java.util.Arrays;
import java.util.Random;

public class FindMinAndMax {
    public static void main(String[] args) {
        int n = 10;
        int[] arr = new int[n];
        Random random = new Random();
        for(int i=0;i<n;i++){
            arr[i] = random.nextInt(100);
        }
        int[] ans = findMinAndMax(arr);
        System.out.println("Array: " + Arrays.asList(arr));
        System.out.println("Min: " + ans[0] + "\nMax: " + ans[1]);
    }
    static int[] findMinAndMax(int[] arr){
        int min = arr[0];
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i] < min)
                min = arr[i];
            if(arr[i] > max)
                max = arr[i];
        }
        return new int[]{min, max};
    }
}
