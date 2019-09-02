package algorithmization.oneDimensionalArrays;

/**
 *  Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
 */


import java.util.Arrays;
import java.util.Scanner;

public class Task1_4 {

    public static void main (String [] ar) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        int b;
        boolean flag = false;


        try {
            for (int i = 0; i < a.length; i++) {
                a[i] = (int) (Math.random() * ((n + 1) * 2) + ((-n) + (-1)));
            }
            System.out.println(Arrays.toString(a));

            while (!flag) {
                flag = true;
                for (int i = 0; i < a.length - 1; i++) {
                    if (a[i] > a[i + 1]) {
                        flag = false;

                        b = a[i];
                        a[i] = a[i + 1];
                        a[i + 1] = b;
                    }
                }
            }
            System.out.println();
            System.out.println(Arrays.toString(a));
        }finally {
            sc.close();
        }
    }
}
