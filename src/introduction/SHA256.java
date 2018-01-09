package introduction;

import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

// Java SHA-256
// https://www.hackerrank.com/challenges/sha-256/problem

public class SHA256 {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        MessageDigest sha256 = MessageDigest.getInstance("SHA-256");
        byte[] digest = sha256.digest(s.getBytes());
        String hash = DatatypeConverter.printHexBinary(digest).toLowerCase();

        System.out.println(hash);
    }

}