package BasicsOfSoftwareCodeDevelopment.cycle;

/**
 * Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
 * m и n вводятся с клавиатуры.
 */

import java.util.Scanner;

public class Task7 {

    public static void main (String [] args){

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.print("Введите m: ");
        int m = sc1.nextInt();
        System.out.print("Введите n: ");
        int n = sc2.nextInt();

        sc1.close();
        sc2.close();

        int flag = 0;
        int j;

            for (int i = m; i < n; i++) {

                for (j = m; j < n; j++) {
                    if (i % j == 0 & j != i & j != 1) {
                        flag = 1;
                    }
                }
                if (flag == 1){
                    System.out.print("Для числа " + i + " делители: ");
                    for (j = m; j < n; j++) {
                        if (i % j == 0 & j != i & j != 1) {
                            System.out.print(j + " ");
                        }
                    }
                    flag = 0;
                } else System.out.print("Для числа " + i + " делителией нет ");
                System.out.println();

            }
    }
}
