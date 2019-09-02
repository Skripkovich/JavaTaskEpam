package basicsOfOOP.gift.sweet;

import basicsOfOOP.gift.type.SweetsOfType;

//Создание конфет
public class SweetsCreate {

    public static Sweets createSweet(SweetsOfType type, int count, int price) {

        Sweets sweets = null;

        switch (type) {
            case caramel:
                sweets = new Caramel(type, count, price);
                break;
            case chocolate:
                sweets = new Chocolate(type, count, price);
                break;
            case stuffing:
                sweets = new Stuffing(type, count, price);
                break;
        }

        return sweets;
    }

    public SweetsOfType getSweetsOfType(String type) {

        SweetsOfType sweetsOfType = null;

        switch (type) {
            case "caramel":
                sweetsOfType = SweetsOfType.caramel;
                break;
            case "chocolate":
                sweetsOfType = SweetsOfType.chocolate;
                break;
            case "stuffing":
                sweetsOfType = SweetsOfType.stuffing;
                break;
        }
        return sweetsOfType;
    }
}
