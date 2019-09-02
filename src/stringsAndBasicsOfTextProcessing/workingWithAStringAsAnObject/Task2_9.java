package stringsAndBasicsOfTextProcessing.workingWithAStringAsAnObject;

/**
 *  Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только английские
 * буквы.
 */

public class Task2_9 {

    public static void main (String [] args){

        String s1 = "AsdawAwWWe rAW erASF fdsaAWEFfsaWWsWdwW";

        int countSmal = 0;
        int countBig = 0;

        for (int i = 0; i<s1.length(); i++){

            if (s1.charAt(i)>= 'A' && s1.charAt(i)<= 'Z'){

                countBig++;

            } else if (s1.charAt(i)>= 'a' && s1.charAt(i)<='z'){

                countSmal++;
            }
        }

        System.out.println("Маленьких букв: " + countSmal + ". Больших букв: " + countBig);
    }
}
