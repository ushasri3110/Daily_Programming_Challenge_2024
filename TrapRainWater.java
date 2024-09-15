public class TrapRainWater {
    public static int trapWater(int[] arr){
        int water=0;
        int leftMax=0;
        int rightMax=0;
        int i=0;
        int j=arr.length-1;
        while (i<j){
            if (arr[i]<arr[j]){
                if (leftMax<=arr[i]){
                    leftMax=arr[i];
                }
                else{
                    water+=leftMax-arr[i];
                }
                i++;
            }
            else{
                if (rightMax<=arr[j]){
                    rightMax=arr[j];
                }
                else{
                    water+=rightMax-arr[j];
                }
                j--;
            }
        }

        return water;
    }
    public static void main(String[] args){
        int[] arr={0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int result=trapWater(arr);
        System.out.println("Trapped Rain Water:"+result);
    }
}
