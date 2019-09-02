package algorithmization.decompositionWithUsingMethods;

 /**
 *  Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких
 * действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.
 */

import java.util.Scanner;

public class Task4_17 {

    static int [] massiv(int a) {
        int temp = a;
        int count = 0;

        while (temp > 0)
        {
            count++;
            temp = temp / 10;
        }

        int[] mass = new int[count];

        int j = count - 1;

        while (a > 0)
        {
            mass[j--] = a % 10;
            a = a / 10;
        }
        return mass;
    }

    static int summ (int [] mass){

        int summ = 0;

        for (int i = 0; i<mass.length; i++){

            summ = mass[i] + summ;
        }

        return summ;
    }

    static int subtraction (int n){

        int total =n;
        int count = 0;

        while (total>0) {

            total = total - summ(massiv(total));
            count++;
        }

        return count;
    }

    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите число: ");
        int n = sc.nextInt();

        System.out.println(subtraction(n));
    }

}
