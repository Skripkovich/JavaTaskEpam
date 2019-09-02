package algorithmization.oneDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task1_7 {

    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        int n = sc.nextInt();

        float [] mass = new float[n];
        float res = 0.0f;
        int a = 1;

        try {
            for (int i = 0; i < mass.length; i++) {
                mass[i] = (float) (Math.random() * ((n + 1) * 2) + ((-n) + (-1)));
            }
            System.out.println(Arrays.toString(mass));
            System.out.println();

            for (int i = 0; i < mass.length / 2; i++) {
                res = res + (mass[i] + (mass[mass.length - a]));
                a++;
            }

            System.out.print(res);
        }finally {
            sc.close();
        }
    }
}
