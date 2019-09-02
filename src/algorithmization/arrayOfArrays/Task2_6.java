package algorithmization.arrayOfArrays;

/**
 * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)
 */


import java.util.Scanner;

public class Task2_6 {

    public static void main (String[] args){

        Scanner sc1 = new Scanner(System.in);

        System.out.print("Введите четные строки матрицы: ");
        int line = sc1.nextInt();
        System.out.print("Введите четные столбцы матрицы: ");
        int column = sc1.nextInt();

        int a =column-1;

        try{
            if (line%2==0 & column%2==0) {
                int[][] matrix = new int[line][column];

                //Заполняем матрицу
                for (int i = 0; i < line; i++) {

                    for (int j = 0; j <column; j++) {
                        matrix[i][j] =1;
                    }
                }

                for (int i = 0; i<line/2; i++){

                    for (int j = 1; j<column/2; j++){
                        for (int k =0; k<=j; k++) {
                            matrix[j][k] = 0;
                        }
                        for (int d = 0;d<=j; d++){
                            matrix[j][a-d]=0;
                        }
                    }
                }

                for (int i = (line/2)+1; i<line; i++){

                    for (int j = line/2; j<line/2; j++){
                        for (int k =column/2; k<column/2; k++) {
                            matrix[j][k] = 0;
                        }
                        //for (int d = 0;d<=j; d++){
                        //    matrix[j][a-d]=0;
                        //}
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
        }
    }
}
