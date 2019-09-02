package algorithmization.decompositionWithUsingMethods;

/**
 *  На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими
 * из пар точек самое большое расстояние. Указание. Координаты точек занести в массив
 */


import java.util.Scanner;
import java.util.Random;

public class Task4_4 {

    static int point1 (int n, int [] x, int [] y){

        int max = 0;
        int imax = 0;
        for (int i = 0; i<n; i++){

            for (int j = 0; j<n; j++){

                if ((int)Math.sqrt(Math.pow((x[i]-x[j]),2) + Math.pow((y[i]-y[j]),2))>max) {
                    max = (int) Math.sqrt(Math.pow((x[i] - x[j]), 2) + Math.pow((y[i] - y[j]), 2));
                    imax = i+1;
                }
            }
        }
        return imax;
    }

    static int point2 (int n, int [] x, int [] y){

        int max = 0;
        int jmax = 0;
        for (int i = 0; i<n; i++){

            for (int j = 0; j<n; j++){

                if ((int)Math.sqrt(Math.pow((x[i]-x[j]),2) + Math.pow((y[i]-y[j]),2))>max) {
                    max = (int) Math.sqrt(Math.pow((x[i] - x[j]), 2) + Math.pow((y[i] - y[j]), 2));
                    jmax = j+1;
                }
            }
        }
        return jmax;
    }

    public static void main (String[] args){

        Scanner sc1 = new Scanner(System.in);

        Random rng = new Random();

        System.out.print("Введите количество точек: ");
        int n = sc1.nextInt();

        int[] x = new int[n];
        int[] y = new int[n];

        try {

            //Заполняем координаты точек
            for (int i = 0; i<n; i++){
                x[i] = rng.nextInt(50);
                y[i] = rng.nextInt(50);
            }

            //Выводим координаты точек
            for (int i = 0; i<n; i++){

                System.out.println("Координаты точек в формате Х и У для точки " + (i+1)+ ": " + x[i] + " " + y[i]);
            }

            System.out.print("Между точками " + point1(n,x,y) + " и " + point2(n,x,y) + " самое большое расстояние.");
        }finally {
            sc1.close();
        }
    }
}
