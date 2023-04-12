package src.DataStructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * https://www.hackerrank.com/challenges/java-2d-array/problem?isFullScreen=true
 */
public class Java2DArray {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<List<Integer>> arr = new ArrayList<>();
        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(Collectors.toList())
                );
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        // 暴力解法，寻找 hourglass 并求和。找到起点，进行轮训求和比较
        final Integer[] maxCount = {Integer.MIN_VALUE};
        IntStream.range(0, 4).forEach( m -> {
            List<Integer> lineList = arr.get(m);
            List<Integer> lineListNext = arr.get(m+1);
            List<Integer> lineListNextNext = arr.get(m+2);
            IntStream.range(0, 4).forEach( n -> {
                Integer beginPointCount = lineList.get(n) + lineList.get(n+1) + lineList.get(n+2) +
                        lineListNext.get(n+1) + lineListNextNext.get(n) + lineListNextNext.get(n+1) + lineListNextNext.get(n+2);
                maxCount[0] = maxCount[0] > beginPointCount ? maxCount[0] : beginPointCount;
            });
        });
        System.out.println(maxCount[0]);


        bufferedReader.close();
    }
}
