package BasicsOfSoftwareCodeDevelopment.cycle;

/**
 * Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
 * все числа от 1 до введенного пользователем числа.
 */
import java.util.Scanner;

public class Task1 {

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        int rezult = 0;

        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            sc.close();

            for (int i = 1; i < n; i++) {
                rezult = rezult + i;
            }
            System.out.println(rezult);

        } else {
            System.out.println("Введенные данные не соответствуют условию задачи");
        }

    }
}
