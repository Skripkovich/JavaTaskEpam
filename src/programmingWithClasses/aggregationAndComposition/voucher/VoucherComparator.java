package programmingWithClasses.aggregationAndComposition.voucher;

import java.util.Comparator;

public class VoucherComparator implements Comparator<Voucher> {
    @Override
    public int compare(Voucher o1, Voucher o2) {
         return o1.getCountry().compareTo(o2.getCountry());
    }
}
