package stringsAndBasicsOfTextProcessing.workingWithStringsAsAnArrayOfCharacters;

/**
 * Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
 * Крайние пробелы в строке удалить.
 */

public class Task1_5 {

    public static void main (String [] args){

        String s = "   SUjdfgk   ololol   dfdfwert ";
        char [] chars = s.toCharArray();

        //Вывод на консоль
        for (int i = 0; i<chars.length-1; i++) {

            System.out.print(chars[i]);
        }
        System.out.println();

        System.out.println(cutExtraSpaces(chars));

    }

    //Метод возвращает число найденных слов
    private static int getLengthOfNewArr(char[] chars){
        int letters = 0;
        int num = 0;
        boolean isWord = false;

        for (int i = 0; i < chars.length; i++) {

            if (chars[i] != 32) {
                letters++;
                isWord = true;
                if(i == chars.length - 1){
                    num++;
                }
            } else if(isWord ){
                num++;
                isWord = false;
            }
        }

        return num + letters - 1;
    }

    private static char[] cutExtraSpaces(char[] chars){
        char[] arr;
        int num;
        int count = 0;
        boolean isWord = false;

        num = getLengthOfNewArr(chars);
        arr = new char[num];

        for (int i = 0; i < chars.length; i++) {

            if (chars[i] != 32) {
                arr[count++] = chars[i];
                isWord = true;
            } else if(isWord && i < chars.length - 1){
                arr[count++] = 32;
                isWord = false;
            }
        }
        return arr;
    }


}
