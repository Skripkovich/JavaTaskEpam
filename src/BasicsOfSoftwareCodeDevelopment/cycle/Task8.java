package BasicsOfSoftwareCodeDevelopment.cycle;

/**
 * Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
 */

import java.util.Scanner;

public class Task8 {

    public static void main (String [] args){

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner (System.in);

        System.out.print("Введите первое число: ");
        int a = sc1.nextInt();
        System.out.print("Введите второе число: ");
        int b = sc2.nextInt();

        sc1.close();
        sc2.close();

        String a1 = Integer.toString(a);
        String a2 = Integer.toString(b);

        for (int i = 0; i<a1.length(); i++){

            System.out.print("/" + a1.charAt(i) + "/");
        }

        System.out.println();

        for (int i = 0; i<a2.length(); i++){

            System.out.print("/" + a2.charAt(i) + "/");
        }
    }

}
