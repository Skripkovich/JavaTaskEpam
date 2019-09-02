package stringsAndBasicsOfTextProcessing.workingWithAStringAsAnObject;

/**
 * С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.
 */

public class Task2_4 {

    public static void main (String [] args){

        StringBuilder s1 = new StringBuilder("информатика");

        for (int i=0; i< s1.length(); i++){

            if (s1.charAt(i)=='т'){

                s1.setCharAt(0, 'т');
                s1.setCharAt(3, 'т');
            }else if (s1.charAt(i)=='о'){

                s1.setCharAt(1, 'о');
            }else if (s1.charAt(i)=='р'){

                s1.setCharAt(2, 'р');
            }
        }

        s1.delete(4, s1.length());

        System.out.println(s1);
    }
}
