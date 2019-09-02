package BasicsOfSoftwareCodeDevelopment.branching;

/**
 *  Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой
 */

public class Task3 {

    public static void main (String [] a){

        int x1=1;
        int x2=2;
        int x3=3;
        int y1=1;
        int y2=2;
        int y3=3;

        if (x1*y2+x3*y1+x2*y3-x3*y2-x2*y1-x1*y3==0){

            System.out.println("Данные точки находятся на одной прямой");
        } else System.out.println("Данные точки не находятся на одной прямой");

    }
}
