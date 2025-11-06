package linearsearch.questions;

import java.util.Random;

public class EvenNoOfDigits {
    public static void main(String[] args) {
        int n = 10;
        int[] arr = new int[n];
        Random random = new Random();
        for(int i=0;i<n;i++){
            arr[i] = random.nextInt(10000);
        }
        for(int i=0;i<n;i++){
            System.out.print(" " + arr[i] + " ");
        }
        System.out.println();
        System.out.println(findNumbers(arr));
    }
    public static int findNumbers(int[] nums) {
        int ans=0;
        for(int num : nums){
            if(isEvenNoOfDigits(num)){
                ans++;
            }
        }
        return ans;
    }
    public static boolean isEvenNoOfDigits(int number){
        int n=0;
        while(number > 0){
            n++;
            number /= 10;
        }
        return n%2==0;
    }
}