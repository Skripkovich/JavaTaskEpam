package algorithmization.decompositionWithUsingMethods;

/**
 * Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого
 * являются цифры числа N.
 */


import java.util.Scanner;

public class Task4_10 {

    static void massiv(int a) {
        int temp = a;
        int count = 0;  // Размер массива

        while (temp > 0)
        {
            count++;
            temp = temp / 10;
        }

        int[] mas = new int[count];

        int j = count - 1;
        while (a > 0)
        {
            mas[j--] = a % 10;
            a = a / 10;
        }

        for (int i = 0; i < count; i++)
        {
            System.out.print(mas[i] + " ");
        }
    }

    public static void main (String [] args){

        Scanner sc1 = new Scanner(System.in);

        System.out.print("Введите число N: ");
        int n = sc1.nextInt();

        sc1.close();

        massiv(n);
    }
}
