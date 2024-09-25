import java.util.ArrayList;

public class PrimeFactorization {
    public static ArrayList<Integer> factorization(int n){
        ArrayList<Integer> ans=new ArrayList<>();
        while (n%2==0){
            ans.add(2);
            n=n/2;
        }
        for (int i=3;i<=Math.sqrt(n);i++){
            while(n%i==0){
                ans.add(i);
                n=n/i;
            }
        }
        if (n>2){
            ans.add(n);
        }
        return ans;
    }
    public static void main(String[] args){
        int N=18;
        System.out.print(factorization(N));
    }
}
