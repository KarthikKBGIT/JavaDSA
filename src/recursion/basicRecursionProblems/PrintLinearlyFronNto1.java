package recursion.basicRecursionProblems;

public class PrintLinearlyFronNto1 {

    public static void main(String[] arges) {
        int n = 5;
        printLinearlyFromNTo1(n);
    }

    static void printLinearlyFromNTo1(int n){
        if(n==0)
            return;
        System.out.println(n);
        printLinearlyFromNTo1(n-1);
    }
}
