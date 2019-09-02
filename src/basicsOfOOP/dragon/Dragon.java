package basicsOfOOP.dragon;

/**
 * Создать консольное приложение, удовлетворяющее следующим требованиям:
 * • Приложение должно быть объектно-, а не процедурно-ориентированным.
 * • Каждый класс должен иметь отражающее смысл название и информативный состав.
 * • Наследование должно применяться только тогда, когда это имеет смысл.
 * • При кодировании должны быть использованы соглашения об оформлении кода java code convention.
 * • Классы должны быть грамотно разложены по пакетам.
 * • Консольное меню должно быть минимальным.
 * • Для хранения данных можно использовать файлы.
 * Дракон и его сокровища. Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере
 * дракона. Реализовать возможность просмотра сокровищ, выбора самого дорогого по стоимости сокровища и
 * выбора сокровищ на заданную сумму.
 */



public class Dragon {

    public static void main (String [] args){

        ArrayTreasure arrayTreasure = new ArrayTreasure();

        arrayTreasure.add(new Treasure("Мечь драконоубийцы", TypeTreasure.IMMORTAL, 100.25));
        arrayTreasure.add(new Treasure("Деревянный щит", TypeTreasure.COMMON, 15.69));
        arrayTreasure.add(new Treasure("Ожерелье Проклятого Бога", TypeTreasure.ANCIENT, 150.54));
        arrayTreasure.add(new Treasure("Перчатки кузнеца", TypeTreasure.UNCOMMON, 25.77));
        arrayTreasure.add(new Treasure("Броня королевского рыцаря", TypeTreasure.MYTHICAL, 90.35));

        //Просмотр сокровищ
        System.out.println("Все сокровища:");
        arrayTreasure.allTreasure();
        System.out.println();


        //Самый дорогой по стоимости
        System.out.println("Самое дорогое сокровище");
        arrayTreasure.expenciveTreasure();
        System.out.println();

        //На определенную сумму
        System.out.println("Сокровища на заданную сумму:");
        arrayTreasure.specifiedAmount(100.00);
        System.out.println();

    }
}

