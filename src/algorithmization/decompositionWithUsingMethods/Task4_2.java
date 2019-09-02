package algorithmization.decompositionWithUsingMethods;

/**
 * Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
 */


import java.util.Random;

public class Task4_2 {

    private static int nod1 (int a, int b){

        return (b==0) ? a : nod1 (b, a%b);
    }

    private static int nod2 (int c, int d){

        return (d==0) ? c : nod2 (d, c%d);
    }

    private static int result (int nod1, int nod2){

        return (nod2==0) ? nod1 : result (nod2, nod1%nod2);
    }

    public static void main (String[] args){

        Random rng1 = new Random();

        int a = rng1.nextInt(50);
        int b = rng1.nextInt(50);
        int c = rng1.nextInt(50);
        int d = rng1.nextInt(50);

        System.out.println("Четыре натуральных числа: "+ a + " " + b + " " + c + " " + d);
        System.out.println("Наибольший общий делитель четырех натуральных чисел: " + result(nod1(a,b), nod2(c,d)));
    }
}
