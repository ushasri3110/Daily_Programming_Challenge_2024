import java.util.Arrays;
public class LongestCommonPrefix {
    public static String longest(String[] arr){
        Arrays.sort(arr);
        StringBuilder sb=new StringBuilder();
        for (int j=0;j<arr[0].length();j++){
            if (arr[0].charAt(j)!=arr[arr.length-1].charAt(j)){
                break;
            }
            sb.append(arr[0].charAt(j));
        }
        return sb.toString();
    }
    public static void main(String[] args){
        String[] arr={"flower", "flow", "flight"};
        System.out.println("Longest Common Prefix is: "+longest(arr));
    }
}
