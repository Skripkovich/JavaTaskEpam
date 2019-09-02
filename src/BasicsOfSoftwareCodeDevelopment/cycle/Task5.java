package BasicsOfSoftwareCodeDevelopment.cycle;

/**
 * Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
 * заданному е.
 */

import java.util.Scanner;

public class Task5 {
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите колличество чисел в ряде: ");
        double n = sc.nextInt() ;
        sc.close();

        double e = 0.005;
        double rezult = 0;

        for (double i=1; i<n; i++){
           double a=(1/Math.pow(2.0,i))+(1/Math.pow(3.0,i));

             if (a>=e){
                 rezult = rezult + a;
             }
        }

        System.out.println("Сумма чисел равна: " + rezult);
    }

}
