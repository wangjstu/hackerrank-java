package src.BigNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * https://www.hackerrank.com/challenges/java-primality-test/problem?isFullScreen=true
 */
public class JavaPrimalityTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String n = bufferedReader.readLine();

        BigInteger bigInteger = new BigInteger(n);
        if (bigInteger.isProbablePrime(10)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }


        bufferedReader.close();
    }
}
