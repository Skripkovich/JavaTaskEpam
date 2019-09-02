package programmingWithClasses.aggregationAndComposition.car;

/**
 * Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
 * менять колесо, вывести на консоль марку автомобиля.
 */

public class Car {

    public static void main (String [] args){

        Engine engine = new Engine(0);
        Wheel wheel = new Wheel(16);

        boolean check;

        CarClass carClass = new CarClass("Форд", wheel.getWheelRadius(), engine.getFuel() );

        //метод вывода на экран марки авто
        carClass.toString(carClass);

        //метод "ехать"
        if (engine.getFuel() >15){

            check = true;
        }
        else {

            check = false;
        }

        carClass.drive(check);

        //метод "заправляться"
        if (check == false){

            carClass.fill(engine, 70);
            check = true;
        }

        //метод менять колесо
        System.out.println("Радиус колеса " + wheel.getWheelRadius());
        carClass.replace(wheel, 21);
        System.out.println("Заменили на радиус колеса " + wheel.getWheelRadius());
        carClass.toString(carClass);

        carClass.drive(check);

    }
}

