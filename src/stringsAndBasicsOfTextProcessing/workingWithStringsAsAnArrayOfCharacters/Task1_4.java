package stringsAndBasicsOfTextProcessing.workingWithStringsAsAnArrayOfCharacters;

/**
 *  В строке найти количество чисел.
 */

public class Task1_4 {

    public static void main (String [] args){

        String s1 = "2 Skdsfj-21239 sdlf33 3456.61 sldgl-19394";

        int count = 0;

        for(int i = 0; i<s1.length(); i++) {

            if (Character.isDigit(s1.charAt(i))){

                for (int j = i; j<s1.length(); j++){

                    if (Character.isDigit(s1.charAt(j))){
                        if (i==s1.length()-1){
                            count++;
                        }else {
                            continue;
                        }
                    }
                    else if(!Character.isDigit(s1.charAt(j)) && (s1.charAt(j)=='.' || s1.charAt(j)==',')){
                        continue;
                    }
                    else if (!Character.isDigit(s1.charAt(j))){
                        i=j;
                        count++;
                        break;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
