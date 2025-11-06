package linearsearch.questions;

import java.util.Arrays;
import java.util.Random;

public class SearchInRange {
    public static void main(String[] args) {
        int n = 10;
        int[] arr = new int[n];
        Random random = new Random();
        for(int i=0;i<n;i++){
            arr[i] = random.nextInt(100);
        }
        int target = random.nextInt(100);
        int ran = random.nextInt(n);
        int start = Math.min(ran, arr.length - ran);
        int end = Math.max(ran, arr.length - ran);
        if(searchInRange(arr, target, start, end)) System.out.printf(target + " is found in " + Arrays.toString(arr) + " within the index of " + start + " and " + end);
        else System.out.printf(target + " is not found in " + Arrays.toString(arr) + " within the index of " + start + " and " + end);
    }
    static boolean searchInRange(int[] arr, int target, int start, int end){
        if(arr == null || start>end || start > arr.length || end < arr.length) return false;
        for(int i=start;i<end;i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }
}
