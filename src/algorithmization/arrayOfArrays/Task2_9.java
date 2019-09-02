package algorithmization.arrayOfArrays;

 /**
 * Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
 * столбец содержит максимальную сумму.
 */


import java.util.Scanner;
import java.util.Random;

public class Task2_9 {

    public static void main (String[] args){

        Scanner sc1 = new Scanner(System.in);

        Random rng = new Random();

        System.out.print("Введите строки матрицы: ");
        int line = sc1.nextInt();
        System.out.print("Введите столбцы матрицы: ");
        int column = sc1.nextInt();

        int summ = 0;
        int numberColimn = 0;
        int check = 0;

        try {

            int[][] matrix = new int[line][column];

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

            //Высчитываем сумму столбца и номер
            for (int i = 0; i<column; i++){
                summ = 0;
                for (int j = 0; j<line; j++){
                    summ =summ + matrix[j][i];
                }
                System.out.print(summ + " ");
                if (summ>check){
                    check = summ;
                    numberColimn = i;
                }
            }

            System.out.println();
            System.out.print("Наибольшая сумма в столбике: " + (numberColimn+1));

        }finally {
            sc1.close();
        }
    }
}
