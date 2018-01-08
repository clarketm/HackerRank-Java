package introduction;

// Java Static Initializer Block
// https://www.hackerrank.com/challenges/java-static-initializer-block/problem

import java.util.Scanner;

public class StaticInitializerBlock {
    private static boolean flag;
    private static int B;
    private static int H;

    static {
        Scanner in = new Scanner(System.in);
        B = in.nextInt();
        H = in.nextInt();
        flag = B > 0 && H > 0;
        try {
            if (!flag) {
                throw new Exception("Breadth and height must be positive");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }
    }

}
