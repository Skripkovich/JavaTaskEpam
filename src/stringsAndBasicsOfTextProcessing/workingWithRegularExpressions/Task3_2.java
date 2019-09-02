package stringsAndBasicsOfTextProcessing.workingWithRegularExpressions;

/**
 *  Дана строка, содержащая следующий текст (xml-документ):
 * <notes>
 *  <note id = "1">
 *  <to>Вася</to>
 *  <from>Света</from>
 *  <heading>Напоминание</heading>
 *  <body>Позвони мне завтра!</body>
 *  </note>
 *  <note id = "2">
 *  <to>Петя</to>
 *  <from>Маша</from>
 *  <heading>Важное напоминание</heading>
 *  <body/>
 *  </note>
 * </notes>
 * Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа и его тип (открывающий
 * тег, закрывающий тег, содержимое тега, тег без тела). Пользоваться готовыми парсерами XML для решения данной задачи
 * нельзя.
 */

import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.Pattern;

public class Task3_2 {



    public static void main (String [] args) throws IOException {

        FileReader fr = new FileReader("F:\\PROGRAMS\\IntelliJ IDEA Community Edition 2018.3.4\\JavaTaskEpam\\Docs.xml");


        Scanner scanner = new Scanner(fr);
        scanner.useDelimiter("\\Z");

        StringBuilder sb = new StringBuilder();

        while (scanner.hasNextLine()) {
            sb.append(scanner.nextLine());
        }

        parseString(sb.toString());

    }

    private static void parseString(String string) {

        String node = "(?=<)|(?<=>)";

        String[] strings = Pattern.compile(node).split(string);

        for (String s : strings) {

            String current = s.trim();

            if (!current.isEmpty()) {

                if (s.startsWith("<") && !s.contains("/") ) {
                    System.out.println(s + " - Открывающий тег");

                } else if (s.startsWith("</") && s.endsWith(">")) {
                    System.out.println(s + " - Закрывающий тег");

                } else if (s.endsWith("/>")) {
                    System.out.println(s + " - Тег без тела");

                } else if (!s.contains("<")) {
                    System.out.println(s + " - Содержимое тега");
                }

            }
        }
    }

}
