package algorithmization.arrayOfArrays;

/**
 * Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
 * единиц равно номеру столбца.
 */


import java.util.Random;

public class Task2_14 {

    public static void main (String [] args){

        Random rng = new Random();

        int line = rng.nextInt(10)+2;
        int column = rng.nextInt(10)+2;

        int[][] matrix = new int[line][column];

        int counter = 0;

        System.out.print("Матрица размером " + line + " на " + column + ":");
        System.out.println();

            //Заполняем матрицу
            for (int i = 0; i < line; i++) {


                for (int j = counter; j<column; j++){
                    matrix[i][j] = 1;
                }
                counter++;
            }

            //Выводим матрицу на экран
            for (int i = 0; i < line; i++) {

                for (int j = 0; j < column; j++) {
                    System.out.print(matrix[i][j] + "\t");
                }
                System.out.println();
            }
            System.out.println();



    }
}
