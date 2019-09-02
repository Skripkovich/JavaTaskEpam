package programmingWithClasses.aggregationAndComposition.state;

import java.util.ArrayList;

class StateClass extends ArrayList {

    //Выводим сталицу
    public void printCapital (){

        System.out.println("Минск");
    }

    //Выводим колличество областей
    public void  printRegion (){

        int count = 0;

        for(int i=0;i <= this.size()-1;i++){

            City region = (City) this.get(i);
            if (region.returnRegionName().equals(region.returnRegionName())){
                count++;
            }
        }
        System.out.println("Колличество регионов: " + count);
    }

    //Выводим площадь государства
    public void regionSquare (){

        double summSquare = 0.0;

        for(int i=0;i <= this.size()-1;i++){

            City regionSquare = (City) this.get(i);

            summSquare = summSquare + regionSquare.returnRegionSquare();
        }

        System.out.println("Площадь государства составляет: " + summSquare + "км.кв.");
    }

    //Выводим региональные центры
    public void printRegionalCentral (String city){

        for(int i=0;i <= this.size()-1;i++){

            City regionCentral = (City) this.get(i);

            if (regionCentral.getCityName().equals(city)) {
                System.out.println("Региональный центр: " + regionCentral.getRegionalCenter());
            }
        }
    }



}
