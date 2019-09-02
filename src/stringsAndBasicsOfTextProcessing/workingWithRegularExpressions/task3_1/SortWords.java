package stringsAndBasicsOfTextProcessing.workingWithRegularExpressions.task3_1;

import java.util.regex.Pattern;

public class SortWords {
    public static void sortWords (String s){

        Pattern p = Pattern.compile("\\.");
        String [] s1 = p.split(s);

        p = Pattern.compile("\\s+");

        for (int i = 0; i< s1.length; i++) {

            String [] words = p.split(s1[i]);
            String totalWords = "";

            boolean flag = false;

            while (!flag){
                flag = true;

                for (int j = 0; j<words.length-1;j++){

                    if (words[j].length()>words[j+1].length()){

                        flag = false;

                        String a = words[j];
                        words[j] = words[j+1];
                        words[j+1] = a;
                    }
                }
            }

            for (int k = 0; k<words.length; k++){
                totalWords = totalWords + words[k]+ " ";

            }

            s1[i] = totalWords;
        }

        System.out.println();
        for (int i = 0; i< s1.length; i++) {
            System.out.println(s1[i]);
        }
    }
}
