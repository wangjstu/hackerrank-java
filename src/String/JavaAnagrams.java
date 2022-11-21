package src.String;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-anagrams/problem?h_r%5B%5D=next-challenge&h_r%5B%5D=next-challenge&h_r%5B%5D=next-challenge&h_v%5B%5D=zen&h_v%5B%5D=zen&h_v%5B%5D=zen&isFullScreen=true
 */

public class JavaAnagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        //第一种方法：list + 排序
        a = a.toLowerCase();
        b = b.toLowerCase();
        //https://9to5answer.com/converting-char-array-to-list-in-java
        //https://www.cloudhadoop.com/java-convert-array-list/
        /*List<Character> collectA = a.chars().mapToObj(c -> (char) c).sorted().collect(Collectors.toList());
        List<Character> collectB = b.chars().mapToObj(c -> (char) c).sorted().collect(Collectors.toList());
        return collectB.equals(collectA);*/
        // array
        /*char[] charsa = a.toCharArray();
        Arrays.sort(charsa);
        char[] charsb = b.toCharArray();
        Arrays.sort(charsb);
        return Arrays.toString(charsa).equals(Arrays.toString(charsb));
        // 简单的写法
        char[] one = a.toLowerCase().toCharArray();
        char[] two = b.toLowerCase().toCharArray();
        Arrays.sort(one);
        Arrays.sort(two);
        return Arrays.equals(one,two);
        */

        // 不需要排序的做法
        /*if(a.length() != b.length())
            return false;

        StringBuilder lowA = new StringBuilder(a.toLowerCase());
        StringBuilder lowB = new StringBuilder(b.toLowerCase());
        for(int i = 0; i < lowA.length(); i++){
            for(int j = 0; j < lowB.length(); j++){
                if(lowA.charAt(i) == lowB.charAt(j)){
                    lowB.deleteCharAt(j);
                    break;
                }
            }
        }
        return lowB.length() == 0;*/

        // 冒泡排序+基础数据类型排序操作
        char[] charsa = a.toCharArray();
        char[] charsb = b.toCharArray();

        if (charsa.length != charsb.length) {
            return  false;
        }
        for (int i = 0; i < charsa.length-1; i++) {
            for (int j=0; j< charsa.length-1-i; j++) {
                if (charsa[j] < charsa[j+1]) {
                    char tmp = charsa[j];
                    charsa[j] = charsa[j+1];
                    charsa[j+1] = tmp;
                }
            }
        }
        for (int i = 0; i < charsb.length-1; i++) {
            for (int j=0; j< charsb.length-1-i; j++) {
                if (charsb[j] < charsb[j+1]) {
                    char tmp = charsb[j];
                    charsb[j] = charsb[j+1];
                    charsb[j+1] = tmp;
                }
            }
        }
        for (int i = 0; i < charsa.length; i++) {
            if (charsa[i] != charsb[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
