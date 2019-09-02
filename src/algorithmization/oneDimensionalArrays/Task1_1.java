package algorithmization.oneDimensionalArrays;

 /**
 * В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
 */

import java.util.Scanner;

public class Task1_1 {

    public static void main(String[] args) {

        int b=0;
        int a[] = new int[b];
        int k = 3;
        int min = 1;
        int max = 100;
        int total = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите длинну массива: ");
        b = sc.nextInt();

        try {

            //Заполняем массив
            for (int i = 0; i < a.length; i++) {
                a[i] = min + (int) (Math.random() * max);
            }

            for (int i = 0; i < a.length; i++) {
                if (a[i] % k == 0) {
                    total = total + a[i];
                }
            }
            System.out.println(total);
        } finally {
            sc.close();
        }


    }
}
