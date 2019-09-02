package algorithmization.arrayOfArrays;

/**
 *  В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
 * на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
 * пользователь с клавиатуры.
 */


import java.util.Scanner;
import java.util.Random;

public class Task2_8 {

    public static void main (String [] arg){

        Scanner sc1 = new Scanner(System.in);

        Random rng = new Random();

        System.out.print("Введите четные строки матрицы: ");
        int line = sc1.nextInt();
        System.out.print("Введите четные столбцы матрицы: ");
        int column = sc1.nextInt();

        int a=0;

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

            System.out.print("Введите первый столбец матрицы для замены: ");
            int firstColum = sc1.nextInt();
            System.out.print("Введите второй столбец матрицы для замены: ");
            int secondColumn = sc1.nextInt();

            for (int i = 0; i<line; i++){
                a=matrix[i][firstColum-1];
                matrix[i][firstColum-1]=matrix[i][secondColumn-1];
                matrix[i][secondColumn-1]=a;
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
