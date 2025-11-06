package linearsearch.questions;

public class SearchInString {
    public static void main(String[] args) {
        String name = "Karthik";
        char target = 'u';
        System.out.println(search(name,target));
    }
    static boolean search(String s, char target){
        if(s == null) return false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == target){
                return true;
            }
        }
        return false;
    }
}
