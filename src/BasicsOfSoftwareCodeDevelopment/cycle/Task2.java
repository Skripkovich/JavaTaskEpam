package BasicsOfSoftwareCodeDevelopment.cycle;

/**
 *  Вычислить значения функции на отрезке [а,b] c шагом h
 */

import java.util.Scanner;

public class Task2 {

    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите h: ");
        int h = sc.nextInt();

        int a = -15;
        int b = 20;
        int x = 0;
        int y;

            for (x=a; x<=b; x+=h){
                 System.out.print("x= " + x + ", ");
                 if (x<=2){
                     y = -x;
                     System.out.println("y= "+y);
                 }
                 else if (x>2){

                     y=x;
                     System.out.println("y= "+y);
                 }
            }
    }
}
