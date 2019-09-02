package algorithmization.decompositionWithUsingMethods;

/**
 * Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
 * Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
 * массива с номерами от k до m.
 */


import java.util.Random;
import java.util.Scanner;

public class Task4_8 {

    static int [] array (int n){

        Random rng = new Random();

        int [] array = new int[n];


        for (int i = 0; i<array.length; i++){

            array[i] = rng.nextInt(20);
        }
        return array;
    }

    static void summ (int [] array, int k, int m){

        for (int i = k-1; i<m-1; i++){

            int summ = 0;

            if (i==(m-2)){
                summ = array[i-1] + array[i] + array[i+1];
                System.out.println(summ);
            }else {
                summ = array[i] + array[i + 1] + array[i + 2];
                i = i + 1;
                System.out.println(summ);
            }
        }
    }

    public static void main (String[] args){

        Scanner sc1 = new Scanner(System.in);

        System.out.print("Введите длинну массива: ");
        int n = sc1.nextInt();
        System.out.print("Вычисление суммы от: ");
        int k = sc1.nextInt();
        System.out.print("Вычисление суммы до: ");
        int m = sc1.nextInt();


        try {

            int [] arr = array(n);

            for (int i = 0; i<arr.length; i++){

                System.out.print(arr[i] + " ");
            }
            System.out.println();

            //выводим сумму
            summ(arr,k,m);

        }finally {
            sc1.close();
        }
    }
}
