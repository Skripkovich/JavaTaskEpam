package programmingWithClasses.elementaryClassesAndObjects.customer;

class CustomerClass {

    private String surname;
    private String name;
    private String secondName;
    private String address;
    private int card;
    private String account;

    public void setSurname (String surname){

        this.surname = surname;
    }

    public String getSurname (){
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  String getName() {
        return name;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setCard(int card) {
        this.card = card;
    }

    public int getCard() {
        return card;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAccount() {
        return account;
    }

    public CustomerClass(String surname, String name, String secondName, String address, int card, String account){

        this.surname = surname;
        this.name = name;
        this.secondName = secondName;
        this.address =address;
        this.card = card;
        this.account = account;
    }

    public void toString (CustomerClass customerClass){

        System.out.println("Customer: " + this.surname + " " + this.name + " " + this.secondName + "; Adress: " +
                this.address + "; Card:" + this.card + "; Account:" + this.account);
    }

}
