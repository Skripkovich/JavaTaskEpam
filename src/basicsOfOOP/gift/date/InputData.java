package basicsOfOOP.gift.date;

import basicsOfOOP.gift.type.PackagingType;
import basicsOfOOP.gift.type.SweetsOfType;

public class InputData {

    public SweetsOfType getSweetsOfTypeForClient (String type){

        SweetsOfType sweetsOfType = null;

        switch (type.toLowerCase()){
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

    public int getCountSweetsForClient (String count){

        int countSweetsForClient = 0;

        if (count.matches("\\d+")){
            countSweetsForClient = Integer.parseInt(count);
        }
        return countSweetsForClient;
    }

    public PackagingType getPackaging (String type){

        PackagingType packagingForClient = null;

        switch (type){
            case "standartBox":
                packagingForClient = PackagingType.standartBox;
                break;
            case "boxWhithRibbon":
                packagingForClient = PackagingType.boxWhithRibbon;
                break;
            case "paper":
                packagingForClient = PackagingType.paper;
                break;
        }
        return packagingForClient;
    }
}
