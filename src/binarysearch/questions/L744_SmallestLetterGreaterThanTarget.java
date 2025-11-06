package binarysearch.questions;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class L744_SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'd';
        System.out.println(nextGreatestLetter(letters, target));
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        int mid;
        while(start <= end){
            mid = (start + end) / 2;
            if(letters[mid] > target){
                end = mid -1;
            }
            else if(letters[mid] < target){
                start = mid + 1;
            }
            else if(letters[mid] == target && mid != letters.length -1){
                if(letters[mid+1] == target){
                    start = end = mid + 1;
                }
                else{
                    return letters[mid+1];
                }
            }
            else{
                return letters[0];
            }
        }
        if(start > letters.length -1){
            return letters[0];
        }
        else{
            return letters[start];
        }
    }
}