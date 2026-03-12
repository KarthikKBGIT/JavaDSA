package sortingAlgorithms.cyclicSort;

/*
287. Find the Duplicate Number
Given an array of integers nums containing n + 1 integers where each integer is in the range
    [1, n] inclusive, there is only one repeated number in nums, return this repeated number.
Example 1:
Input: nums = [1,3,4,2,2]
Output: 2
Example 2:
Input: nums = [3,1,3,4,2]
Output: 3
Example 3:
Input: nums = [1,1]
Output: 1
Example 4:
Input: nums = [1,1,2]
Output: 1
Constraints:
2 <= n <= 3 * 104
 */

public class L287_DuplicateNumber {

    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2,2,2,4,5};
        System.out.println(findDuplicate(nums));
    }
    static int findDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums, i, nums[i] - 1);
            }
            else{
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j] != j+1){
                return nums[j];
            }
        }
        return -1;
    }
    static void swap(int[] nums, int i, int j){
        nums[j] = nums[i] + nums[j];
        nums[i] = nums[j] - nums[i];
        nums[j] = nums[j] - nums[i];
    }
}

