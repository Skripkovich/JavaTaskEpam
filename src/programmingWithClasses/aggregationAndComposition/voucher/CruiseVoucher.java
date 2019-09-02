package programmingWithClasses.aggregationAndComposition.voucher;

class CruiseVoucher extends Voucher {

    public CruiseVoucher(VoucherType type, String country, String transport, String diet, int daysQuantity) {
        super(type, country, transport, diet, daysQuantity);
    }
}
