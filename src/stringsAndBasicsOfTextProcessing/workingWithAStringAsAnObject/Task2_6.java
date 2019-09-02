package stringsAndBasicsOfTextProcessing.workingWithAStringAsAnObject;

/**
 * Из заданной строки получить новую, повторив каждый символ дважды.
 */

public class Task2_6 {

    public static void main (String [] args){

        String s1 = "1,a,s,34,p,e df,a|a|a";
        StringBuilder s2 = new StringBuilder (s1.length()*2);

        System.out.println(s1);

        for (int i = 0; i<s1.length(); i++){

           s2.append(s1.charAt(i));
           s2.append(s1.charAt(i));

        }

        System.out.println(s2.toString());
    }
}
