package randomPractice;

public class L003_LongestUniqueSubstring {

    public static void main(String[] args) {
        String s = "pwwkewabcdefghijklmnopqrstuvwxyz";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int i=0,j=0;
        String str = "";
        int length = 0;
        while(j<s.length()){
            if(!str.contains(""+s.charAt(j))){
                str += s.charAt(j);
                ++j;
            }
            else{
                length = str.length();
                if(length > maxLength)
                    maxLength = length;
                if(j<s.length()){
                    int index = str.indexOf(s.charAt(j));
                    str = str.substring(index + 1, str.length()) + s.charAt(j);
                    ++i;
                    }
                ++j;
            }
        }
        return maxLength;
    }

}

