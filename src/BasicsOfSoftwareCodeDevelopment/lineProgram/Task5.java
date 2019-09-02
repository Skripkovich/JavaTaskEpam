package BasicsOfSoftwareCodeDevelopment.lineProgram;

/**
 * Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
 * данное значение длительности в часах, минутах и секундах в следующей форме:
 * ННч ММмин SSc.
 */

public class Task5 {

    public static void main(String [] args){

        int t = 3654;

        //переводим секунды в часы
        float hour = (float) t/1200;

        //переводим в минуты
        double minute = (hour%1)*60;

        //секунды
        int sec = (int)((minute%1)*60);


        if ((int)hour<=9 & (int)minute>9 & sec>9){
            System.out.println("0" + (int)hour + "ч." + (int)minute + "мин." + sec + "сек.");
        }
        else if ((int)minute<=9 & (int)hour>9 & sec>9){
            System.out.println((int)hour + "ч." + "0" + (int)minute + "мин." + sec + "сек.");
        }
        else if (sec<=9 & (int)hour>9 & (int)minute>9){
            System.out.println((int)hour + "ч." + (int)minute + "мин." + "0" + sec + "сек.");
        }
        else if ((int)hour<=9 & (int)minute<=9 & sec>9){
            System.out.println("0" + (int)hour + "ч." + "0" + (int)minute + "мин." + sec + "сек.");
        }
        else if ((int)hour<=9 & sec<=9 & (int)minute>9){
            System.out.println("0" + (int)hour + "ч." + (int)minute + "мин." + "0" + sec + "сек.");
        }
        else if ((int)minute<=9 & sec<=9 & (int)hour>9){
            System.out.println((int)hour + "ч." + "0" + (int)minute + "мин." + "0" + sec + "сек.");
        }
        else if ((int)hour<=9 & (int)minute<=9 & sec<=9){
            System.out.println("0" + (int)hour + "ч." + "0" + (int)minute + "мин." + "0" + sec + "сек.");
        }

    }
}
