package introduction;

import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

// Java MD5
// https://www.hackerrank.com/challenges/java-md5/problem

public class MD5 {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        MessageDigest md5 = MessageDigest.getInstance("MD5");
        byte[] digest = md5.digest(s.getBytes());
        String hash = DatatypeConverter.printHexBinary(digest).toLowerCase();

        System.out.println(hash);
    }

}