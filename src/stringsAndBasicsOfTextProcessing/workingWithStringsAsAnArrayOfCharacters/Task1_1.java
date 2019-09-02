package stringsAndBasicsOfTextProcessing.workingWithStringsAsAnArrayOfCharacters;

/**
 *Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
 */

public class Task1_1 {

    public static void main (String [] args) {

        int count = 0;
        String[] camelCase = new String[]{"camelCase", "epamTrening", "systemOutPrint"};

        //вывод на консоль
        for (int i = 0; i < camelCase.length; i++) {

            System.out.println(camelCase[i]);
        }
        System.out.println();

        //Перевод
        for (int i = 0; i < camelCase.length; i++) {

            char[] chars = camelCase[i].toCharArray();

                for (int j = 0; j < chars.length; j++) {
                    if (chars[j] >= 65 && chars[j] <= 90) {
                        count++;
                    }
                }

            char[] temp = new char[chars.length + count];

            count = 0;
            for (int j = 0; j < chars.length; j++) {
                if (chars[j] >= 65 && chars[j] <= 90) {
                    temp[count++] = 95;
                    temp[count++] = (char) (chars[j] + 32);
                } else {
                    temp[count++] = chars[j];
                }
            }
            camelCase[i] = String.valueOf(temp);
        }

        //Вывод на консоль
        for (int i = 0; i < camelCase.length; i++) {

            System.out.println(camelCase[i]);
        }
    }
}
