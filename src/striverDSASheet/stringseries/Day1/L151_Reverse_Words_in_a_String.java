package striverDSASheet.stringseries.Day1;

import java.util.ArrayList;
import java.util.List;

public class L151_Reverse_Words_in_a_String {
    public static void main(String[] args) {
        String s = "a good   example";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s){
        List<String> stringList = new ArrayList<>();
        String str = "";
        String answer = "";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != ' '){
                str += s.charAt(i);
            }
            else{
                if(str.isEmpty()){
                    continue;
                }
                stringList.add(str);
                str = "";
            }
        }
        stringList.add(str);
        for(int i=stringList.size() - 1;i>=0;i--){
            answer = answer + stringList.get(i) + " ";
        }
        return answer.trim();
    }
}
