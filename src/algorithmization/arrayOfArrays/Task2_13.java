package algorithmization.arrayOfArrays;

 /**
 *  Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
 */


import java.util.Scanner;
import java.util.Random;

public class Task2_13 {

    public static void main(String[] args){

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

                for (int i = 0; i<column; i++){

                    for (int j = 0; j<line-1; j++){
                        if (matrix[j][i]>matrix[j+1][i]){

                            flag = false;

                            int a = 0;
                            a = matrix[j][i];
                            matrix[j][i] = matrix[j+1][i];
                            matrix[j+1][i] = a;
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

                for (int i = 0; i<column; i++){

                    for (int j = 0; j<line-1; j++){
                        if (matrix[j][i]<matrix[j+1][i]){

                            flag = false;

                            int a = 0;
                            a = matrix[j+1][i];
                            matrix[j+1][i] = matrix[j][i];
                            matrix[j][i] = a;
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
