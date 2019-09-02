package programmingWithClasses.aggregationAndComposition.state;

class City {

    private String cityName;
    private String region;
    private String district;
    private String Capital;
    private String regionalCenter;
    private double regionSquare;

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }

    public String returnRegionName() {
        return region;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getDistrict() {
        return district;
    }

    public double returnRegionSquare() {
        return regionSquare;
    }

    public String getCapital() {
        return Capital;
    }

    public String getRegionalCenter() {
        return regionalCenter;
    }

    public City (String cityName, Region region, District district, String Capital, String RegionalCenter) {

        this.cityName = cityName;
        this.region = region.getRegionName();
        this.regionSquare = region.getSquare();
        this.setDistrict(district.getDistrict());
        this.Capital = Capital;
        this.regionalCenter = RegionalCenter;


    }

    public void toString (City city){

        System.out.println("Наименвоание города: " + this.cityName + ", наименвоание области: " + this.region +
                ", площадь региона: " + this.regionSquare + ", наименвоание области: " + getDistrict() + ", сталица: " +
                this.Capital + ", наименование регионального центра: " + this.regionalCenter);
    }



}
