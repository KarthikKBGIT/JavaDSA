package sortingAlgorithms.bubbleSort;

import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        //int arr[] = {5, 1, 4, 2, 8};
        int arr[] = {-1, -10, 5, 1, 4, 2, 8, 3, 7, 6, 10, 9, 15, 12, 11, 14, 13, 20, 18, 17, 16, 19, -20, -15, -12, -11, -14, -13, -20, -18, -17, -16, -19};
        int copuyOfArr[] = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            copuyOfArr[i] = arr[i];
        }
        int ans[] = bubbleSort(arr);
        int enhancedAns[] = bubbleSortEnhanced(copuyOfArr);
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
            // if there is no swapping in the inner loop then it means the array is already sorted and we can break the loop
            boolean isSwapped = false;
            for(int j=1;j<arr.length - i;j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    // if there is swapping then we need to continue the loop and check for the next element
                    isSwapped = true;
                }
            }
            // if there is no swapping in the inner loop then it means the array is already sorted and we can break the loop
            if(!isSwapped){
                break;
            }
        }
        return arr;
    }
}