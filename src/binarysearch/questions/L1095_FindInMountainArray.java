package binarysearch.questions;

class L1095_FindInMountainArray {

    public static void main(String[] args) {
        System.out.println(findInMountainArray(0, new int[]{1,5,2}));
    }

    public static int findInMountainArray(int target, int[] mountainArr) {
        int start = 0;
        int end = peakOfMountainArray(mountainArr);
        System.out.println("-----");
        int ans = binarySearch(target, mountainArr, start, end, true);
        if(ans != -1){
            return ans;
        }
        return binarySearch(target, mountainArr, end + 1, mountainArr.length - 1 , false);
    }
    public static int peakOfMountainArray(int[] mountainArr){
        int start = 0;
        int end = mountainArr.length - 1;
        int mid;
        while(start < end){
            System.out.println(start + " " + end);
            mid = start + (end - start) / 2;
            if(mountainArr[mid] > mountainArr[mid+1]){
                end = mid;
            }
            else if(mountainArr[mid] < mountainArr[mid+1]){
                start = mid + 1;
            }
        }
        return start;
    }
    public static int binarySearch(int target, int[] mountainArr, int start, int end, boolean isAscending){
        int mid;
        if(isAscending){
            while(start <= end){
                mid = start + (end - start) / 2;
                if(mountainArr[mid] < target){
                    start = mid + 1;
                }
                else if(target < mountainArr[mid]){
                    end = mid - 1;
                }
                else{
                    return mid;
                }
            }
        }
        else{
            while(start <= end){
                System.out.println("Start: " + start + " End: " + end);
                mid = start + (end - start) / 2;
                if(mountainArr[mid] > target){
                    start = mid + 1;
                }
                else if(target > mountainArr[mid]){
                    end = mid - 1;
                }
                else{
                    return mid;
                }
            }
        }
        return -1;
    }
}