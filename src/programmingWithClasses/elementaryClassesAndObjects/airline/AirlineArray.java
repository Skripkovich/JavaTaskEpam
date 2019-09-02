package programmingWithClasses.elementaryClassesAndObjects.airline;

import java.util.ArrayList;

//Для хранения данных
class  AirlineArray extends ArrayList {

    //вывод информации рейсов
    public AirlineArray selectByRace (String name){

        AirlineArray result1 = new AirlineArray();

        for(int i=0;i <= this.size()-1;i++){

            AirlineClass airline = (AirlineClass) this.get(i);

            if (airline.getPlace() == name){
                result1.add(airline);
            }
        }
        return result1;
    }

    //вывод информации рейсов по дню недели
    public AirlineArray selectByRaceOfDay (String name){

        AirlineArray result1 = new AirlineArray();

        for(int i=0;i <= this.size()-1;i++){

            AirlineClass airline = (AirlineClass) this.get(i);

            if (airline.getDayOfWeek() == name){
                result1.add(airline);
            }
        }
        return result1;
    }

    //вывод информации рейсов по времени и дню недели
    public AirlineArray selectByRaceOfDayAndTime (String name, double time){

        AirlineArray result1 = new AirlineArray();

        for(int i=0;i <= this.size()-1;i++){

            AirlineClass airline = (AirlineClass) this.get(i);

            if (airline.getDayOfWeek() == name && airline.getTime()>time){
                result1.add(airline);
            }
        }
        return result1;
    }


    //для печати
    public void airlinePrintOut (){

        for(int i=0;i <= this.size()-1;i++){
            AirlineClass airline = (AirlineClass) this.get(i);
            airline.toString(airline);
        }
    }
}
