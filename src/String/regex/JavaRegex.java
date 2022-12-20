package src.String.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * https://www.hackerrank.com/challenges/java-regex/problem?isFullScreen=true&h_r=next-challenge&h_v=zen
 */
public class JavaRegex {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }

    private static class MyRegex {
        public static String pattern = "^(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)(?:\\.(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)){3}$";
    }
}
