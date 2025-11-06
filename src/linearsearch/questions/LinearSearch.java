package linearsearch.questions;

import java.util.Scanner;

//Simple Linear Search
public class LinearSearch {
    public static void main(String[] args){
        int target;
        Scanner sc = new Scanner(System.in);
        target = sc.nextInt();
        System.out.println(linearSearch(new int[]{9,30,9,2,5,3,4}, target));
    }
    static int linearSearch(int[] arr, int target){
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
