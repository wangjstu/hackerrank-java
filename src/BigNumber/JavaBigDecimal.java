package src.BigNumber;



import java.math.BigDecimal;
import java.util.*;

/**
 * https://www.hackerrank.com/challenges/java-bigdecimal/problem?isFullScreen=true
 */
public class JavaBigDecimal {
    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        //Write your code here
        Object[] objects = Arrays.stream(s).filter(Objects::nonNull).sorted((o1, o2) -> new BigDecimal(o2).compareTo(new BigDecimal(o1))).toArray();
        s = Arrays.copyOf(objects, objects.length, String[].class);
        // s = Arrays.asList(objects).toArray(new String[n]);

        //第二种方法
        //Arrays.sort(s, 0, n, (o1, o2) -> new BigDecimal(o2).compareTo(new BigDecimal(o1)));

        //object array转为string array
        //s = Arrays.stream(s).filter(Objects::nonNull).sorted((o1, o2) -> new BigDecimal(o2).compareTo(new BigDecimal(o1))).toArray(String[]::new);

        //Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}
