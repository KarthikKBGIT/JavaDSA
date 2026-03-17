package sortingAlgorithms.countSort;

public class CountSort {

    public static void main(String[] args){
        int arr[] = {4, 2, 2, 8, 3, 3, 1, 0, 5, 7, 6, 9, 8, 1, 2, 3};
        countSort(arr);
        System.out.println("Sorted array: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void countSort(int[] arr){
        int maxValue = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i] > maxValue)
                maxValue = arr[i];
        }

        int countArray[] = new int[maxValue + 1];

        for(int i=0;i<arr.length;i++){
            int index = arr[i];
            countArray[index] += 1;
        }
        int k=0;
        for(int i=0;i<countArray.length;i++){
            if(countArray[i] > 0){
                for(int j=0;j<countArray[i];j++){
                    arr[k] = i;
                    k++;
                }
            }
        }
    }

}
