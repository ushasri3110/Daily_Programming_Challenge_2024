import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static int longestSubsting(String S){
        Set<Character> set=new HashSet<>();
        int start=0;
        int end=0;
        int maxLength=0;
        while (end<S.length()){
            if (set.contains(S.charAt(end))){
                while (S.charAt(start)!=S.charAt(end)){
                    set.remove(S.charAt(start));
                    start++;
                }
                start++;
            }
            else{
                set.add(S.charAt(end));
                maxLength=Math.max(maxLength,end-start+1);
            }
            end++;
        }
        return maxLength;
    }
    public static void main(String[] args){
        String S = "abcabcbb";
        System.out.println(longestSubsting(S));
    }
}
