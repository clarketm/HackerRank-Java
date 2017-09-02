package solutions;

import java.math.BigInteger;

public class JadeProblem {

    public static void main(String[] args) {
        BigInteger Bn = new BigInteger("64");
        BigInteger resultB = Bn.add(BigInteger.valueOf(1)).multiply(Bn.divide(BigInteger.valueOf(2)));
//        System.out.println(resultB);

        long n = 64;
        long result1 = (n + 1) * (n / 2);
        result1 = n % 2 == 0 ? result1 : result1 + ((n / 2) + 1);
        System.out.println(result1);

        long result = getTotal(n);
        System.out.println(result);
    }


    private static long getTotal(long n) {
        long total = 0;
        while (n > 0) {
            total += n;
            n--;
        }
        return total;
    }

}
