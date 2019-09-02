package programmingWithClasses.elementaryClassesAndObjects.airline;

class AirlineClass {

    private String place;
    private String typeAirplane;
    private String dayOfWeek;
    private int numberOfRace;
    private double time;

    //Геттеры и сеттеры
    public void setPlace(String place) {
        this.place = place;
    }

    public String getPlace() {
        return place;
    }

    public void setTypeAirplane(String typeAirplane) {
        this.typeAirplane = typeAirplane;
    }

    public String getTypeAirplane() {
        return typeAirplane;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setNumberOfRace(int numberOfRace) {
        this.numberOfRace = numberOfRace;
    }

    public int getNumberOfRace() {
        return numberOfRace;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getTime() {
        return time;
    }

    //Конструктор
    public AirlineClass(int numberOfRace, String dayOfWeek, double time, String place, String typeAirplane){

        this.typeAirplane = typeAirplane;
        this.dayOfWeek = dayOfWeek;
        this.numberOfRace = numberOfRace;
        this.time = time;
        this.place = place;
    }

    //Метод
    public void toString (AirlineClass airlineClass){

        System.out.println("Номер рейса: " + this.numberOfRace + "; Дата вылета: " + this.dayOfWeek + "; Время вылета: "
                + this.time + "; Пункт назначения: " + this.place + "; Тип самолета: " + this.typeAirplane);
    }

}
