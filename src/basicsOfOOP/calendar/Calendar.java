package basicsOfOOP.calendar;

/**
 * Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить информацию о
 * выходных и праздничных днях.
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.text.DateFormat;

class Calendar {

    public static void main (String [] args) throws ParseException {
        CalendarClass calendarClass = new CalendarClass();

        calendarClass.calendarSet();
        calendarClass.printCalendar();

    }
}

class CalendarClass {

    private ArrayList<Day> days = new ArrayList<>();

    public class Day {

        private Date name;
        private String weekend;
        private String holiday;

        public Date getName() {
            return name;
        }

        public void setName(Date name) {
            this.name = name;
        }

        public String getWeekend() {
            return weekend;
        }

        public void setWeekend(String weekend) {
            this.weekend = weekend;
        }

        public String getHoliday() {
            return holiday;
        }

        public void setHoliday(String holiday) {
            this.holiday = holiday;
        }

        public Day (Date name, String weekend, String holiday){

            this.name = name;
            this.weekend = weekend;
            this.holiday = holiday;
        }
    }

    public void calendarSet () throws ParseException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите количество дней: ");

        while (!sc.hasNextInt()){

            sc.next();
            System.out.println("Введите число!");
        }

        int day = sc.nextInt();

        for (int i = 0; i< day; i++){

            System.out.println("Введите дату в формате ггггММдд:");
            String inputDate = sc.nextLine();

            DateFormat formatter = new SimpleDateFormat("ггггММдд");
            Date date = formatter.parse(inputDate);

            java.util.Calendar newCalendar = java.util.Calendar.getInstance();
            newCalendar.setTime(date);

            if (newCalendar.get(java.util.Calendar.MONTH)==java.util.Calendar.DECEMBER &&
                    newCalendar.get(java.util.Calendar.DAY_OF_MONTH)==31 || newCalendar.get(java.util.Calendar.MONTH)
                    == newCalendar.MARCH && newCalendar.get(java.util.Calendar.DAY_OF_MONTH) == 8 ||
                    newCalendar.get(java.util.Calendar.MONTH)== newCalendar.JULY &&
                            newCalendar.get(java.util.Calendar.DAY_OF_MONTH)==4){

                if (newCalendar.get(java.util.Calendar.DAY_OF_WEEK) == java.util.Calendar.SUNDAY) {
                    days.add(new Day(date, "выходной!", " праздник!"));
                } else if (newCalendar.get(java.util.Calendar.DAY_OF_WEEK) == java.util.Calendar.SATURDAY) {
                    days.add(new Day(date, "выходной!", " праздник!"));
                } else {
                    days.add(new Day(date, "выходной!", " праздник!"));
                }
            }else {

                if (newCalendar.get(java.util.Calendar.DAY_OF_WEEK) == java.util.Calendar.SUNDAY) {
                    days.add(new Day(date, "выходной!", " праздник!"));
                } else if (newCalendar.get(java.util.Calendar.DAY_OF_WEEK) == java.util.Calendar.SATURDAY) {
                    days.add(new Day(date, "выходной!", " праздник!"));
                } else {
                    days.add(new Day(date, "выходной!", " праздник!"));
                }
            }
        }
    }

    public void printCalendar (){

        for (int i = 0; i < this.days.size(); i++) {

            System.out.println(i + 1 + " " + this.days.get(i).getName() + " | " + this.days.get(i).getWeekend() + " | "
                    + this.days.get(i).getHoliday());
        }
    }
}
