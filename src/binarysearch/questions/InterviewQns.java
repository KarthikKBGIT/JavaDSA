package binarysearch.questions;

import java.util.ArrayList;
import java.util.List;

public class InterviewQns {
    public static void main(String[] args) {
        /*
            Find the Longest Substring with Unique Characters
            Given a string, find the length of the longest substring that contains all unique characters.

            Example:

            Input: "abcabcbb"
            Output: 3
            Explanation: The answer is "abc", with a length of 3.
        */
        String input = "abcabcbb";
        List<Character> list = new ArrayList<>();
        for(int i=0;i<input.length();i++){
            if(!list.contains(input.charAt(i))){
                list.add(input.charAt(i));
            }
            else{
                list.clear();
                list.add(input.charAt(i));
            }
        }
        System.out.println(list.size());
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
