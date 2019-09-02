package programmingWithClasses.elementaryClassesAndObjects;

/**
 * Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
 * площади, периметра и точки пересечения медиан.
 */

public class Triangle {

    public static void main (String [] args){

        TraingleClass traingle = new TraingleClass(5, 5, 8);

        System.out.println("Площадь: " + traingle.square());
        System.out.println("Периметр: " + traingle.perimetr());
        System.out.println("Пересечение медиан: " + traingle.median());
    }

    public static class TraingleClass {

        private double a;
        private double b;
        private double c;

        public TraingleClass (double a, double b, double c){

            this.a = a;
            this.b = b;
            this.c = c;

        }

        public double square (){

            double i = (a+b+c)/2;
            return Math.sqrt(i*(i-a)*(i-b)*(i-c));
        }

        public double perimetr () {

            return a+b+c;
        }

        public double median () {

            return (a+b+c)/3;
        }

    }
}
