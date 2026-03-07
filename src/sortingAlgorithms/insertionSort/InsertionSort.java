package sortingAlgorithms.insertionSort;

public class InsertionSort {
    public static void main(String[] args){
        int arr[] = {64, 25, 12, 22, 11, 90, 45, 78, 23, 56, 89, 34, 67, 1, 9, 5};
        insertionSort(arr);
        System.out.println("Sorted array: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void insertionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }
                else{
                    break;
                }
            }
        }
    }
    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
