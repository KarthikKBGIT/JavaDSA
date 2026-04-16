package recursion.basicRecursionProblems;

import java.util.ArrayList;
import java.util.List;

public class RecursionOnSubsequences {

    static List<Integer> originalList = List.of(3, 1, 2);
    static int n = originalList.size();
    static void main(String[] args) {
        printSubsequences(0, new ArrayList<>());
    }

    static void printSubsequences(int ind, List<Integer> list){
        if(ind >= n){
            printList(list);
            return;
        }
        list.add(originalList.get(ind));
        printSubsequences(ind + 1, list);
        list.remove(originalList.get(ind));
        printSubsequences(ind + 1, list);
    }

    static void printList(List<Integer> list){
        for(Integer i : list){
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
