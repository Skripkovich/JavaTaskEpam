package algorithmization.arrayOfArrays;

/**
 * Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
 */


import java.util.Scanner;
import java.util.Random;

public class Task2_15 {

    public static void main (String [] args){

        Scanner sc1 = new Scanner(System.in);

        Random rng = new Random();

        System.out.print("Введите строки матрицы: ");
        int line = sc1.nextInt();
        System.out.print("Введите столбцы матрицы: ");
        int column = sc1.nextInt();

        int[][] matrix = new int[line][column];

        int max =0;

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

            //Находим максимальное число матрицы
            for (int i = 0; i<line; i++){

                for (int j = 0; j<column; j++){

                    if(matrix[i][j]>max){
                        max = matrix[i][j];
                    }
                }
            }

            System.out.println("Максимальное значение: " + max);

            //Меняем нечетные элементы на максимальное значение
            for (int i = 0; i<line; i++){

                for (int j = 0; j<column; j++){

                    if(matrix[i][j]%2==1){
                        matrix[i][j]=max;
                    }
                }
            }

            //Выводим матрицу на экран
            for (int i = 0; i < line; i++) {

                for (int j = 0; j < column; j++) {
                    System.out.print(matrix[i][j] + "\t");
                }
                System.out.println();
            }
        }finally{
            sc1.close();
        }
    }
}
