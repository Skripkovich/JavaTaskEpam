package algorithmization.arrayOfArrays;

/**
 *  Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
 */

import java.util.Random;
import java.util.Scanner;

public class Task2_2 {
    public static void main (String [] ar){

        Random rng = new Random();

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Введите строки массива: ");
        int a = sc1.nextInt();
        System.out.print("Введите столбцы массива: ");
        int b = sc2.nextInt();

        try {
            int[][] matrix = new int[a][b];

            //Заполняем массив
            for (int i = 0; i < a; i++) {

                for (int j = 0; j < b; j++) {
                    matrix[i][j] = rng.nextInt(50);
                }
            }

            //Выводим массив на экран
            for (int i = 0; i < a; i++) {

                for (int j = 0; j < b; j++) {
                    System.out.print(matrix[i][j] + "\t");
                }
                System.out.println();
            }
            System.out.println();

            System.out.print("Выводим числа по диагонали: ");
            //Выводим числа по диагонали матрицы
            for (int i = 0; i<b; i++){

                    for (int j=0; j<a; j++){

                        if (i==j) {
                            System.out.print(matrix[j][i] + " ");
                        }
                    }

            }
        } finally {
            sc1.close();
            sc2.close();
        }
    }
}
