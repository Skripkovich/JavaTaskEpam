package algorithmization.decompositionWithUsingMethods;

/**
 *  Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
 * если угол между сторонами длиной X и Y— прямой.
 */


import java.util.Scanner;

public class Task4_9 {

    static float s (int x, int y, int z, int t){

        int d = (int)Math.sqrt((x*x)+(y*y)); // находим диагональ напротив прямого угла по теореме Пифагора
        float s1 = x*y*0.5f; // первая часть площади четырехугольника
        float s2 = 0.25f * (float)Math.sqrt((d+z+t)*(d+z-t)*(d+t-z)*(z+t-d)); // вторая часть площади четырехуголника
        float s = s1+s2;                                                      // по формуле Герона
        return s;
    }

    public static void main (String [] ar){

        Scanner sc1 = new Scanner(System.in);

        System.out.print("Введите Х: ");
        int x = sc1.nextInt();
        System.out.print("Введите Y: ");
        int y = sc1.nextInt();
        System.out.print("Введите Z: ");
        int z = sc1.nextInt();
        System.out.print("Введите T: ");
        int t = sc1.nextInt();

            sc1.close();

        System.out.println(s(x,y,z,t));
    }
}
