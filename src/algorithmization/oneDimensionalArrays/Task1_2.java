package algorithmization.oneDimensionalArrays;

/**
 *  Дана последовательность действительных чисел а1 ,а2 ,..., аn. Заменить все ее члены, большие данного Z, этим
 * числом. Подсчитать количество замен.
 */


import java.util.Scanner;
import java.util.Random;

 class Task1_2 {

    public static void main (String [] args){

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        int n = sc2.nextInt();
        System.out.print("Введите число Z: ");
        int z = sc1.nextInt();

        int [] a = new int[n];
        Random rnd = new Random();

        try {
            for (int i = 0; i < a.length; i++) {
                a[i] = rnd.nextInt();
                System.out.print(a[i] + " ");
            }

            System.out.println();
            System.out.println("Результат после преобразования: ");

            for (int i = 0; i < a.length; i++) {
                if (a[i] > z) {
                    a[i] = z;
                }
                System.out.print(a[i] + " ");
            }
        }finally {
            sc1.close();
            sc2.close();
        }

    }
}
