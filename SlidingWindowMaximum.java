import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMaximum {
    public static int[] slidingWindow(int[] arr,int k){
        int n=arr.length;
        int[] result=new int[n-k+1];
        Deque<Integer> deq=new LinkedList<>();
        for (int i=0;i<n;i++){
            if (!deq.isEmpty() && deq.peek()<i-k+1){
                deq.poll();
            }
            while (!deq.isEmpty() && arr[deq.peekLast()] <= arr[i]) {
                deq.pollLast();
            }
            deq.offer(i);
            if (i >= k - 1) {
                result[i - k + 1] = arr[deq.peek()];
            }
        }
        return result;

    }
    public static void main(String[] args){
        int[] arr={1, 3, -1, -3, 5, 3, 6, 7};
        int k=3;
        int[] res=slidingWindow(arr,k);
        for (int i:res){
            System.out.print(i+" ");
        }
    }
}
