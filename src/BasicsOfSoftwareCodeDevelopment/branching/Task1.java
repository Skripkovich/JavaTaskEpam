package BasicsOfSoftwareCodeDevelopment.branching;

/**
 * Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
 * он прямоугольным.
 */

import java.util.Scanner;

public class Task1 {

    public static void main (String [] args) {

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.print("Введите первый угол: ");
        short angle1 = sc1.nextShort();
        System.out.print("Введите второй угол: ");
        short angle2 = sc2.nextShort();

        sc1.close();
        sc2.close();

            if ((angle1 + angle2) < 180 & angle1>0 & angle2>0) {
                System.out.println("Данный треугольник существует");

                if (angle1 == 90 || angle2 == 90 || (180- (angle1 + angle2))==90) {
                    System.out.println("Данный треугольник прямоугольный");
                }
            } else System.out.println("Данный треугольник не существует");

    }
}
