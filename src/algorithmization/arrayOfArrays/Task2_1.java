 /**
 * Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
 */

 package algorithmization.arrayOfArrays;

import java.util.Scanner;
import java.util.Random;


public class Task2_1 {

    public static void main (String [] args){

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
                for (int i = 0; i<a; i++){

                    for (int j = 0; j<b; j++){
                        matrix[i][j] = rng.nextInt(50);
                    }
                }

                //Выводим массив на экран
                for (int i = 0; i<a; i++){

                    for (int j = 0; j<b; j++){
                    System.out.print(matrix[i][j] + "\t");
                    }
                        System.out.println();
                }

                System.out.println();
                System.out.println("Значение столбцов у которых первый элемент больше последнего:");

                //Проверяем что бы первый элемент был больше последнего  и выводим на экран
            for (int i = 0; i<b; i++){

                if(matrix[a-1][i]<=matrix[0][i] & i%2==1){

                    for (int j=0; j<a; j++){

                        System.out.print(matrix[j][i] + " ");
                    }
                }
            }
        }finally {
            sc1.close();
            sc2.close();
        }
    }
}
