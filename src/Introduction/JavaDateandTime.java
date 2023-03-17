package src.Introduction;

import java.io.*;
import java.util.Calendar;
import java.util.HashMap;

/**
 * https://www.hackerrank.com/challenges/java-date-and-time/problem?isFullScreen=true
 */

public class JavaDateandTime {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        Calendar c = Calendar.getInstance();
        c.set(year, month-1, day);
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        HashMap<Integer, String> week = new HashMap<>();
        //SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
        week.put(1, "SUNDAY");
        week.put(2, "MONDAY");
        week.put(3, "TUESDAY");
        week.put(4, "WEDNESDAY");
        week.put(5, "THURSDAY");
        week.put(6, "FRIDAY");
        week.put(7, "SATURDAY");
        return week.get(dayOfWeek);
    }

}
