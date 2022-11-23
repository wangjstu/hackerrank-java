package src.String;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * https://www.hackerrank.com/challenges/java-string-tokens/problem?h_r=next-challenge&h_r%5B%5D%5B%5D=next-challenge&h_r%5B%5D%5B%5D=next-challenge&h_r%5B%5D%5B%5D=next-challenge&h_v=zen&h_v%5B%5D%5B%5D=zen&h_v%5B%5D%5B%5D=zen&h_v%5B%5D%5B%5D=zen&isFullScreen=true
 * Sample Input：
 * He is a very very good boy, isn't he?
 *
 * Sample Output：
 * 10
 * He
 * is
 * a
 * very
 * very
 * good
 * boy
 * isn
 * t
 * he
 *
 *  [A-Za-z !,?._'@]+
 */

public class JavaStringTokens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] split = string.split("[\\s!,?._'@]");
        String[] strings = Arrays.stream(split).filter(s -> !s.isEmpty()).toArray(String[]::new);
        System.out.println(strings.length);
        for (String s : strings) {
            System.out.println(s);
        }
        scanner.close();
    }
}
