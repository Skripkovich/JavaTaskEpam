package BasicsOfSoftwareCodeDevelopment.branching;

/**
 *  Найти max{min(a, b), min(c, d)}.
 */

import java.util.Scanner;

public class Task2 {

    public static void main (String [] ar){

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        Scanner sc4 = new Scanner(System.in);

        // вводим числа для нахождения среди них минимального
        System.out.print("Введите первое число: ");
        double a = sc1.nextDouble();
        System.out.print("Введите второе число: ");
        double b = sc2.nextDouble();
        System.out.print("Введите третье число: ");
        double c = sc3.nextDouble();
        System.out.print("Введите четвертое число: ");
        double d = sc4.nextDouble();

        sc1.close();
        sc2.close();
        sc3.close();
        sc4.close();

        //Объявляем 3 переменные для минимальных значений и максимального среди минимальных
        double min1;
        double min2;
        double max;

        //Находим минимальное число между a и b
        if (a<b){
             min1 = a;
        } else {
             min1 = b;
        }

        //Находим минимальное число между с и d
        if (c<d){
             min2 = c;
        } else {
             min2 = d;
        }

        //Находим максимальные значение среди минимальных
        if (min1>min2){
            max = min1;
        } else {
            max = min2;
        }

        // Выводим на экран полученное значение
        System.out.println(max);
    }
}
