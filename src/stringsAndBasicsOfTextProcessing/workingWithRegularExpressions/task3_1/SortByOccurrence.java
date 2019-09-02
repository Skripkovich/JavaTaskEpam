package stringsAndBasicsOfTextProcessing.workingWithRegularExpressions.task3_1;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SortByOccurrence {

    public static void SortByOccurrence (String s, String in) {
        Pattern p = Pattern.compile("\\s");
        String[] s1 = p.split(s);

        Arrays.sort(s1);

        int[] arr = new int[s1.length];
        boolean flag = false;
        int count = 0;

        for (int i = 0; i < s1.length; i++) {

            String s2 = s1[i];

            p = Pattern.compile(in, Pattern.CASE_INSENSITIVE + Pattern.UNICODE_CASE);
            Matcher m = p.matcher(s2);

            while (m.find()) {
                if (p.matcher(s2).find()) {
                    count++;
                }
            }
            arr[i] = count;
            count = 0;
        }

        while (!flag) {
            flag = true;

            for (int i = 0; i < arr.length - 1; i++) {

                if (arr[i] < arr[i + 1]) {

                    flag = false;

                    int a = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = a;

                    String a1 = s1[i];
                    s1[i] = s1[i + 1];
                    s1[i + 1] = a1;

                }

            }
        }

        for (int i = 0; i < s1.length; i++) {
            System.out.print(s1[i] + " ");
        }
    }
}
