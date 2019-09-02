package algorithmization.oneDimensionalArraysSort;

/**
 *  Пусть даны две неубывающие последовательности действительных чисел a1 < a2 <...< an и b1 < b2 <...< bm.
 * Требуется указать те места, на которые нужно вставлять элементы последовательности b1 < b2 <...< bm в первую
 * последовательность так, чтобы новая последовательность оставалась возрастающей.
 */


import java.util.Scanner;
import java.util.Random;

public class Task3_7 {

    public static void main (String[] args){

        Scanner sc1 = new Scanner(System.in);

        Random rng = new Random();

        System.out.print("Введите длинну первого массива: ");
        int a = sc1.nextInt();
        System.out.print("Введите длинну второго массива: ");
        int b = sc1.nextInt();

        int [] mass1 = new int[a];
        int [] mass2 = new int[b];
        int [] total = new int [mass1.length + mass2.length];
        boolean flag = false;
        int variable = 0;
        int var = 0;

        try{

            //Заполняем массив
            for(int i = 0; i<mass1.length; i++){

                mass1[i] = rng.nextInt(200);
            }

            for(int i = 0; i<mass2.length; i++){

                mass2[i] = rng.nextInt(200);
            }

            //Сортируем массивы
            while (!flag) {
                flag = true;
                for (int i = 0; i < mass1.length - 1; i++) {
                    if (mass1[i] > mass1[i + 1]) {
                        flag = false;

                        variable = mass1[i];
                        mass1[i] = mass1[i + 1];
                        mass1[i + 1] = variable;
                    }
                }
            }

            flag = false;

            while (!flag) {
                flag = true;
                for (int i = 0; i < mass2.length - 1; i++) {
                    if (mass2[i] > mass2[i + 1]) {
                        flag = false;

                        variable = mass2[i];
                        mass2[i] = mass2[i + 1];
                        mass2[i + 1] = variable;
                    }
                }
            }

            //заполняем общий массив первым
            for (int i = 0; i<mass1.length; i++){
                total[i] = mass1[i];
            }
            //Выводим массивы на экран
            System.out.print("Первый массив: ");
            for (int i = 0; i<mass1.length; i++){
                System.out.print(mass1[i] + " ");
            }
            System.out.println();

            System.out.print("Второй массив: ");
            for (int i = 0; i<mass2.length; i++){
                System.out.print(mass2[i] + " ");
            }
            System.out.println();

            System.out.println("Новая последовательность:");
            for (int i = 0; i<mass1.length; i++){

                System.out.print(total[i] + " ");
            }
            System.out.println();

            //Подставляем значения
            while (var<mass2.length) {
                System.out.print("Введите место, новой последовательности, в которое требуется вставить эллемент: ");
                int c = sc1.nextInt();


                for (int i = total.length - 1; i >= c - 1; i--) {

                    if (total[i] != 0) {

                        total[i + 1] = total[i];
                    }
                }
                total[c - 1] = mass2[var];
                var++;
                for (int i = 0; i<mass1.length+var; i++){
                    System.out.print(total[i] + " ");
                }
                System.out.println();
            }
        }finally {
            sc1.close();
        }
    }
}
