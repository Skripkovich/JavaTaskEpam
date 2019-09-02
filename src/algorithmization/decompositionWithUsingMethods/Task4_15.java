package algorithmization.decompositionWithUsingMethods;

/**
 * Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
 * последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.
 */

import java.util.Scanner;

public class Task4_15 {

    static boolean massiv(int a) {
        int temp = a;
        int count = 0;  // Размер массива
        boolean flag = true;

        while (temp > 0)
        {
            count++;
            temp = temp / 10;
        }

        int[] mass = new int[count];

        int j = count - 1;

        while (a > 0)
        {
            mass[j--] = a % 10;
            a = a / 10;
        }
         for (int i = 0; i<count -1; i++){

             if (mass[i+1]==(mass[i]+1)){

             }else flag = false;
         }

         return flag;
    }

    static void method1 (int n){

        if (n==2){
            for (int i =10; i<100;i++){
                if (massiv(i)==true){
                    System.out.print(i + " ");
                }
            }
        } else {
            for (int i =10*((int)Math.pow(10,(n-2))); i<10*((int)Math.pow(10,(n-1)));i++){
                if (massiv(i)==true){
                    System.out.print(i + " ");
                }
            }
        }
    }

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите число n. Оно должно быть больше либо равно 2: ");
        int n = sc.nextInt();

        sc.close();

        method1(n);
    }
}
