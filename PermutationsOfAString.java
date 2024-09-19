import java.util.*;
public class PermutationsOfAString {
    public static void permutations(String str,StringBuilder output,List<String> result,boolean[] used) {
        if (str.length() == output.length()) {
            result.add(output.toString());
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            if (used[i] || (i > 0 && str.charAt(i) == str.charAt(i - 1) && !used[i - 1])) {
                continue;
            }
            used[i] = true;
            output.append(str.charAt(i));
            permutations(str, output, result, used);
            used[i] = false;
            output.deleteCharAt(output.length() - 1);
        }
    }
    public static void main(String[] args){
        String S="abc";
        ArrayList<String> result=new ArrayList<>();
        char[] charArr=S.toCharArray();
        Arrays.sort(charArr);
        String str=new String(charArr);
        boolean[] used=new boolean[S.length()];
        permutations(str,new StringBuilder(),result,used);
        System.out.println(result);
    }
}
