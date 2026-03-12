package sortingAlgorithms.cyclicSort;

/*
645. Set Mismatch
You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in s,
which results in repetition of one number and loss of another number. You are given an integer
array nums representing the data status of this set after the error. Find the number that occurs twice and the number that is missing and return them in the form of an array.
Example 1:
Input: nums = [1,2,2,4]
Output: [2,3]
Example 2:
Input: nums = [1,1]
Output: [1,2]
Constraints:
2 <= nums.length <= 104
1 <= nums[i] <= 104
 */

public class L645_SetMismatch {

    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        int[] answer = new L645_SetMismatch().findErrorNums(arr);
        for(int i=0;i<answer.length;i++){
            System.out.print(answer[i] + " ");
        }
    }

    public int[] findErrorNums(int[] arr) {
        int index = 0;
        int[] answer = new int[2];
        while(index < arr.length){
            if(arr[index] != arr[arr[index] - 1])
                swap(arr, index, arr[index] - 1);
            else
                index++;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i] != i+1){
                answer = new int[]{arr[i], i+1};
            }
        }
        return answer;
    }
    void swap(int[] arr, int i, int j){
        arr[j] = arr[i] + arr[j];
        arr[i] = arr[j] - arr[i];
        arr[j] = arr[j] - arr[i];
    }

}
