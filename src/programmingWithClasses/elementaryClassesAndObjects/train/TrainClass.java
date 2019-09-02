package programmingWithClasses.elementaryClassesAndObjects.train;

/**
 * Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
 * Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
 * номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
 * Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
 * назначения должны быть упорядочены по времени отправления.
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class TrainClass {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Train[] trainList = new Train[5];

        trainList[0] = new Train("356","Moscow", "01:25");
        trainList[1] = new Train("444","Minsk", "22:45");
        trainList[2] = new Train("894","Kiev", "20:00");
        trainList[3] = new Train("35684","Rim", "22:10");
        trainList[4] = new Train("154a","Poland", "22:03");

		printArray(trainList);// вывод списка до сортировки

        Arrays.sort(trainList, new Comparator<Train>() {

            // сортировка массива по номеру поезда
            @Override
            public int compare(Train o1, Train o2) {
                return o1.getTrainNumber().compareTo(o2.getTrainNumber());
            }
        });

        System.out.println();
        // вывод списка с сортировкой по номеру поезда
		//printArray(trainList);

        //вывод информации о поезде по номеру
         System.out.println("Введите номер поезда: ");

        String trainNumber = in.nextLine();

        for (int i = 0; i < trainList.length; i++){

            if (trainNumber.equals(trainList[i].getTrainNumber())){
                System.out.println(trainList[i].toString());
            }
        }

        // сортировка массива по пункту и времени
		//Arrays.sort(trainList);

        // вывод списка с сортировкой по пункту и времени
		//printArray(trainList);
    }

    //вывод массива
    private static void printArray(Train[] array){
        for (Train t : array){
            System.out.println(t.toString());
        }
    }
}

