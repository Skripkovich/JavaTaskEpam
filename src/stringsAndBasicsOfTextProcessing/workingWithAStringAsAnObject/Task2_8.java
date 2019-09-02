package stringsAndBasicsOfTextProcessing.workingWithAStringAsAnObject;

/**
 * Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда самых
 * длинных слов может быть несколько, не обрабатывать.
 */

public class Task2_8 {

    public static void main (String [] args){

        String s1 = " asdkgdfl   asl         aslfk ";

        StringBuilder s2 = new StringBuilder(s1.trim());

        int max = 0;
        int count = 0;
        int index = 0;
        int totalIndex = 0;

        for (int i = 0; i<s2.length()-1; i++){

            if (s2.charAt(i)==' '){
                if (s2.charAt(i+1)==' ') {
                    s2.delete(i, i + 1);
                    i--;
                }
            }

        }

        for (int i = 0; i<s2.length()-1; i++){

            count++;

            if (s2.charAt(i+1)==' ' || i==s2.length()-1){

                index++;

                if (count>max){

                    max = count;
                    totalIndex = index;

                }

                count = 0;
            }

        }

        System.out.println("Самое длинное слово под номером: " + totalIndex + " с колличеством символов: " + max);

    }
}
