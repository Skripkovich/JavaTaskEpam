package algorithmization.oneDimensionalArrays;

/**
 * Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
 * положительных и нулевых элементов.
 */


import java.util.Scanner;
import java.util.Random;

public class Task1_3 {

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        int n = sc.nextInt();

        Random rnd = new Random();

        int[] a = new int[n];

        int b = 0;// счетчик для положительных чисел
        int c = 0;// счетчик для чисел нуль
        int d = 0;// счетчик для отрицательных чисел

        try {
            for (int i = 0; i < a.length; i++) {
                a[i] = rnd.nextInt();
                if (a[i] > 0) {
                    b++;
                } else if (a[i] == 0) {
                    c++;
                } else d++;
            }

            System.out.println();
            System.out.println("Положительных чисел в массиве: " + b);
            System.out.println("Чисел равных нулю в массиве: " + c);
            System.out.println("Отрицательных чисел в массиве: " + d);
        } finally {
            sc.close();
        }
    }
}
