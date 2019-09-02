package algorithmization.arrayOfArrays;

/**
 * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)
 */


import java.util.Scanner;

public class Task2_4 {

    public static void main(String[] args){

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.print("Введите четные строки матрицы: ");
        int line = sc1.nextInt();
        System.out.print("Введите четные столбцы матрицы: ");
        int column = sc2.nextInt();

        int a =0; // счетчик

        try{
            if (line%2==0 & column%2==0) {
                int[][] matrix = new int[line][column];

                //Заполняем матрицу
                for (int i = 0; i < line; i++) {

                    if (i % 2 == 0 || i == 0) {
                        for (int j = 0; j < column; j++) {
                            matrix[i][j] = j + 1;
                            a++;
                        }
                    } else {
                        for (int k = 0; k < column; k++) {
                            matrix[i][k] = a;
                            a--;
                        }
                        a = 0;
                    }
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
