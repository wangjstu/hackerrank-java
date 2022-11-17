package src.String;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-string-compare/problem?isFullScreen=true&h_r=next-challenge&h_v=zen
 */
public class JavaStringCompare {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int k = scanner.nextInt();
        String smallestAndLargest = getSmallestAndLargest(s, k);
        System.out.println(smallestAndLargest);
    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        int start = 0;
        int loop = s.length()-k;
        while (start<=loop) {
            String substring = s.substring(start, start + k);
            smallest = (smallest.isEmpty() || substring.compareTo(smallest) < 0) ? substring :  smallest;
            largest = (largest.isEmpty() || substring.compareTo(largest) > 0) ? substring :  largest;
            start++;
        }

        /*List<String> listOfElements = new ArrayList<>();

        for (int i = 0; i < inputString.length(); i++) {
            if (i + k <= inputString.length()) {
                String element = inputString.substring(i, i + k);
                listOfElements.add(element);
            }
        }

        listOfElements = listOfElements.stream().sorted().collect(Collectors.toList());

        return listOfElements.get(0) + "\n" + listOfElements.get(listOfElements.size() - 1);*/

        return smallest + "\n" + largest;
    }
}
