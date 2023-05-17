package src.DataStructures;

import java.io.IOException;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-1d-array/problem?isFullScreen=true
 *
 * TODO：没有独立做出来的题目，后面多写几道类似的题目。[收藏题目-深度递归DFS]
 */
public class Java1DArrayPart2 {
    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        return canWin(game, 0, leap);
    }

    private static boolean canWin(int[] game, int index, int leap) {
        if (index >= game.length) {
            return true;
        } else if (index < 0 || game[index] == 1) {
            return false;
        }
        game[index] = 1;
        return canWin(game, index+leap, leap) ||
                canWin(game, index+1, leap) ||
                canWin(game, index-1, leap);
    }

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println((canWin(leap, game)) ? "YES" : "NO");
        }
        scan.close();
//        BufferedReader inputPathBufferedReader = new BufferedReader(new FileReader("D:\\hellojava\\hackerrank-java\\src\\DataStructures\\test\\input03.txt"));
//        BufferedReader outPathBufferedReader = new BufferedReader(new FileReader("D:\\hellojava\\hackerrank-java\\src\\DataStructures\\test\\output03.txt"));
//        int inputLine = Integer.parseInt(inputPathBufferedReader.readLine());
//        while (inputLine-- > 0) {
//            String lengthAndLeap = inputPathBufferedReader.readLine();
//            String intArr = inputPathBufferedReader.readLine();
//            String[] lengthAndLeapArr = lengthAndLeap.replaceAll("\\s+$", "").split(" ");
//            int[] game = Arrays.stream(intArr.replaceAll("\\s+$", "").split(" ")).mapToInt(Integer::valueOf).toArray();
//            boolean b = canWin(Integer.parseInt(lengthAndLeapArr[1]), game);
//            String s = outPathBufferedReader.readLine();
//            if (("YES".equals(s))!=b) {
//                System.out.println(lengthAndLeap);
//                System.out.println(intArr);
//                System.exit(0);
//            }
//        }

    }
}
