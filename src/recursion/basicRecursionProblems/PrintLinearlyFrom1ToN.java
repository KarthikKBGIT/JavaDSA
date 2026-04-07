package recursion.basicRecursionProblems;

public class PrintLinearlyFrom1ToN {

    public static void main(String[] arges) {
        int n = 5;
        printLinearlyFrom1ToN(n);
    }

    static void printLinearlyFrom1ToN(int n){
        if(n==0)
            return;
        printLinearlyFrom1ToN(n-1);
        System.out.println(n);
    }

}
