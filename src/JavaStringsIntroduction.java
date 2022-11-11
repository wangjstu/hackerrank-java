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
        boolean lexicographically = false;
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
        System.out.println(lexicographically ? "Yes" : "No");
        //https://attacomsian.com/blog/capitalize-first-letter-of-string-java
        System.out.println(A.substring(0,1).toUpperCase()+A.substring(1) + " " + B.substring(0,1).toUpperCase()+B.substring(1));
    }
}
