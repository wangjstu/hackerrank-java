package src.String;

import java.util.Scanner;

public class JavaSubstring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        /**
         * https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#substring-int-int-
         */
        System.out.println(S.substring(start,end));
    }
}
