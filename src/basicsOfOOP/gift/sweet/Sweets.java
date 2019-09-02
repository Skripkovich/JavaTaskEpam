package basicsOfOOP.gift.sweet;

import basicsOfOOP.gift.type.SweetsOfType;

//Абстрактный класс конфет
public abstract class Sweets {

    private SweetsOfType sweetsType;
     private  int count;
     private int price;

    public SweetsOfType getSweetsType() {
        return sweetsType;
    }

    public void setSweetsType(SweetsOfType sweetsType) {
        this.sweetsType = sweetsType;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public int costSweets (){
        return count * price;
    }

    public Sweets (SweetsOfType sweetsType, int count, int price){

         this.sweetsType = sweetsType;
         this.count = count;
         this.price = price;
     }

     @Override
    public String toString (){
         return "Конфеты: " +
                 "Наименование - " + sweetsType +
                 ", количество= " + count +
                 ", цена= " + price;
     }

     public Sweets (SweetsOfType sweetsType, int price){

        this.sweetsType = sweetsType;
        this.price = price;
     }
}
