package programmingWithClasses.aggregationAndComposition.voucher;

class ShoppingVoucher extends Voucher {

    public ShoppingVoucher(VoucherType type, String country, String transport, String diet, int daysQuantity) {
        super(type, country, transport, diet, daysQuantity);
    }
}
