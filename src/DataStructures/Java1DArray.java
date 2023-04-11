package src.DataStructures;

import java.util.Scanner;

/**
 * 一维数组
 * https://www.hackerrank.com/challenges/java-1d-array-introduction/problem?isFullScreen=true
 */
public class Java1DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] val = new int[n];
        for (int i = 0; i < n; i++) {
            val[i] = scanner.nextInt();
        }
        scanner.close();
        for (int a : val) {
            System.out.println(a);
        }
    }
}
