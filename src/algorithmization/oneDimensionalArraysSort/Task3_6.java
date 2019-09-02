package algorithmization.oneDimensionalArraysSort;

/**
 * Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
 * Делается это следующим образом: сравниваются два соседних элемента ai и ai+1. Если ai<=ai+1, то продвигаются
 * на один элемент вперед. Если ai > ai+1, то производится перестановка и сдвигаются на один элемент назад.
 * Составить алгоритм этой сортировки.
 */


import java.util.Scanner;
import java.util.Random;

public class Task3_6 {

    public static void main (String[] args){

        Scanner sc = new Scanner (System.in);

        Random rng = new Random();

        System.out.print("Введите длинну массива: ");
        int a = sc.nextInt();

        int[] mass = new int[a];

        int b =1;
        int key = mass.length;

        try {

            //Заполняем массив
            for(int i = 0; i<mass.length; i++){

                mass[i] = rng.nextInt(200);
            }

            //Выводим массив на экран
            for (int i = 0; i<mass.length; i++){
                System.out.print(mass[i] + " ");
            }
            System.out.println();

            //используем сортировку Шелла
            while (b < key / 3)
                b = 3 * b + 1;

            while (b >= 1) {
                for (int i = b; i < mass.length; i++) {
                    for (int j = i; j >= b && mass[j] < mass[j - b]; j -= b) {
                        int temp = mass[j];
                        mass[j] = mass[j - b];
                        mass[j - b] = temp;
                    }
                }
                b = b / 3;
            }

            //Выводим массив на экран
            for (int i = 0; i<mass.length; i++){
                System.out.print(mass[i] + " ");
            }
            System.out.println();

        }finally {
            sc.close();
        }
    }
}
