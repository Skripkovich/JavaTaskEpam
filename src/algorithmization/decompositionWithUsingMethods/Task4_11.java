package algorithmization.decompositionWithUsingMethods;

/**
 *  Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
 */

import java.util.Scanner;

public class Task4_11 {

    static void method1 (int a, int b){
        int var1 = a;
        int var2 = b;
        int check1 = 1;
        int check2 = 1;

        while (var1>0){
            var1 = var1/10;
            check1++;
        }

        while (var2>0){
            var2 = var2/10;
            check2++;
        }
        if (check1>check2) {
            System.out.print("В числе " + a + " больше цифр чем в числе " + b);
        }
        else if (check1==check2){

            System.out.print("Колличество цифр в числах " + a + " и " + b + " равны");
        }
        else System.out.print("В числе " + b + " больше цифр чем в числе " + a);
    }

    public static void main (String [] arh){

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int a = sc.nextInt();
        System.out.print("Введите второе число: ");
        int b = sc.nextInt();

        sc.close();

        method1(a,b);
    }
}
