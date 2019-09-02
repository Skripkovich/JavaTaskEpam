package programmingWithClasses.aggregationAndComposition.car;

public class Engine {

    private int fuel = 0;

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }

    public Engine (int fuel){

        this.fuel = fuel;
    }

}
