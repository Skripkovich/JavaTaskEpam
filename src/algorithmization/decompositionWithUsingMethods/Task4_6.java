package algorithmization.decompositionWithUsingMethods;

/**
 *  Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
 */


import java.util.Scanner;

public class Task4_6 {

    static int nod (int a, int b){

        return (b==0) ? a : nod (b, a%b);
    }

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int a = sc.nextInt();

        System.out.print("Введите второе число: ");
        int b = sc.nextInt();

        System.out.print("Введите третье число: ");
        int c = sc.nextInt();

        try {

            if (nod(nod(a,b),c)==1){

                System.out.print("Числа взаимно простые");
            } else System.out.print("Числа не взаимно простые");
        }finally {
            sc.close();
        }
    }
}
