package BasicsOfSoftwareCodeDevelopment.branching;

/**
 * Вычислить значение функции
 */

import java.util.Scanner;

 public class Task5 {

    public static void main (String [] args){

        int x = 0;
        int d = 0;
        double f1 = 0 , f2 = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите x: ");
        x = sc.nextInt();

        if(x <= 3){
            int a = 1;
            int b = -3;
            int c = 9;

            d =(b*b)-(4*a*c);

            if(d > 0){

                f1 = -b+(Math.sqrt(d))/(2*a);
                f2 = -b-(Math.sqrt(d))/(2*a);

                System.out.println("Квадратное уравнение имеет два корня");
                System.out.println("f1 =" + f1);
                System.out.println("f2 =" + f2);

            } else if (d == 0){
                f1 = -b+(Math.sqrt(d))/(2*a);
                System.out.println("В квадратном уравнении один корень");
                System.out.println("f =" + f1);

            } else if (d < 0){
                System.out.println("В квадратном уравнении нет корней");
            }

        } else if(x > 3){
            f1 = 1/(Math.pow(x,3)+6);
            System.out.println("f =" + f1);
        }
        sc.close();
    }
 }

