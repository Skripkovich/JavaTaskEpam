package programmingWithClasses.elementaryClassesAndObjects;

/**
 *  Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
 * на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
 * произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
 * позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.
 */

public class Counter {

    public static void main (String [] args){

        CounterClass count = new CounterClass();
        for (int i = 0; i<5; i++) {
            count.increment();
            count.print();
            System.out.println();
        }

        System.out.println("_______________________________");

        CounterClass counterClass = new CounterClass(250,500,10);

        for (int i = 0; i<5; i++) {
            counterClass.dicrement();
            counterClass.print();
            System.out.println();
        }


    }

    public static class CounterClass {

        private int numb; // текущее значение
        private  int max; // конечное состояние счетчика
        private int min; // начальное состояние счетчика

        public CounterClass(){

            this.numb = 0;
            this.max = 100;
            this.min = 10;
        }

        public CounterClass (int numb, int max, int min){

            this.numb = numb;
            this.max = max;
            this.min = min;
        }

        public int increment (){

            numb+=10;

            if (numb>max){
                System.out.println("Error");
            } else if (numb<min){
                System.out.println("Error");
            }
            return numb;
        }

        public int dicrement (){

            numb-=10;

            if (numb>max){
                System.out.println("Error");
            } else if (numb<min){
                System.out.println("Error");
            }
            return numb;
        }

        public void print () {

            System.out.println("Begin counter: " + min);
            System.out.println("Finish counter: " + max);
            System.out.println("Counter value: " + numb);
        }
    }
}
