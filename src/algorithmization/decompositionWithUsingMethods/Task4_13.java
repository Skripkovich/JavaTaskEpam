package algorithmization.decompositionWithUsingMethods;

/**
 * Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для
 * решения задачи использовать декомпозицию.
 */

import java.util.Scanner;

public class Task4_13 {

    static boolean simple (int n) {
        int a=0;
        for (int i=1; i<=(int) Math.sqrt(n); i++) {
            if (n%i==0) {
                if (i==Math.sqrt(n))
                    a++;
                else a+=2;

            }
        }
        if (a==2) return true; //если число простое
        else return false; //если число составное
    }

    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите число n: ");
        int n = sc.nextInt();

        for (int i = 1; i< (n*2)-2; i++){

            if (simple(i)==true){

                System.out.println("Пара \"чисел-близнецов\": " + i + " " + (i+2));
            }
        }
    }
}
