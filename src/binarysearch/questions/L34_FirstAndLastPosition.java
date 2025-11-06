package binarysearch.questions;

import java.util.Arrays;

public class L34_FirstAndLastPosition {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(searchRange(new int[]{5,7,7,7,7,8,8,8,8,8,9,9,9}, 8)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid;
        int[] ans = {-1,-1};
        while(start <= end){
            mid = start + (end - start) / 2;
            if(target <= nums[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        ans[0] = start;
        start=0;
        end=nums.length - 1;
        while(start <= end){
            mid = start + (end - start) / 2;
            if(target < nums[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        ans[1] = end;
        if(ans[0] <= ans[1]){
            return ans;
        }
        else{
            return new int[]{-1,-1};
        }
    }
}