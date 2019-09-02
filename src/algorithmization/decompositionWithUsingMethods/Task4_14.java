package algorithmization.decompositionWithUsingMethods;

/**
 * Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
 * возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи
 * использовать декомпозицию.
 */

import java.util.Scanner;

public class Task4_14 {

    static int numberOfDigits (int a){
        int var = a;
        int check =0;

        while (var>0){

            var=var/10;
            check++;
        }
        return check;
    }

    static boolean armstrong (int a){

            int sum = 0;
            int var1 = a;
            int var2 = 0;

            while (var1>0){
                var2=var1%10;
                sum = sum+(int)Math.pow(var2,numberOfDigits(a));
                var1=var1/10;
            }
            if (a==sum){
                return true;
            }else return false;
    }

    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите число k: ");
        int k = sc.nextInt();

        for (int i = 1; i<=k; i++){

            if (armstrong(i)==true){

                System.out.println(i);
            }
        }
    }
}
