package BasicsOfSoftwareCodeDevelopment.lineProgram;

/**
 *  * Вычислить значеник выражения по формуле (все переменные принимают действительные значения):
 *  * ((sin x + cos y)/(cos x + sin y))* tg xy
 */

public class Task3 {

    public static void main(String[] args) {

        int x = 12;
        float y = 45.6f;

        System.out.print(((Math.sin(x)+ Math.cos(y))/(Math.cos(x)- Math.sin(y)))* Math.tan(x*y));
    }
}
