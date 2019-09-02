package algorithmization.oneDimensionalArrays;

/**
 *  Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
 */


import java.util.Arrays;
import java.util.Scanner;

public class Task1_5 {

    public static void main (String [] ar){

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        int n = sc.nextInt();

        int [] mass = new int[n];

        try {
            for (int i = 0; i < mass.length; i++) {
                mass[i] = (int) (Math.random() * (n + 1));
            }
            System.out.println(Arrays.toString(mass));
            System.out.println();

            for (int i = 0; i < mass.length; i++) {

                if (mass[i] > i) {
                    System.out.print(mass[i] + " ");
                }
            }
        }finally {
            sc.close();
        }
    }
}
