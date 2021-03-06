package moe.tawawa.foroffer;

/**
 * @author geekaven
 * @date 2020/6/10 11:56 AM
 */
public class Lcof16 {
    // 注意负数，0的情况，
    public double myPow(double x, int n) {
        if (n == 0 || x == 1) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }

        if (n < 0) {
            return 1 / exponent(x, -(long)n);
        } else {
            return exponent(x, n);
        }
    }

    public double exponent(double x, long n) {
        double res = 1;
        while (n != 0) {
            if ((n & 1) == 1) {
                res = res * x;
            }
            x = x * x;
            n = n>>1;
        }
        return res;
    }

    public void test() {
        System.out.println(myPow(2.000, 10));
        System.out.println(myPow(2.10000, 3));
        System.out.println(myPow(2.00000, -2));
        System.out.println(myPow(2.00000, -2147483648));
    }
}
