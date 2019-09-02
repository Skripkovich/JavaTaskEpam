package algorithmization.arrayOfArrays;

/**
 * Сформировать квадратную матрицу порядка N по правилу A[i,j]=sin(i^2-j^2/N)
 */


import java.util.Scanner;

public class Task2_7 {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите N: ");
        int n = sc.nextInt();

        float [][] matrix = new float[n][n];

        //Заполняем матрицу
        for (int i = 0; i<n; i++){

            for (int k = 0; i<n; i++){

                float c = (float)Math.toRadians(i);
                float j = (float) Math.toRadians(k);
                matrix[i][k] = (float) Math.sin(((float)Math.pow(c,2)-(float)Math.pow(j,2))/ n);
            }
        }

        //Выводим матрицу на экран
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}
