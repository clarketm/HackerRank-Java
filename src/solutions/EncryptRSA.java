package solutions;

import helpers.EuclideanGCD;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class EncryptRSA {
    public static final int DIVISOR = (int) Math.pow(10, 9) + 7;

    public static void main(String[] args) {
        TreeMap<Integer, Integer> unconcealed = new TreeMap<>();

        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        int q = in.nextInt();
        int n = p * q;
        int phi = (p - 1) * (q - 1);

        int gcd;

        for (int e = 2; e < phi; e++) {
            gcd = new EuclideanGCD(e, phi).getGCD();
            if (gcd == 1) {
                // possible `e`

                // encrypt:
                // where (c % n) == (m^e % n)

                // decrypt:
                // d = where (e*d % phi) == (1 % phi)
                // where (m % n) == (c^d % n)

                // (m^e % n) == (m % n)

                int c = 0;
                for (int m = 0; m < n; m++) {
                    double _c = Math.pow(m, e) % (double) n;
                    if ((int) _c == m) {
                        c++;
                    }
                }
                unconcealed.put(e, c);
            }
        }

        for (Map.Entry<Integer, Integer> entry : unconcealed.entrySet()) {
            System.out.printf("%d->%d\n", entry.getKey(), entry.getValue());
        }
    }

}
