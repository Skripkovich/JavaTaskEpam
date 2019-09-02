package programmingWithClasses.aggregationAndComposition.state;

class Region {

    private String regionName;
    private double square;

    public String getRegionName() {
        return regionName;
    }

    public double getSquare() {
        return square;
    }

    public Region(String regionName, double square) {
        this.regionName = regionName;
        this.square = square;
    }

}
