package basicsOfOOP.gift.date;

import basicsOfOOP.gift.GiftException;

//
public class DataInFile {
    public void validate (String line) throws GiftException {

        int count = 1;
        String [] words = line.split("\\s+");
        String type = words[0].toLowerCase();
        String countGift = words[1];
        String price = words[2];

        switch (type){
            case "caramel":
            case "chocolate":
            case "stuffing":
                break;
            default:
                throw new GiftException("Неверные данные в файле!");
        }
        if (!countGift.matches("[+]?\\d+")){
            throw new GiftException("Неверное колличество!");
        }
        if (!price.matches("[+]?\\d+")){
            throw new GiftException("Неверная цена в файле!");
        }
    }
}
