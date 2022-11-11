package src;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-strings-introduction/problem?isFullScreen=true
 */
public class JavaStringsIntroduction {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());
        Boolean lexicographically = false;
        char[] aChars = A.toCharArray();
        char[] bChars = B.toCharArray();
        for (int i = 0; i < A.length(); i++) {
            if (i < B.length()) {
                if (aChars[i] != bChars[i]) {
                    lexicographically = aChars[i] > bChars[i];
                    break;
                }
            }
        }
        System.out.println(lexicographically);
        System.out.println(A + " " + B);
    }
}
