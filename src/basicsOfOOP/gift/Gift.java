package basicsOfOOP.gift;

/**
 * Создать консольное приложение, удовлетворяющее следующим требованиям:
 * • Корректно спроектируйте и реализуйте предметную область задачи.
 * • Для создания объектов из иерархии классов продумайте возможность использования порождающих шаблонов
 * проектирования.
 * • Реализуйте проверку данных, вводимых пользователем, но не на стороне клиента.
 * • для проверки корректности переданных данных можно применить регулярные выражения.
 * • Меню выбора действия пользователем можно не реализовывать, используйте заглушку.
 * • Особое условие: переопределите, где необходимо, методы toString(), equals() и hashCode().
 * Вариант B. Подарки. Реализовать приложение, позволяющее создавать подарки (объект, представляющий собой
 * подарок). Составляющими целого подарка являются сладости и упаковка.
 */


import basicsOfOOP.gift.date.InputData;
import basicsOfOOP.gift.packages.Packaging;
import basicsOfOOP.gift.sweet.Sweets;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Gift {

    public static void main (String [] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        InputData inputData = new InputData();
        ReadyMadeGift readyMadeGift = new ReadyMadeGift();

        readyMadeGift.setSweets(readyMadeGift.createGift());

        System.out.println("Выберите конфеты из ассортимента нашего магазина:");
        readyMadeGift.printAll();

        ArrayList<Sweets> giftForClient = new ArrayList<>();

        Packaging pack = null;
        boolean flag = false;

        try {
            while (true){
                System.out.println("Введите тип конфет (caramel, chocolate, stuffing):");
                String s = reader.readLine();

                System.out.println("Введите колличество конфет: ");
                String s2 = reader.readLine();

                String s3 = "";

                if (!flag) {
                    System.out.println("Выберите упаковку для подарка (standartBox, boxWhithRibbon, paper):");
                    s3 = reader.readLine();
                    pack = readyMadeGift.getPackageForSweets(inputData.getPackaging(s3));
                    flag = true;
                }

                Sweets sweets = readyMadeGift.getSweetsForClient(inputData.getSweetsOfTypeForClient(s),
                        inputData.getCountSweetsForClient(s2));

                if (sweets != null){

                    giftForClient.add(sweets);
                }

                System.out.println("Вы хотите добавить еще конфет? (1- Да, 2 - Нет):");
                String choose = reader.readLine();

                if (choose.equals("2")){
                    break;
                }else {

                    System.out.println("Конфеты в наличии:");
                    readyMadeGift.printAll();
                }
            }
        } catch (NullPointerException e) {
            System.out.println("Ошибка! Введите корректное значение!");
        }finally {
            if (giftForClient.size() >= 1){

                System.out.println("Подарок состоит из:");
                readyMadeGift.printForClient(giftForClient);
                System.out.println("Упаковка: " + pack);
                System.out.println("Стоимость подарка:");
                readyMadeGift.setSweets(giftForClient);

                if (pack != null){

                    readyMadeGift.setPack(pack);
                }
                System.out.println(readyMadeGift.cost());
            }
        }
    }
}

