package algorithmization.arrayOfArrays;

 /**
 * Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
 */


import java.util.Random;
import java.util.Scanner;

public class Task2_3 {

    public static void main (String[] ar){

        Random rng = new Random();

        Scanner sc1 = new Scanner(System.in);

        System.out.print("Введите строки матрицы: ");
        int line = sc1.nextInt();
        System.out.print("Введите столбцы матрицы: ");
        int column = sc1.nextInt();

        try {
            int[][] matrix = new int[line][column];

            //Заполняем массив
            for (int i = 0; i < line; i++) {

                for (int j = 0; j < column; j++) {
                    matrix[i][j] = rng.nextInt(50);
                }
            }

            //Выводим массив на экран
            for (int i = 0; i < line; i++) {

                for (int j = 0; j < column; j++) {
                    System.out.print(matrix[i][j] + "\t");
                }
                System.out.println();
            }
            System.out.println();

            System.out.print("Введите k-ю строку матрицы: ");
            int k = sc1.nextInt();
            System.out.print("Введите p-й столбец матрицы: ");
            int p = sc1.nextInt();

            //Выводим строки и столбцы выбранные пользователем
            if (k<=line & p<=column) {
                System.out.print("Ваша выбранная строка: ");
                for (int i = 0; i < column; i++) {
                    System.out.print(matrix[k-1][i] + " ");
                }

                System.out.println();
                System.out.print("Ваш выбранный столбец: ");
                for (int i = 0; i < line; i++) {
                    System.out.print(matrix[i][p-1] + " ");
                }
            } else {
                System.out.println("Заданные числа выходят за диапазон матрицы");
            }

        } finally {
            sc1.close();
        }
    }
}
