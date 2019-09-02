package BasicsOfSoftwareCodeDevelopment.cycle;

/**
 *  Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
 */

public class Task6 {

    public static void main (String [] args){

        String a = "Я люблю изучать Java";

        for (int i =0; i<a.length(); i++){

            int code = a.charAt(i);
            System.out.println(code);
        }
    }
}
