package sortingAlgorithms.bubbleSort;

import java.util.Random;

public class BubbleSortGenral {
    public static void main(String[] args) {
        //int arr[] = {5, 1, 4, 2, 8};
        int arr[] = {5, 1, 4, 2, 8, 3, 7, 6, 10, 9, 15, 12, 11, 14, 13, 20, 18, 17, 16, 19};
        int ans[] = bubbleSort(arr);
        int enhancedAns[] = bubbleSortEnhanced(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(" " + ans[i] + " ");
        }
        System.out.println();
        for(int i=0;i<enhancedAns.length;i++){
            System.out.print(" " + enhancedAns[i] + " ");
        }
    }
    public static int[] bubbleSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length - i;j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    public static int[] bubbleSortEnhanced(int[] arr){
        for(int i=0;i<arr.length;i++){
            boolean isSwapped = false;
            for(int j=1;j<arr.length - i;j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    isSwapped = true;
                }
            }
            if(!isSwapped){
                break;
            }
        }
        return arr;
    }
}