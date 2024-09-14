import java.util.ArrayList;
import java.util.HashMap;

public class SubArraySum0 {
    static ArrayList<int[]> res = new ArrayList<>();

    public static void findSubArray(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int current_sum = 0;

        for (int end = 0; end < arr.length; end++) {
            current_sum += arr[end];
            if (current_sum == 0) {
                res.add(new int[]{0, end});
            }
            if (map.containsKey(current_sum)) {
                int start = map.get(current_sum) + 1;
                res.add(new int[]{start, end});
            }
            map.put(current_sum, end);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, -3, 3, -1, 2};
        findSubArray(arr);
        for (int[] i : res) {
            System.out.print("(" + i[0] + "," + i[1] + ")\n");
        }
    }
}