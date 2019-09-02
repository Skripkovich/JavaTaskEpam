package algorithmization.oneDimensionalArraysSort;

/**
 * Сортировка вставками. Дана последовательность чисел a1, a2,...an. Требуется переставить числа в порядке
 * возрастания. Делается это следующим образом. Пусть a1, a2...ai - упорядоченная последовательность, т. е.
 * a1<= a2<=...an. Берется следующее число ai+1 и вставляется в последовательность так, чтобы новая
 * последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i +1 до n
 * не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить
 * с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
 */


import java.util.Scanner;
import java.util.Random;

public class Task3_5 {

    public static void main(String[] ar){

        Scanner sc = new Scanner (System.in);

        Random rng = new Random();

        System.out.print("Введите длинну массива: ");
        int a = sc.nextInt();

        int[] mass = new int[a];

        int variable = 0;

        try{

            //Заполняем массив
            for(int i = 0; i<mass.length; i++){

                mass[i] = rng.nextInt(200);
            }

            //Выводим массив на экран
            for (int i = 0; i<mass.length; i++){
                System.out.print(mass[i] + " ");
            }
            System.out.println();

            //Сортируем массив
            for (int i = 1; i < mass.length; i++) {
                variable = mass[i];
                int j = i - 1;

                while (j >= 0 && mass[j] > variable) {
                    mass[j + 1] = mass[j];
                    j = j - 1;
                }
                mass[j + 1] = variable;
            }

            //Выводим массив на экран
            for (int i = 0; i<mass.length; i++){
                System.out.print(mass[i] + " ");
            }
            System.out.println();

        } finally {
            sc.close();
        }
    }
}
