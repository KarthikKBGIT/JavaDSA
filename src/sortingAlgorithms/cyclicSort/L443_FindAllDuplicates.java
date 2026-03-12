package sortingAlgorithms.cyclicSort;

import java.util.ArrayList;
import java.util.List;

/*
442. Find All Duplicates in an Array
Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears once or twice, return an array of all the integers that
appears twice.
Example 1:
Input: nums = [4,3,2,7,8,2,3,1]
Output: [2,3]
Example 2:
Input: nums = [1,1,2]
Output: [1]
Example 3:
Input: nums = [1]
Output: []
Constraints:
n == nums.length
1 <= n <= 105
1 <= nums[i] <= n
Each element in nums appears once or twice.
 */

public class L443_FindAllDuplicates {

    static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(arr));
    }

    static List<Integer> findDuplicates(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        for(int i=0;i<arr.length;){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct])
                swap(arr, i, correct);
            else
                i++;
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j] != j+1){
                answer.add(arr[j]);
            }
        }
        return answer;
    }
    static void swap(int[] arr, int i, int j){
        arr[j] = arr[i] + arr[j];
        arr[i] = arr[j] - arr[i];
        arr[j] = arr[j] - arr[i];
    }

}