package programmingWithClasses.aggregationAndComposition.voucher;

class ExcursionVoucher extends Voucher {

    public ExcursionVoucher(VoucherType type, String country, String transport, String diet, int daysQuantity) {
        super(type, country, transport, diet, daysQuantity);
    }
}
