package binarysearch.questions;

import java.util.Arrays;
import java.util.Random;

public class BinarySearch {
    public static void main(String[] args) {
        int n = 100;
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
        System.out.println();
        System.out.println("Target " + target);
        System.out.println(binarySearch(arr, target));
    }
    public static int binarySearch(int[] arr, int target){
        int start=0, end=arr.length - 1;
        int mid;
        while(start<=end){
            System.out.println("Start = " + start);
            System.out.println("End = " + end);
            //mid = (start + end)/2; // This might throw error if (start + end) value exceeds the range of integer in JAVA
            mid = start + (end - start) / 2; //Better way to find mid value.
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
                end = mid - 1;
            }
            else if(arr[mid]<target){
                start = mid + 1;
            }
        }
        return -1;
    }
}
