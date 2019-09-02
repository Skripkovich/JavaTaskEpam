package algorithmization.oneDimensionalArraysSort;

/**
 * Сортировка обменами. Дана последовательность чисел a1 <=a2<=...<= an. Требуется переставить числа в
 * порядке возрастания. Для этого сравниваются два соседних числа аi и аi+1. Если ai > ai+1, то делается
 * перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
 * Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
 */


import java.util.Scanner;
import java.util.Random;

public class Task3_4 {

    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);

        Random rng = new Random();

        System.out.print("Введите длинну первого массива: ");
        int a = sc.nextInt();

        int [] mass = new int[a];

        boolean flag = false;
        int variable = 0;
        int check = 0;

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

            //Сортируем массивы так, как требует того задача
            while (!flag) {
                flag = true;
                for (int i = 0; i < mass.length - 1; i++) {
                    if (mass[i] > mass[i + 1]) {
                        flag = false;

                        variable = mass[i];
                        mass[i] = mass[i + 1];
                        mass[i + 1] = variable;
                        check++;
                    }
                }
            }

            //Выводим массив на экран
            for (int i = 0; i<mass.length; i++){
                System.out.print(mass[i] + " ");
            }
            System.out.println();
            System.out.println("Число замен: " + check);
        }finally {
            sc.close();
        }
    }
}
