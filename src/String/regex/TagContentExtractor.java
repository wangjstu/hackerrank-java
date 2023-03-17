package src.String.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * https://www.hackerrank.com/challenges/tag-content-extractor/problem?isFullScreen=true&h_r=next-challenge&h_v=zen
 */

public class TagContentExtractor {
    private static final Pattern compile = Pattern.compile("<(.+)>([^<>]+)</\\1>");
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String line = in.nextLine();

            //Write your code here
            Matcher matcher = compile.matcher(line);
            if(matcher.find() == false) {
                System.out.println("None");
            }
            matcher.reset();
            while (matcher.find()) {
                System.out.println(matcher.group(2));
            }

            testCases--;
        }
    }
}
