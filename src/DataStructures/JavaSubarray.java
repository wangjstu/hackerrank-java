package src.DataStructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * https://www.hackerrank.com/challenges/java-negative-subarray/problem?isFullScreen=true
 * Sample Input
 *
 * 5
 * 1 -2 4 -5 1
 *
 * Sample Output
 * 9
 *
 *  //TIP1:
 *  list sublist 然后sublist.stream().reduce(0, Integer::sum);
 *  https://www.baeldung.com/java-stream-sum
 *
 *  //TIP2
 *  可以用arrays.copyOfRance,Arrays.asList(arr).subList(),System.arraycopy 进行分割子数组
 */
public class JavaSubarray {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Integer n = Integer.parseInt(bufferedReader.readLine());
        Integer[] arr = Arrays.stream(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt).toArray(Integer[]::new);
        Integer count = 0;
        for (Integer i = 0; i < n; i++) {
            Integer sum = 0;
            for (int j = i; j < n; j++) {
                sum+=arr[j];
                if (sum.compareTo(0)<0) {
                     count++;
                }
            }
        }
        System.out.println(count);
        bufferedReader.close();
    }
}
