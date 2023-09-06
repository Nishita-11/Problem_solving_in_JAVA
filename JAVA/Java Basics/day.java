import java.io.*;
import java.time.LocalDate;
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
         int d = Integer.valueOf(day);
         System.out.println(d);
        int m = Integer.valueOf(month);
        System.out.println(month);
        int y = Integer.valueOf(year);
        System.out.println(year);
        LocalDate date = LocalDate.of(y, m, d);
        return date.getDayOfWeek().toString();
    }

}

public class day {
    public static void main(String[] args) throws IOException {
        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        // String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = 8;

        int day = 28;

        int year = 2022;

        String res = Result.findDay(month, day, year);

        System.out.println(res);

       
    }
}

