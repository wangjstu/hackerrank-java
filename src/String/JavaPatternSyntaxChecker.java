package src.String;

import java.util.Scanner;
import java.util.regex.*;

/**
 * https://www.hackerrank.com/challenges/pattern-syntax-checker/problem?isFullScreen=true
 * https://www.javatpoint.com/java-regex
 */
public class JavaPatternSyntaxChecker {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String pattern = in.nextLine();
            //Write your code
            testCases--;
            try {
                Pattern compile = Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }
        }
        in.close();
    }
}
