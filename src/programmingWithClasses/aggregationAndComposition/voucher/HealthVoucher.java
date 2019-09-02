package programmingWithClasses.aggregationAndComposition.voucher;

class HealthVoucher extends Voucher {

    public HealthVoucher(VoucherType type, String country, String transport, String diet, int daysQuantity) {
        super(type, country, transport, diet, daysQuantity);
    }
}
