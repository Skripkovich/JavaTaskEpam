package algorithmization.decompositionWithUsingMethods;

 /**
 *  Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
 * Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
 */

import java.util.Scanner;

public class Task4_16 {

    static int [] massiv(int a) {
        int temp = a;
        int count = 0;  // Размер массива

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
            if (mass[i]%2==0){

            }else {
                summ = summ+mass[i];
            }
        }
        return summ;
    }

    static int evenNumber (int a){
        int temp = a;
        int count = 0;
        int countEven = 0;

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

        for (int i = 0; i<mass.length; i++){
            if (mass[i]%2==0){
                countEven++;
            }
        }
        return countEven;
    }

    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите n-значное число: ");
        int n = sc.nextInt();

        int summ = summ(massiv(n));

        System.out.println("Сумма нечетных цифр n-значного числа равна " + summ);

        System.out.print("Колличество четных цифр в найденной сумме: " + evenNumber(summ));
    }
}
