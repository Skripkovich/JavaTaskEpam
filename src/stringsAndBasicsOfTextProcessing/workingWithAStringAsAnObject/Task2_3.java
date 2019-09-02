package stringsAndBasicsOfTextProcessing.workingWithAStringAsAnObject;

/**
 * Проверить, является ли заданное слово палиндромом.
 */

public class Task2_3 {

    public static void main (String [] args){

        String s = "топот";
        StringBuilder s1 = new StringBuilder(s);

        if (s.equals(s1.reverse().toString())){
            System.out.println("Слово палиндром");
        }else {
            System.out.println("К сожалению слово не палиндром");
        }
    }
}
