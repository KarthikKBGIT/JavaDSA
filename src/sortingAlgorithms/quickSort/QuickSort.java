package sortingAlgorithms.quickSort;

public class QuickSort {

    public static void main(String[] args){
        int arr[] = {64, 25, 12, 22, 11, 90, 45, 78, 23, 56, 89, 34, 67, 1, 9, 5};
        quickSort(arr, 0, arr.length-1);
        System.out.println("Sorted array: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    static void quickSort(int arr[], int low, int high){

        if(low >= high)
            return;

        int start = low;
        int end = high;

        int mid = low + (high - low) / 2;
        int pivot = arr[mid];

        while(start <= end){
            while(arr[start] < pivot){
                start++;
            }
            while(arr[end] > pivot){
                end--;
            }
            if(start <= end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        // after the above loop low will be at the position where the pivot element should be and high will be at the position where the pivot element should be
        // so we need to recursively call the quickSort function for the left and right subarrays
        quickSort(arr, low, end);
        quickSort(arr, start, high);

    }
}
