package binarysearch.questions;

import java.util.Arrays;
import java.util.Random;

public class FindElementInINFINITEArray {
    public static void main(String[] args) {
        /*
            Assume that Sorted Array is infinite
            Which means we should not use arr.length that's it
            Without using arr.length we can take a chunk of array and until start<target<end (since its sorted)
         */
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
        int start=0, end = 1;
        while(arr[end] < target){
            start = end + 1;
            if(end*2 < arr.length) { // this arr.length we are using to avoid index out of bound since we can test only with finite array. for infite array its not required.
                end = end * 2;
            }
            else{
                end = arr.length;
                break;
            }
        }
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
