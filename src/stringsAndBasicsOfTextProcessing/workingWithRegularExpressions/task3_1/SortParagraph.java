package stringsAndBasicsOfTextProcessing.workingWithRegularExpressions.task3_1;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class SortParagraph {

    public static void sortParagrph(String s) {

        //создаем шаблон и разбиваем входящую строку на абзацы
        Pattern p = Pattern.compile("\\n");
        String[] fields = p.split(s);

        //сортируем абзацы по возрастанию
        int[] arr = new int[fields.length];
        boolean flag = false;
        int count = 0;

        //подсчитываем количество предложений в абзаце и записываем в отдельный массив
        for (int i = 0; i < fields.length; i++) {
            String s2 = fields[i];

            p = Pattern.compile("\\.");
            Matcher m = p.matcher(s2);

            while (m.find()) {
                if (p.matcher(s2).find()) {
                    count++;
                }
            }
            arr[i] = count;
            count = 0;
        }

        //сортируем абзацы
        while (!flag) {
            flag = true;

            for (int i = 0; i < arr.length - 1; i++) {

                if (arr[i] > arr[i + 1]) {

                    flag = false;

                    int a = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = a;

                    String a1 = fields[i];
                    fields[i] = fields[i + 1];
                    fields[i + 1] = a1;

                }
            }
        }

        for (int i = 0; i < fields.length; i++) {
            System.out.println(fields[i]);
        }
    }
}
