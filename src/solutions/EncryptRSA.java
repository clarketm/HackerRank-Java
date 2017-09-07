package solutions;

import helpers.EuclideanGCD;

import java.math.BigInteger;
import java.util.Scanner;

public class EncryptRSA {
    public static final long DIVISOR = (long) Math.pow(10, 9) + 7;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long p = in.nextInt();
        long q = in.nextInt();
        long n = p * q;
        long phi = (p - 1) * (q - 1);

        long min = Long.MAX_VALUE;
        BigInteger sum = new BigInteger("0");

        for (long e = 2; e < phi; e++) {
            // possible `e`
            if (new EuclideanGCD(e, phi).getGCD() == 1) {

                // encrypt:
                // where (c % n) == (m^e % n)

                // decrypt:
                // d = where (e*d % phi) == (1 % phi)
                // where (m % n) == (c^d % n)

                // (m^e % n) == (m % n)

                long unconcealed = (new EuclideanGCD(e - 1, p - 1).getGCD() + 1)
                        * (new EuclideanGCD(e - 1, q - 1).getGCD() + 1);

                if (unconcealed < min) {
                    min = unconcealed;
                    sum = BigInteger.valueOf(e);
                } else if (unconcealed == min) {
                    sum = BigInteger.valueOf(e).add(sum);
                }
            }
        }
        System.out.println(sum.mod(BigInteger.valueOf(DIVISOR)));
    }

}
