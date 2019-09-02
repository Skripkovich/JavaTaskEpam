package algorithmization.decompositionWithUsingMethods;

/**
 * Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади
 * треугольника.
 */



import java.util.Scanner;

public class Task4_3 {

    private static float s (float a){

        float b = (a+a+a)/2;
        float s = (float) Math.sqrt(b*(b-a)*(b-a)*(b-a));
        return s;
    }

    public static void main (String[] arg){

        Scanner sc1 = new Scanner(System.in);

        System.out.print("Введите сторону а: ");
        float a = sc1.nextFloat();

        System.out.println();
        System.out.println("Площадь шестиугольника равна = " + (s(a)*6));
    }
}
