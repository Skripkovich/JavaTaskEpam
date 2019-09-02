package algorithmization.arrayOfArrays;

 /**
 * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)
 */

import java.util.Scanner;

public class Task2_5 {

    public static void main (String [] args){

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.print("Введите четные строки матрицы: ");
        int line = sc1.nextInt();
        System.out.print("Введите четные столбцы матрицы: ");
        int column = sc2.nextInt();

        int a = 1; // счетчик для заполнения матрицы
        int b = column; // счетчик который добовляет нуль в конце

        try{
            if (line%2==0 & column%2==0) {
                int[][] matrix = new int[line][column];

                //Заполняем матрицу
                for (int i = 0; i < line; i++) {

                        for (int j = 0; j <b; j++) {
                            matrix[i][j] =a;
                        }
                        a++;
                        b--;
                }

                //Выводим матрицу на экран
                for (int i = 0; i < line; i++) {

                    for (int j = 0; j < column; j++) {
                        System.out.print(matrix[i][j] + "\t");
                    }
                    System.out.println();
                }
            } else System.out.print("Введите четные строки и столбцы матрицы");
        }finally {
            sc1.close();
            sc2.close();
        }
    }
}
