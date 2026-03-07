package sortingAlgorithms;

public class cyclicSort {

    public static void main(String[] args) {
        int arr[] = {3,5,2,1,4};
        cyclicSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void cyclicSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == i+1)
                continue;
            else{
                swap(arr, i, arr[i] - 1);
                i--;
            }
        }
    }
    static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
