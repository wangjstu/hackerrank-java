package src.String.regex;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/valid-username-checker/problem?isFullScreen=true
 */
public class ValidUsernameRegularExpression {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}



class UsernameValidator {
    /**
     * Write regular expression here.
     */
    public static final String regularExpression = "[a-zA-Z][a-zA-Z0-9_]{7,29}";
}