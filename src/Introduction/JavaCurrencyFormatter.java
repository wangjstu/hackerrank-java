package src.Introduction;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-currency-formatter/problem?isFullScreen=true
 */
public class JavaCurrencyFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        NumberFormat nfus = NumberFormat.getCurrencyInstance(Locale.US);
        String us = nfus.format(payment);

        Locale localeIndia = new Locale("en", "in");
        NumberFormat indis = NumberFormat.getCurrencyInstance(localeIndia);
        String india = indis.format(payment);

        NumberFormat nfch = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = nfch.format(payment);

        NumberFormat nffrance = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = nffrance.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
