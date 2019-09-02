package stringsAndBasicsOfTextProcessing.workingWithStringsAsAnArrayOfCharacters;

/**
 * Замените в строке все вхождения 'word' на 'letter'.
 */

public class Task1_2 {

    public static void main (String[] args){

        String s1 = "ASdjf;sd word ladskf', lasdlf , sdf word, dfkl word sdlfkgkasdf 123 word";

        System.out.println("Old string: " + s1);
        System.out.println("New string: " + s1.replace("word", "letter"));
    }
}
