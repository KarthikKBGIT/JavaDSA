package striverDSASheet.stringseries.Day1;

import java.util.ArrayList;
import java.util.List;

public class L1021_Remove_Outermost_Parenthese {

    public static void main(String[] args) {
        String s = "(()())(())";
        System.out.println(removeOuterParentheses(s));
    }

    public static String removeOuterParentheses(String s){
        List<String> listOfParantheses = new ArrayList<>();
        String str = "";
        int count = 0;
        String result = "";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '(' ){
                str += s.charAt(i);
                count++;
            }
            if(s.charAt(i) == ')'){
                if(count > 1){
                    str += s.charAt(i);
                    count--;
                }
                else{
                    str += s.charAt(i);
                    listOfParantheses.add(str);
                    str = "";
                    count--;
                }
            }

        }
        for(int i=0;i<listOfParantheses.size();i++){
            result += listOfParantheses.get(i).substring(1, listOfParantheses.get(i).length() - 1);
        }
        return result;
    }

}
