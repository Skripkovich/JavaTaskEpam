package BasicsOfSoftwareCodeDevelopment.lineProgram;

/**
 * Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
 * принадлежит закрашенной области, и false — в противном случае.
 */

import java.util.Scanner;

public class Task6 {

    public static void main(String [] args){

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("Введите координаты по х: ");
        int x = sc1.nextInt();
        System.out.println("Введите координаты по у: ");
        int y = sc2.nextInt();

        sc1.close();
        sc2.close();

            if (((x >= -4 && x <= 4) & ( y >= -3 && y <=0)) || ((x>=-2 && x<=2) & (y>=0 && y<=4))) {
                System.out.println(true);
            }
            else System.out.println(false);
        }

}
