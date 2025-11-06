package binarysearch.questions;

import java.util.Arrays;
import java.util.Random;

public class FindCeilingAndFloorOfSortedArray {
    public static void main(String[] args) {
        int n = 10;
        int[] arr = new int[n];
        Random random = new Random();
        int target = random.nextInt(100);
        for(int i=0;i<n;i++){
            arr[i] = random.nextInt(100);
        }
        arr = Arrays.stream(arr).sorted().toArray();
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("Target = " + target);
        //Ceiling: Greatest Element which is <= target
        //Floor: Smallest Element which is >= target
        int[] ans = findCeilingAndFloorOfSortedArray(arr,target);
        System.out.println("Ceiling: " + ans[0] + "\nFloor: " + ans[1]);
    }
    static int[] findCeilingAndFloorOfSortedArray(int[] arr, int target){
        int start=0, end=arr.length - 1;
        int mid;
        while(start<=end){
            System.out.println("Start: " + start + " End: " + end + " Target: "+target+" A[start]: "+arr[start]+" A[end]: "+arr[end]);
            mid = start + (end - start) / 2;
            if(arr[mid] == target)
                return new int[]{mid, mid};
            if(arr[mid] > target){
                end = mid -1;
            }
            else{
                start = mid + 1;
            }
        }
        return new int[]{arr[end], arr[start]};
    }
}
