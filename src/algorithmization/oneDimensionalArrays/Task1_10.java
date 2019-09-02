package algorithmization.oneDimensionalArrays;

/**
 *  Дан целочисленный массив с количеством элементов n. Сжать массив, выбросив из него каждый второй
 * элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
 */

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Task1_10 {
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        Random rng = new Random();

        try {

            if (sc.hasNextInt()){
                int n = sc.nextInt();
                int [] mass = new int[n];

                //Заполняем массив псевдорандомными числами
                for (int i = 0; i<mass.length; i++){
                    mass[i] = rng.nextInt();
                }

                // Заполняем каждый второй элемент нулями
                for (int i = 0; i<mass.length; i++){
                   if (i%2==1) {
                       mass[i] = 0;
                   }
                }
                System.out.println(Arrays.toString(mass));
            }
        } finally {
            sc.close();
        }
    }
}

