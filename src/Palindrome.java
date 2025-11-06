import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isPalindrome(str));
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
