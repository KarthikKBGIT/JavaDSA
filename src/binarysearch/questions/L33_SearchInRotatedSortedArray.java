package binarysearch.questions;

public class L33_SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,1,2};
        int target = 5;
        System.out.println("Ans = " + searchPeakInRotatedSortedArray(arr));
        System.out.println(target + " is at = " + searchInRotatedSortedArray(arr, target));
        System.out.println("Rotation count = " + findRotationCountInRotatedSortedArray(new int[]{15, 18, 2, 3, 6, 12}));
    }
    public static int searchPeakInRotatedSortedArray(int[] arr){
        int start = 0;
        int end = arr.length;
        int mid;
        while(start <= end){
            mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1]){
                return mid;
            }
            else if(arr[mid] < arr[mid - 1]){
                return mid -1;
            }
            if(arr[start] > arr[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
    public static int searchInRotatedSortedArray(int[] arr, int target){
        int peak = searchPeakInRotatedSortedArray(arr);
        int start = 0;
        int end = arr.length;
        if(arr[start] <= target && target <= arr[peak]){
            return binarySearch(arr, start, peak, target);
        }
        else{
            return  binarySearch(arr, peak + 1, end, target);
        }
    }
    public static int binarySearch(int[] arr, int start, int end, int target){
        int mid;
        while(start < end){
            mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid;
            }
        }
        return -1;
    }
    public static int findRotationCountInRotatedSortedArray(int arr[]){
        return searchPeakInRotatedSortedArray(arr) + 1;
    }
}
