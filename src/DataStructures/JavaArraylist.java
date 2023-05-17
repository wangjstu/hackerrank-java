package src.DataStructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://www.hackerrank.com/challenges/java-arraylist/problem?isFullScreen=true
 */
public class JavaArraylist {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Integer m = Integer.parseInt(bufferedReader.readLine());
        List<List<Integer>> strings = new ArrayList<>();
        for (Integer i = 0; i < m; i++) {
            List<Integer> collect = Arrays.stream(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::new).collect(Collectors.toList());
            strings.add(collect);
        }
        Integer n = Integer.parseInt(bufferedReader.readLine());
        for (Integer integer = 0; integer < n; integer++) {
            Integer[] s = Arrays.stream(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt).toArray(Integer[]::new);;
            if (strings.get(s[0]-1).get(0)>=s[1]) {
                System.out.println(strings.get(s[0]-1).get(s[1]));
            } else {
                System.out.println("ERROR!");
            }
        }


    }
}
