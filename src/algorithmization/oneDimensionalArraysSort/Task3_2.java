package algorithmization.oneDimensionalArraysSort;

/**
 *  Даны две последовательности a1<= a2<=...<= an и b1<= b2<=...<=bm. Образовать из них новую последовательность
 * чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.
 */


import java.util.Scanner;
import java.util.Random;

public class Task3_2 {

    public static void main (String [] args){

        Scanner sc1 = new Scanner(System.in);

        Random rng = new Random();

        System.out.print("Введите длинну первого массива: ");
        int a = sc1.nextInt();
        System.out.print("Введите длинну второго массива: ");
        int b = sc1.nextInt();

        int [] mass1 = new int[a];
        int [] mass2 = new int[b];
        int [] total = new int[mass1.length + mass2.length];

        boolean flag = false;
        int variable = 0;
        int check = 0;

        try {

            //Заполняем массивы
            for(int i = 0; i<mass1.length; i++){

                mass1[i] = rng.nextInt(200);
            }

            for(int i = 0; i<mass2.length; i++){

                mass2[i] = rng.nextInt(200);
            }

            //Сортируем массивы так, как требует того задача
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
            flag = false;

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

            //Образуем новую последовательность
            for (int i = 0; i<total.length; i++){

                if (i<mass1.length){
                    total[i]=mass1[i];
                }else {

                    total[i] = mass2[check];
                    check++;
                }
            }

            //Сортируем новую последовательность
            while (!flag) {
                flag = true;
                for (int i = 0; i < total.length - 1; i++) {
                    if (total[i] > total[i + 1]) {
                        flag = false;

                        variable = total[i];
                        total[i] = total[i + 1];
                        total[i + 1] = variable;
                    }
                }
            }

            //Выводим на экран отсортированную последовательность
            System.out.println("полученный массив: ");
            for (int i = 0; i<total.length; i++){
                System.out.print(total[i] +  " ");
            }
        }finally {
            sc1.close();
        }
    }
}
