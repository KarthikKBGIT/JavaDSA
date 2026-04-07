package recursion.basicRecursionProblems;

public class PrintNameFiveTimes {

    public static void main(String[] args) {
        printName(5);
    }

    static void printName(int n){
        if(n==0)
            return;
        System.out.println("Karthik");
        printName(n - 1);
    }

}
