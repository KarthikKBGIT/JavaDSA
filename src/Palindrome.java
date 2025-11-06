import java.util.ArrayList;
import java.util.Arrays;

public class Palindrome {
    public static void main(String[] args){
        System.out.println(isPalindrome("a"));
    }
    static boolean isPalindrome(String str){
        int start = 0, end = str.length() - 1;
        boolean ans = true;
        while(start<end){
            if(!(str.charAt(start) == str.charAt(end))){
                ans = false;
                break;
            }
            start++;
            end--;
        }
        return ans;
    }
}
