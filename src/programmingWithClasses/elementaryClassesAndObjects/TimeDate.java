package programmingWithClasses.elementaryClassesAndObjects;

/**
 * Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
 * изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
 * недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на
 * заданное количество часов, минут и секунд.
 */

import java.util.Scanner;

public class TimeDate {

    public static  void main (String [] args){

        DateTime dateTime = new DateTime();

        dateTime.setHour();
        dateTime.setMinute();
        dateTime.setSecond();
        dateTime.close();

        System.out.println("Время: " + dateTime.getHour() + ":" + dateTime.getMinute() + ":" + dateTime.getSecond());
    }

    public static class DateTime {

        private int hour;
        private int minute;
        private int second;
        private Scanner sc = new Scanner(System.in);

        public int setHour () {
            System.out.println("Установите время в часах:");

            while (!sc.hasNextInt()){

                sc.next();
                System.out.println("Ошибка! Ввод не корректен! Введите число:");
            }

            int h = sc.nextInt();

            hour = h;

            if (h<0 || h>23){
                hour = 0;
            }

            return hour;
        }

        public int getHour() {
            return hour;
        }

        public int setMinute () {

            System.out.println("Установите время в минутах:");

            while (!sc.hasNextInt()){

                sc.next();
                System.out.println("Ошибка! Ввод не корректен! Введите число:");
            }

            int m = sc.nextInt();

            minute = m;

            if (minute<0 || minute>60){

                minute = 0;
            }

            return minute;
        }

        public int getMinute() {
            return minute;
        }

        public int setSecond () {

            System.out.println("Установите время в секундах:");

            while (!sc.hasNextInt()){

                sc.next();
                System.out.println("Ошибка! Ввод не корректен! Введите число:");
            }

            int s = sc.nextInt();

            second = s;

            if (second<0 || second>60){
                second = 0;
            }

            return second;
        }

        public int getSecond () {
            return second;
        }

        public void close (){
            sc.close();
        }
    }
}
