package algorithmization.decompositionWithUsingMethods;

/**
 * Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
 * которое меньше максимального элемента массива, но больше всех других элементов).
 */


import java.util.Scanner;
import java.util.Random;

public class Task4_5 {

    static int secondMax (int[]mass, int n){
        boolean flag = false;

        while (!flag) {
            flag = true;
            for (int i = 0; i < (n - 1); i++) {
                if (mass[i] > mass[i + 1]) {
                    flag = false;
                    int variable = 0;

                    variable = mass[i];
                    mass[i] = mass[i + 1];
                    mass[i + 1] = variable;
                }
            }
        }
        return mass[n-2];
    }

    public static void main(String[] args){

        Scanner sc1 = new Scanner(System.in);

        Random rng = new Random();

        System.out.print("Введите длинну массива: ");
        int n = sc1.nextInt();

        int[] mass = new int[n];

        try{

            //Заполняем массив
            for (int i = 0; i<n; i++){
                mass[i] = rng.nextInt(50);
            }

            //Выводим массив на экран
            for (int i = 0; i<n; i++){
                System.out.print(mass[i] + " ");
            }
            System.out.println();


            System.out.print("Число,которое меньше максимального элемента массива, но больше всех других элементов "+
                    + secondMax(mass, n));
        } finally {
            sc1.close();
        }
    }
}
