package programmingWithClasses.aggregationAndComposition.state;

/**
 * Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
 * столицу, количество областей, площадь, областные центры.
 */

public class State {

    public static void main (String [] args) {

        StateClass stateClass = new StateClass();

        stateClass.add(new City("Минск", new Region("Минская", 12.54),
                new District("Минский"), "Минск", "Минск"));
        stateClass.add(new City("Брест", new Region("Бресткая", 15.47),
                new District("Бресткий"), "Минск", "Брест"));
        stateClass.add(new City("Барановичи", new Region("Барановичская", 15.47),
                new District("Бресткий"), "Минск", "Брест"));


        //Выводим сталицу
        System.out.println("Выводим сталицу на экран:");
        stateClass.printCapital();
        System.out.println();

        //Выводим колличество областей

        stateClass.printRegion();

        //Выводим площадь
        stateClass.regionSquare();

        //Выводим региональные центры
        stateClass.printRegionalCentral("Барановичи");
        System.out.println();
    }

}

