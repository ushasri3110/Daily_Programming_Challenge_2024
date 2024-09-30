import java.util.HashMap;

public class FirstElementToRepeatKtimes {
    public static void main(String[] args){
        int[] arr={3, 1, 4, 4, 5, 2, 6, 1, 4};
        int k=2;
        System.out.println(firstElement(arr,k));
    }

    private static int firstElement(int[] arr, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for (int j:arr){
            if (map.get(j)==k){
                return j;
            }
        }
        return -1;
    }
}
