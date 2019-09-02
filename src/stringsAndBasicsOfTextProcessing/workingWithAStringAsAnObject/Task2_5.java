package stringsAndBasicsOfTextProcessing.workingWithAStringAsAnObject;

/**
 * Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
 */

public class Task2_5 {

    public static void main (String [] args){

        String s1 = "skgja dflk aa fkdlf aafdlaflakdfaeqa aldfka ";

        int count = 0;

        for (int i =0; i<s1.length(); i++){

            if (s1.charAt(i) == 'a'){
                count++;
            }
        }

        System.out.println(count);
    }
}
