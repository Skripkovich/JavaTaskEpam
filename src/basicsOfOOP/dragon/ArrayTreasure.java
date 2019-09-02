package basicsOfOOP.dragon;

import java.util.ArrayList;

class ArrayTreasure extends ArrayList {

    //Просмотр всех сокровищ
    public  void  allTreasure (){

        for(int i=0;i <= this.size()-1;i++){
            Treasure treasure = (Treasure) this.get(i);
            treasure.toString(treasure);
        }
    }

    //Дорогой по стоимости
    public void expenciveTreasure (){

            double max = 0;

            for(int i = 0; i<=this.size()-1; i++){

                Treasure treasure = (Treasure) this.get(i);

                if (treasure.getPrice()>max){
                    max = treasure.getPrice();
                }
            }

            for(int i = 0; i<=this.size()-1; i++){

                Treasure treasure = (Treasure) this.get(i);
                if (treasure.getPrice() == max){

                    treasure.toString(treasure);
                }
            }
    }

    //На заданную сумму
    public void specifiedAmount (double coin){

        for (int i = 0; i<=this.size()-1; i++){

            Treasure treasure = (Treasure) this.get(i);
             if (treasure.getPrice()<=coin){
                  treasure.toString(treasure);
             }
        }
    }
}
