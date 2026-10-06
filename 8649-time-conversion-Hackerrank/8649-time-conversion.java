import java.io.*;
import java.util.*;

public class Solution {

    public static String timeConversion(String s) {

        String period = s.substring(8, 10);
        int hour = Integer.parseInt(s.substring(0, 2));

        if (period.equals("AM")) {
            if (hour == 12) {
                hour = 0;
            }
        } else {
            if (hour != 12) {
                hour += 12;
            }
        }

        return String.format("%02d", hour) + s.substring(2, 8);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();

        String result = timeConversion(s);

        System.out.println(result);

        bufferedReader.close();
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna