package algorithmization.oneDimensionalArraysSort;

/**
 *  Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
 * один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
 * дополнительный массив.
 */


import java.util.Scanner;
import java.util.Random;

public class Task3_1 {

    public static void main (String [] args){

        Scanner sc1 = new Scanner(System.in);

        Random rng = new Random();

        System.out.print("Введите длинну первого массива: ");
        int a = sc1.nextInt();
        System.out.print("Введите длинну второго массива: ");
        int b = sc1.nextInt();
        System.out.print("Введите число k: ");
        int k = sc1.nextInt();

        int [] mass1 = new int[a];
        int [] mass2 = new int[b];
        int [] total = new int[mass1.length+mass2.length];

        try {

            //Заполняем массивы
            for(int i = 0; i<mass1.length; i++){

                mass1[i] = rng.nextInt(50);
            }

            for(int i = 0; i<mass2.length; i++){

                mass2[i] = rng.nextInt(50);
            }

            //Выводим исходные массивы
            System.out.println("Первый массив: ");
            for (int i = 0; i<mass1.length; i++){
                System.out.print(mass1[i] + " ");
            }

            System.out.println();

            System.out.println("Второй массив: ");
            for (int i = 0; i<mass2.length; i++){
                System.out.print(mass2[i] +  " ");
            }

            System.out.println();

            //Объединяем массивы
            for (int i =0;i<total.length; i++){


                if (i<(k-1)){

                    total[i] = mass1[i];
                }
                  else if (i == (k-1)){
                    for (int j = 0; j<mass2.length; j++){
                        total[i] = mass2[j];
                        i++;
                    }
                    i=i-1;
                }
                  else{
                      total[i]=mass1[k-1];
                      k++;
                }
            }

            //Выводим результат на экран
            System.out.println("Объединенный массив: ");
            for (int i = 0; i<total.length; i++){
                System.out.print(total[i] + " ");
            }

        } finally{
            sc1.close();
        }

    }
}
