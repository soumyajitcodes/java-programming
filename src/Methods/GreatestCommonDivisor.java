package Methods;

public class GreatestCommonDivisor {

    static int gcd (int m, int n) {
        while (m!=n) {
            if (m>n) {
                m = m-n;
            }
            else {
                n = n-m;
            }
        }
        return m;
    }

    public static void main(String[] args) {
        int m = 35;
        int n = 56;

        System.out.println(gcd(m, n));
    }
}
