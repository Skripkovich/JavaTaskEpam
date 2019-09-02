package stringsAndBasicsOfTextProcessing.workingWithAStringAsAnObject;

/**
 *  Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено "abc cde
 * def", то должно быть выведено "abcdef".
 */

public class Task2_7 {

    public static void main (String [] arg){

        StringBuilder s1 = new StringBuilder ("ac vc drcqq asbcbgbdgc");


        for (int i = 0; i<s1.length(); i++){

            if (s1.charAt(i)==' '){
                s1.delete(i,i+1);
            }

        }

        System.out.println(s1);

        for (int i = 0; i<s1.length(); i++) {

            for (int j = i + 1; j < s1.length(); j++) {

                if (s1.charAt(j) == s1.charAt(i)) {

                    s1.delete(j, j + 1);
                }
            }
        }
        System.out.println(s1);
    }
}
