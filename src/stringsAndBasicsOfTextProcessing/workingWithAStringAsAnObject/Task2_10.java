package stringsAndBasicsOfTextProcessing.workingWithAStringAsAnObject;

/**
 * Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным
 * знаком. Определить количество предложений в строке X.
 */

import java.util.Scanner;

public class Task2_10 {

    public static void main (String [] ar){

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите предложения: ");

        int count = 0;
        try {

            while (!sc.hasNextLine()){

                sc.next();
                System.out.println();
            }

            String s1 = sc.nextLine();

            for (int i = 0; i<s1.length(); i++){

                if (s1.charAt(i)== '.' || s1.charAt(i)== '!' || s1.charAt(i)== '?'){

                    count++;
                }
            }

            System.out.println("Колличество предложений в строке: " + count);
        }finally{

            sc.close();
        }
    }
}
