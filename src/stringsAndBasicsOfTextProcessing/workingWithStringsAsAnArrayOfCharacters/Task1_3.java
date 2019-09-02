package stringsAndBasicsOfTextProcessing.workingWithStringsAsAnArrayOfCharacters;

/**
 * В строке найти количество цифр.
 */

public class Task1_3 {
    public static void main (String[] args){

        String s1 = " Rofl 25 in45dex, wtf Tes2T, 4";

        int count = 0;

        for (int i =0; i<s1.length(); i++) {

            if (Character.isDigit(s1.charAt(i))){
                count++;
            }
        }

        System.out.println("Колличество цифр в строке: " + count);
    }
}
