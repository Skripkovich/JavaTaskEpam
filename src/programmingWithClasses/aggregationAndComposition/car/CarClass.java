package programmingWithClasses.aggregationAndComposition.car;

public class CarClass {

    private String mark;
    private  int wheel;
    private  int fuel;

    public String getMark() {
        return mark;
    }

    public CarClass (String mark, int wheel, int engine){

        this.mark = mark;
        this.wheel = wheel;
        this.fuel = engine;
    }


     public void toString (CarClass carClass){
        System.out.println("Марка автомобиля: " + this.mark + ", радиус колес: " + this.wheel + ", заполненость бака: " +
                this.fuel + "%");
    }

    public int replace (Wheel wheel, int radius){
        wheel.setWheelRadius(radius);
        this.wheel = wheel.getWheelRadius();
        return this.wheel;
    }

    public int fill (Engine engine, int procent){

        if (engine.getFuel() <=15){

            //заправляем автомобиль до назначеннного процента
             engine.setFuel(procent);
             this.fuel = engine.getFuel();
        }
        return this.fuel;
    }

    public void drive (boolean check) {

        if (check == true){

            System.out.println("Можно ехать!");
        }else {

            System.out.println("Заправтесь пожалуйста!");
        }
    }


}
