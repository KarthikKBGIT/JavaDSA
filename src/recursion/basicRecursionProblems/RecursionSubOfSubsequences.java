package recursion.basicRecursionProblems;

import java.util.ArrayList;
import java.util.List;

public class RecursionSubOfSubsequences {

    static List<Integer> originalList = List.of(3, 1, 2);
    static int n = originalList.size();
    static void main(String[] args) {
        printSubsequences(0, new ArrayList<>(), 3);
    }

    static void printSubsequences(int ind, List<Integer> list, int sum){
        if(ind >= n){
            if(sumOfList(list) == sum){
                printList(list);
            }
            return;
        }
        list.add(originalList.get(ind));
        printSubsequences(ind + 1, list, sum);
        list.remove(originalList.get(ind));
        printSubsequences(ind + 1, list, sum);
    }

    static int sumOfList(List<Integer> list){
        int sum = 0;
        for(Integer i : list){
            sum += i;
        }
        return sum;
    }

    static void printList(List<Integer> list){
        for(Integer i : list){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
