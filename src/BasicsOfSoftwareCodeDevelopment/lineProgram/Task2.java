package BasicsOfSoftwareCodeDevelopment.lineProgram;

/**
 * Вычислить значеник выражения по формуле (все переменные принимают действительные значения):
 * ((b+sqrt(b^2+4ac))/(2a))*a^3c+b^-2
 */

public class Task2 {

    public static void main(String[] args) {

        int a = 80;
        int b = -3;
        float c = 2.25f;

        System.out.print(((b+Math.sqrt((b*b)+(4*a*c)))/(2*a))-(Math.pow(a,3)*c)+ (Math.pow(b,-2)));

    }
}
