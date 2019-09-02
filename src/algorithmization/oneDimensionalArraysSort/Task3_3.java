package algorithmization.oneDimensionalArraysSort;

/**
 * Сортировка выбором. Дана последовательность чисел a1<= a2<=...<=an. Требуется переставить элементы так,
 * чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
 * элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
 * повторяется. Написать алгоритм сортировки выбором.
 */


import java.util.Scanner;
import java.util.Random;

public class Task3_3 {

    public static void main(String[] ar){

        Scanner sc = new Scanner(System.in);

        Random rng = new Random();

        System.out.print("Введите длинну массива: ");
        int a = sc.nextInt();

        int [] mass = new int[a];

        try {

            //Заполняем массив
            for(int i = 0; i<mass.length; i++){

                mass[i] = rng.nextInt(200);
            }

            //Выводим исходный массив
            System.out.println("Массив: ");
            for (int i = 0; i<mass.length; i++){
                System.out.print(mass[i] + " ");
            }

            System.out.println();

            //Перебераем массив
            for (int i = 0; i < mass.length; i++) {

                int min = mass[i];
                int index = i;

                for (int j =i+1; j < mass.length; j++) {

                    //Проверяем значение относительно минимального
                    if (mass[j] < min) {
                        min = mass[j];
                        index = j;
                    }
                }

                //Меняем элементы
                if (i != index) {
                    int temp = mass[i];
                    mass[i] = mass[index];
                    mass[index] = temp;
                }

                System.out.print(mass[i] + " ");
            }

        }finally{
            sc.close();
        }
    }
}
