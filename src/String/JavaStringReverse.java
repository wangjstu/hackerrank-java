package src.String;

import java.util.Scanner;

public class JavaStringReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.next();
        boolean reverse = true;
        //普通解法 charAt/substring
        /*int aLength = A.length();
        int i;
        for (i = 0; i < aLength / 2; i++) {
            if (A.charAt(i) != A.charAt(aLength - 1 - i)) {
                reverse = false;
                break;
            }
        }*/
        //第二种 StringBuilder/StringBuffer
        StringBuilder stringBuilder = new StringBuilder(A);
        reverse = stringBuilder.reverse().toString().equals(A);
        System.out.println(reverse ? "Yes" : "No");
    }
}
