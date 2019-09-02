package programmingWithClasses.aggregationAndComposition.voucher;

public class Voucher {

    private VoucherType type;
    private String transport;
    private String diet;
    private int daysQuantity;
    private String country;

    public VoucherType getType() {
        return type;
    }

    public void setType(VoucherType type) {
        this.type = type;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public int getDaysQuantity() {
        return daysQuantity;
    }

    public void setDaysQuantity(int daysQuantity) {
        this.daysQuantity = daysQuantity;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Voucher(VoucherType type, String country, String transport, String diet, int daysQuantity) {
        this.type = type;
        this.country = country;
        this.transport = transport;
        this.diet = diet;
        this.daysQuantity = daysQuantity;
    }

    @Override
    public String toString() {
        return "Voucher{" +
                "тип=" + type +
                ", транспорт='" + transport + '\'' +
                ", питание='" + diet + '\'' +
                ", колличество дней=" + daysQuantity +
                ", страна='" + country + '\'' +
                '}';
    }


}
