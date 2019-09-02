package algorithmization.arrayOfArrays;

/**
 *  Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
 */


import java.util.Scanner;
import java.util.Random;

public class Task2_12 {

    public static void main (String [] args){

        Scanner sc1 = new Scanner(System.in);

        Random rng = new Random();

        System.out.print("Введите строки матрицы: ");
        int line = sc1.nextInt();
        System.out.print("Введите столбцы матрицы: ");
        int column = sc1.nextInt();

        int[][] matrix = new int[line][column];

        boolean flag = false;

        try {

            //Заполняем матрицу
            for (int i = 0; i < line; i++) {

                for (int j = 0; j < column; j++) {
                    matrix[i][j] = rng.nextInt(100);
                }
            }

            //Выводим матрицу на экран
            for (int i = 0; i < line; i++) {

                for (int j = 0; j < column; j++) {
                    System.out.print(matrix[i][j] + "\t");
                }
                System.out.println();
            }
            System.out.println();

            // Сортируем по возрастанию
           while (!flag){

               flag = true;

               for (int i = 0; i<line; i++){

                   for (int j = 0; j<column-1; j++){
                       if (matrix[i][j]>matrix[i][j+1]){

                           flag = false;

                           int a = 0;
                           a = matrix[i][j];
                           matrix[i][j] = matrix[i][j+1];
                           matrix[i][j+1] = a;
                       }
                   }
               }
           }

           flag = false;

            //Выводим матрицу
            for (int i = 0; i < line; i++) {

                for (int j = 0; j < column; j++) {
                    System.out.print(matrix[i][j] + "\t");
                }
                System.out.println();
            }
            System.out.println();

            //Сортируем по убыванию
            while (!flag){

                flag = true;

                for (int i = 0; i<line; i++){

                    for (int j = 0; j<column-1; j++){
                        if (matrix[i][j]<matrix[i][j+1]){

                            flag = false;

                            int a = 0;
                            a = matrix[i][j+1];
                            matrix[i][j+1] = matrix[i][j];
                            matrix[i][j] = a;
                        }
                    }
                }
            }

            //Выводим матрицу
            for (int i = 0; i < line; i++) {

                for (int j = 0; j < column; j++) {
                    System.out.print(matrix[i][j] + "\t");
                }
                System.out.println();
            }
        }finally {
            sc1.close();
        }
    }
}
