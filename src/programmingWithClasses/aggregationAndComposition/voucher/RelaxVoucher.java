package programmingWithClasses.aggregationAndComposition.voucher;

class RelaxVoucher extends Voucher {

    public RelaxVoucher(VoucherType type, String country, String transport, String diet, int daysQuantity) {
        super(type, country, transport, diet, daysQuantity);
    }
}
