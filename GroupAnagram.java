import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class GroupAnagram {
    public static ArrayList<ArrayList<String>> anagramsGrouping(String[] arr){
        ArrayList<ArrayList<String>> anagrams=new ArrayList<>();
        HashMap<String,ArrayList<String>> map=new HashMap<>();
        for (String s:arr){
            char[] charArray=s.toCharArray();
            Arrays.sort(charArray);
            String sortedString=new String(charArray);
            if (!map.containsKey(sortedString)){
                map.put(sortedString,new ArrayList<>());
            }
            map.get(sortedString).add(s);
        }
        for (ArrayList<String> i:map.values()){
            anagrams.add(i);
        }
        return anagrams;
    }
    public static void main(String[] args){
        String[] arr={"eat", "tea", "tan", "ate", "nat", "bat"};
        ArrayList<ArrayList<String>> res=anagramsGrouping(arr);
        System.out.println(res);

    }
}
