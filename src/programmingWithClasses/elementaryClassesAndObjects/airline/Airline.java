package programmingWithClasses.elementaryClassesAndObjects.airline;

/**
 *  Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
 * и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
 * методами. Задать критерии выбора данных и вывести эти данные на консоль.
 * Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
 * Найти и вывести:
 * a) список рейсов для заданного пункта назначения;
 * b) список рейсов для заданного дня недели;
 * c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */

public class Airline {

    public static void main (String [] args){

        AirlineArray airlineArray = new AirlineArray();

        airlineArray.add(new AirlineClass(84458, "Monday", 22.17, "Maldiv", "TU-1864"));
        airlineArray.add(new AirlineClass(83651, "Thursday", 01.15, "Maldiv", "Boing 735"));
        airlineArray.add(new AirlineClass(11354, "Thursday", 13.12, "Minsk", "Boing 735"));

        //a) список рейсов для заданного пункта назначения;
        AirlineArray airlineSelectPlace = airlineArray;

        airlineSelectPlace = airlineArray.selectByRace("Minsk");
        airlineSelectPlace.airlinePrintOut();
        System.out.println("_____________________________________");

        // b) список рейсов для заданного дня недели;
        AirlineArray airlineSelectDay = airlineArray;

        airlineSelectDay = airlineArray.selectByRaceOfDay("Thursday");
        airlineSelectDay.airlinePrintOut();
        System.out.println();
        System.out.println("_____________________________________");

        //c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
        AirlineArray airlineSelectRace = airlineArray;

        airlineSelectRace = airlineArray.selectByRaceOfDayAndTime("Thursday", 10.00);
        airlineSelectRace.airlinePrintOut();
        System.out.println();
        System.out.println("_____________________________________");

    }
}

