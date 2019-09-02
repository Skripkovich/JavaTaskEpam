package programmingWithClasses.aggregationAndComposition.car;

public class Wheel {

    private int wheelRadius;

    public void setWheelRadius(int wheelRadius) {
        this.wheelRadius = wheelRadius;
    }

    public int getWheelRadius() {
        return wheelRadius;
    }

    public Wheel (int wheelRadius){
        this.wheelRadius = wheelRadius;
    }
}
