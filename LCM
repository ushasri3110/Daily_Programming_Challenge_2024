public class LCMCalculator {

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        int N = 4;
        int M = 6;
        System.out.println(lcm(N, M));  // Output: 12
    }
}
