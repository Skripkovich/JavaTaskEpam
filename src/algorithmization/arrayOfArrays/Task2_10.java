package algorithmization.arrayOfArrays;

/**
 * Найти положительные элементы главной диагонали квадратной матрицы.
 */


import java.util.Scanner;
import java.util.Random;

public class Task2_10 {

    public static void main (String [] args){

        Scanner sc1 = new Scanner(System.in);

        Random rng = new Random();

        System.out.print("Введите строки матрицы: ");
        int line = sc1.nextInt();
        System.out.print("Введите столбцы матрицы: ");
        int column = sc1.nextInt();

        int[][] matrix = new int[line][column];

        int summ = 0;

        try {

            //Заполняем матрицу
            for (int i = 0; i < line; i++) {

                for (int j = 0; j < column; j++) {
                    matrix[i][j] = rng.nextInt(50);
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

            //Подсчет главной диагонали матрицы
            for (int i = 0; i<line;i++){

                for (int j = 0; j<column; j++){

                    if (i==j){
                        summ += matrix[i][j];
                    }
                }
            }

            System.out.println("Сумма главной диагонали: " + summ);

        }finally {
            sc1.close();
        }
    }

}
