package basicsOfOOP.gift.packages;

import basicsOfOOP.gift.type.PackagingType;

//Абстрактный класс упаковки
public abstract class Packaging {

    private PackagingType packagingType;
    private int price;

    public PackagingType getPackagingType() {
        return packagingType;
    }

    public void setPackagingType(PackagingType packagingType) {
        this.packagingType = packagingType;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public Packaging (PackagingType packagingType, int price){
        this.packagingType = packagingType;
        this.price = price;
    }

    @Override
    public String toString (){
        return "Упаковка: " +
                " тип упаковки - " + packagingType +
                ", цена= " + price +
                '}';
    }
}
