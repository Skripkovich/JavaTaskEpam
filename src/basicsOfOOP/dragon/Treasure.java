package basicsOfOOP.dragon;

class Treasure {

    private double price;
    private TypeTreasure type;
    private String nameTreasure;

    public void setPrice(int price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setType(TypeTreasure type) {
        this.type = type;
    }

    public TypeTreasure getType() {
        return type;
    }

    public void setNameTreasure(String nameTreasure) {
        this.nameTreasure = nameTreasure;
    }

    public String getNameTreasure() {
        return nameTreasure;
    }

    public Treasure (String nameTreasure, TypeTreasure type, double price){

        this.nameTreasure = nameTreasure;
        this.price = price;
        this.type = type;
    }

    public void toString(Treasure treasure) {

        System.out.println("[Наименование сокоровища]: " + this.nameTreasure + " [Редкость]: " + this.type +
                " [Цена]: " + this.price);
    }
}
