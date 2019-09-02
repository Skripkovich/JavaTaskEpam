package basicsOfOOP.gift.packages;

import basicsOfOOP.gift.type.PackagingType;

//Создание упаковки
public class PackagingCreate {

    public Packaging createPackaging (PackagingType type, int price){

        Packaging pack = null;

        switch (type){
            case standartBox:
                pack = new StandartBox(type, price);
                break;
            case boxWhithRibbon:
                pack = new BoxWhothRibbon(type, price);
                break;
            case paper:
                pack = new Paper(type, price);
                break;
        }

        return pack;
    }

    public PackagingType getPackagingType (String type){

        PackagingType packagingType = null;

        switch (type){
            case "standartBox":
                packagingType = PackagingType.standartBox;
                break;
            case "boxWithRibbon":
                packagingType = PackagingType.boxWhithRibbon;
                break;
            case "paper":
                packagingType = PackagingType.paper;
                break;
        }

        return packagingType;
    }

    public int getPriceOfPackage(PackagingType type){
        int price = 0;

        switch (type) {
            case standartBox:
                price = 100;
                break;
            case boxWhithRibbon:
                price = 200;
                break;
            case paper:
                price = 50;
                break;
        }
        return price;
    }

}
