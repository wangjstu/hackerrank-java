package src.BigNumber;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-biginteger/problem?isFullScreen=true
 */
public class JavaBigInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger bigIntegerA = scanner.nextBigInteger();
        BigInteger bigIntegerB = scanner.nextBigInteger();
        System.out.println(bigIntegerA.add(bigIntegerB));
        System.out.println(bigIntegerA.multiply(bigIntegerB));
        scanner.close();
    }
}
