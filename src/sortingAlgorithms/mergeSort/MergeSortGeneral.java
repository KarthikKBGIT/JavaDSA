package sortingAlgorithms.mergeSort;

import java.util.Arrays;

public class MergeSortGeneral {

    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        int[] sortedArr = mergeSort(arr);
        for (int num : sortedArr) {
            System.out.print(num + " ");
        }
    }

    static int[] mergeSort(int[] arr){
        if(arr.length == 1)
            return arr;

        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    static int[] merge(int[] left, int[] right){
        int[] mergedArray = new int[left.length + right.length];
        int i=0, j=0, k=0;

        while(i<left.length && j<right.length){
            if(left[i] < right[j]){
                mergedArray[k] = left[i];
                i++;
                k++;
            }
            else{
                mergedArray[k] = right[j];
                j++;
                k++;
            }
        }

        while(i< left.length){
            mergedArray[k] = left[i];
            i++;
            k++;
        }

        while (j<right.length){
            mergedArray[k] = right[j];
            j++;
            k++;
        }
        return mergedArray;
    }

}
