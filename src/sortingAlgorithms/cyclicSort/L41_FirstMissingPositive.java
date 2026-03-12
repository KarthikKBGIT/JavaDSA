package sortingAlgorithms.cyclicSort;

/*
41. First Missing Positive
Given an unsorted integer array nums, return the smallest missing positive integer.
Example 1:
Input: nums = [1,2,0]
Output: 3
Example 2:
Input: nums = [3,4,-1,1]
Output: 2
Example 3:
Input: nums = [7,8,9,11,12]
Output: 1
Constraints:
1 <= nums.length <= 5 * 105
-231 <= nums[i] <= 231 - 1
 */

public class L41_FirstMissingPositive {

    public static void main(String[] args) {
        int[] nums = {3,4,-1,1};
        System.out.println(new L41_FirstMissingPositive().firstMissingPositive(nums));
    }

    public int firstMissingPositive(int[] nums) {
        int i=0;
        while(i<nums.length){
            if(nums[i]>0 && nums[i]<nums.length && nums[i] != nums[nums[i] - 1]){
                swap(nums, i, nums[i] - 1);
            }
            else
                i++;
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                return j+1;
            }
        }
        return nums.length+1;
    }
    void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
