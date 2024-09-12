public class MergeSortedArrays {
    public static void merge(int[] arr1,int[] arr2){
        int m=arr1.length;
        int n=arr2.length;
        for (int i=0;i<m;i++){
            if (arr1[i]>arr2[0]){
                int temp=arr1[i];
                arr1[i]=arr2[0];
                arr2[0]=temp;
            }
            int key=arr2[0];
            int j;
            for (j=1;j<n && arr2[j]<key;j++){
                arr2[j-1]=arr2[j];
            }
            arr2[j-1]=key;
        }
    }
    public static void main(String[] args){
        int[] arr1={1,3,5,7};
        int[] arr2={2,4,6,8};
        merge(arr1,arr2);
        System.out.println("Array1 after sorting:");
        for(int i:arr1){
            System.out.print(i+" ");
        }
        System.out.println("\nArray2 after sorting:");
        for(int j:arr2){
            System.out.print(j+" ");
        }
    }
}
