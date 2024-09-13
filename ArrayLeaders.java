import java.util.ArrayList;
import java.util.Collections;

public class ArrayLeaders {
    static ArrayList<Integer> leaders=new ArrayList<>();
    public static void findLeaders(int[] arr){
        int n=arr.length;
        leaders.add(arr[n-1]);
        int maxSoFar=arr[n-1];
        for (int i=n-2;i>=0;i--){
            if (arr[i]>maxSoFar){
                leaders.add(arr[i]);
                maxSoFar=arr[i];
            }
        }
    }
    public static void main(String[]  args){
        int[] arr={16, 17, 4, 3, 5, 2};
        findLeaders(arr);
        Collections.reverse(leaders);
        for (int i:leaders){
            System.out.print(i+" ");
        }
    }
}
