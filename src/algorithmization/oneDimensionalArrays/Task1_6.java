package algorithmization.oneDimensionalArrays;

/**
 * Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
 * являются простыми числами.
 */


import java.util.Arrays;
import java.util.Scanner;

public class Task1_6 {

    public static void main (String [] ar){

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        int n = sc.nextInt();

        float [] mass = new float[n];
        float result =0f;

        try {
            for (int i = 0; i < mass.length; i++) {
                mass[i] = (float) (Math.random() * ((n + 1) * 2) + ((-n) + (-1)));
            }
            System.out.println(Arrays.toString(mass));

            for (int i = 0; i < mass.length; i++) {

                if (mass[i] == 2 ^ (mass[i] % mass[i] == 0 & mass[i] > 1 & mass[i] % 2 != 0)) {
                    result = result + mass[i];
                }
            }
            System.out.println(result);
        }finally {
            sc.close();
        }
    }
}
