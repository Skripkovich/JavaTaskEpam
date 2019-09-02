package algorithmization.oneDimensionalArrays;

/**
 * Дана последовательность целых чисел a1, a2,.. an. Образовать новую последовательность, выбросив из
 * исходной те члены, которые равны min(a1, a2,...an)
 */


 import java.util.Scanner;
 import java.util.Random;

public class Task1_8 {

    public static void main (String [] ar){

        Scanner sc = new Scanner(System.in);

        Random rng = new Random();

        System.out.print("Введите длинну массива: ");
        int n = sc.nextInt();

        int [] arr = new int [n];

        try {
            //заполняем массива
            for (int i = 0; i < n; i++) {

                arr[i] = rng.nextInt(10) + 1;
            }

            //выводим массив на экран
            for (int i = 0; i < n; i++) {

                System.out.print(arr[i] + " ");
            }
            System.out.println();

            //находим наименьшее число/числа
            int min = arr[0];
            for (int i = 1; i < n; i++) {

                if (arr[i] <= min) {
                    min = arr[i];
                }
            }

            System.out.println("________________________________");
            //выводим полученный результат
            for (int i = 0; i < arr.length; i++) {

                if (arr[i] == min) {
                    continue;
                } else {
                    System.out.print(arr[i] + " ");
                }
            }
        }finally {
            sc.close();
        }

    }
}
