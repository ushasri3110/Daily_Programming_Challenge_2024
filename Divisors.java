import java.util.Scanner;

public class Divisors {
    public static int count(int N) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                count++;
                if (i != N / i) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int N = 12;
        int result = count(N);
        System.out.println(result);
    }
}
