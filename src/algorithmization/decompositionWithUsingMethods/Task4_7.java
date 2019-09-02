package algorithmization.decompositionWithUsingMethods;

/**
 *  Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
 */


public class Task4_7 {

    static int factorial(int n){
        int result = 1;
        for (int i = 1; i <=n; i ++){
            result = result*i;
        }
        return result;
    }

    public static void main (String [] args){

        for (int i = 1; i<=9; i++){

            if (i%2==0){
                continue;
            } else System.out.println("Факториал числа " + i + " равно: " + factorial(i));
        }
    }
}
