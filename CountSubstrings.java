import java.util.HashMap;
public class CountSubstrings {
    public static int count(String s,int k){
        return distinct(s,k)-distinct(s,k-1);
    }
    public static int distinct(String s,int k){
        int left=0;
        int right=0;
        int ans=0;
        HashMap<Character,Integer> map=new HashMap<>();
        while(right<s.length()){
            map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);
            while (map.size()>k){
                map.put(s.charAt(left),map.get(s.charAt(left))-1);
                if (map.get(s.charAt(left))==0){
                    map.remove(s.charAt(left));
                }
                left++;
            }
            ans+=right-left+1;
            right++;
        }
        return ans;
    }
    public static void main(String[] args){
        String s="pqpqs";
        int k=2;
        System.out.print(count(s,k));
    }
}
