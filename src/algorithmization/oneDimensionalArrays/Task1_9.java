package algorithmization.oneDimensionalArrays;

 /**
 *  В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
 * чисел несколько, то определить наименьшее из них.
 */


import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class Task1_9 {

    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        int n = sc.nextInt();

        ArrayList mass2 = new ArrayList ();
        int [] mass = new int[n];
        int k = 1;

        try {
            //Заполняем массив псевдорандомными числами
            for (int i = 0; i < mass.length; i++) {
                mass[i] = (int) (Math.random() * ((n + 1) * 2) + ((-n) + (-1)));
            }
            System.out.println(Arrays.toString(mass));
            System.out.println();

            //Ищем в массиве наиболее часто встречающие элементы и запоминаем
            for (int i =0; i<mass.length; i++){
                for (int j =k; j<mass.length; j++){
                    if (mass[i]==mass[j]){
                        mass2.add(mass[i]);
                    }
                }
                k++;
            }
            //Сортируем массив для нахождения наименьшего числа
            if (mass2.size()>0) {
                System.out.println("Повторяющиеся числа: " + mass2);
                Collections.sort(mass2);
                System.out.println("Наименьшее повторяющиеся число: " + mass2.get(0));
            } else System.out.print("Повторяющихся чисел нет");

        }finally {
            sc.close();
        }
    }
}
