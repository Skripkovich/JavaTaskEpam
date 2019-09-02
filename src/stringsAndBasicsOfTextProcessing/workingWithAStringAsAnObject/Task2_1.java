package stringsAndBasicsOfTextProcessing.workingWithAStringAsAnObject;

/**
 * Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
 */

public class Task2_1 {

    public static void main (String [] args){

        String s = "Skfjgj   fdkgjtijyti j fkglgkfl       flgklflgkor d;gghltgo";

        int count = 1;
        int max = 0;

        for (int i = 0; i<s.length(); i++){

                while (s.charAt(i) == ' ' && s.charAt(++i) ==' '){
                    count++;
                }

                if (count>max){

                    max=count;
                    count = 1;
                }
        }

        System.out.println(max);
    }
}
