package algorithmization.decompositionWithUsingMethods;

/**
 * Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
 * натуральных чисел
 */


import java.util.Random;

public class Task4_1 {

    private static int nod (int a, int b){

        return (b==0) ? a : nod (b, a%b);
    }

    private static int nok (int a, int b){

        return a/nod (a,b) * b;
    }

    public static void main (String[] args){

        Random rng1 = new Random();
        Random rng2 = new Random();

        int a = rng1.nextInt(50);
        int b = rng2.nextInt(50);

        System.out.println("Два натуральных числа: " + a + " " + b);
        System.out.println("Наибольший общий делитель двух натуральных чисел: " + nod(a, b));
        System.out.println("Наименьшее общее кратное двух натуральных чисел: " + nok(a, b));
    }
}
