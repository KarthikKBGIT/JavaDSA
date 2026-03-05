package sortingAlgorithms.selectionSort;

public class SelectionSort {
    public static void main(String[] args){
        int arr[] = {64, 25, 12, 22, 11, 90, 45, 78, 23, 56, 89, 34, 67, 1, 9, 5};
        selectionSort(arr);
        System.out.println("Sorted array: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void selectionSort(int arr[]){
        for(int i=arr.length -1; i>=0;i--){
            int maxIndex = i;
            for(int j=0;j<i;j++){
                if(arr[j] > arr[maxIndex]){
                    maxIndex = j;
                }
            }
            swap(arr, maxIndex, i);
        }
    }
    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
