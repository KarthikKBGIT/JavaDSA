package recursion.basicRecursionProblems;

public class SumOfFirstNNumbers {

    public static void main(String[] args){
        System.out.println(sum(19));
        System.out.println(parameterizedSum(19, 0));
    }

    static int sum(int n){
        if(n==1)
            return 1;
        return n + sum(n - 1);
    }

    static int parameterizedSum(int i, int sum){
        if(i==0){
            return sum;
        }
        return parameterizedSum(i-1, sum + i);
    }

}
