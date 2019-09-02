package programmingWithClasses.elementaryClassesAndObjects.train;

class Train implements Comparable<Train> {
    private String city;
    private String trainNumber;
    private String time;

    Train(String trainNumber, String city, String time) {
        this.trainNumber = trainNumber;
        this.city = city;
        this.time = time;
    }

    public String getTrainNumber() {
        return trainNumber;
    }

    //переропределение метода для печати информации из массива
    @Override
    public String toString() {
        return "Train N" + this.trainNumber + " | City of arrival: " + this.city + " | Arrival time: " + this.time;
    }

    //переопределение функции compareTo для сортировки по городу и времени
    @Override
    public int compareTo(Train t) {
        int result = this.city.compareTo(t.city);
        if (result == 0) {
            result = this.time.compareTo(t.time);
        }
        return result;
    }
}
