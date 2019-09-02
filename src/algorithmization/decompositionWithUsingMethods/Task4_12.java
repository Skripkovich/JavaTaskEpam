package algorithmization.decompositionWithUsingMethods;

 /**
 * Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого
 * являются числа, сумма цифр которых равна К и которые не большее N.
 */

import java.util.Scanner;
import java.util.Random;

public class Task4_12 {

    static int [] mass(int a) {
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

    static int summ (int [] mas){

        int summ = 0;
         for (int i = 0; i<mas.length; i++){

             summ = summ+mas[i];
         }

         return summ;
    }

    static void array (int k, int n, int b){

        int [] array = new int[b];
        int count = 0;

        Random rng = new Random();

        while (count<array.length){

            int number = rng.nextInt(100000);
            int number1 = summ(mass(number));

            if(number1 == k & number<n){

                array[count] = number;
                count++;
            }
        }

        for (int i = 0; i< array.length; i++){

            System.out.print(array[i] + " ");
        }
    }

    public static void main (String[]args){

        Scanner sc = new Scanner(System.in);


        System.out.print("Введите число K: ");
        int k = sc.nextInt();
        System.out.print("Введите число N: ");
        int n = sc.nextInt();
        System.out.print("Введите длинну массива: ");
        int b = sc.nextInt();

        array(k,n,b);
    }
}
