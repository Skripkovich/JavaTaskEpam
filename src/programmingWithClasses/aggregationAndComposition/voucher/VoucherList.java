package programmingWithClasses.aggregationAndComposition.voucher;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VoucherList {

    private ArrayList<Voucher> vouchers;

    public ArrayList<Voucher> getVouchers() {
        return vouchers;
    }

    public void setVouchers(ArrayList<Voucher> vouchers) {
        this.vouchers = vouchers;
    }

    public ArrayList<Voucher> createVoucherList() throws IOException {

        VoucherFactory voucherFactory = new VoucherFactory();
        ArrayList<Voucher> vouchers = new ArrayList<>();

        Logger logger = Logger.getLogger(Main.class.getName());
        FileHandler fh = new FileHandler("LogFile1");
        logger.addHandler(fh);
        BufferedReader reader = new BufferedReader(new FileReader("Voucher"));

        String line;
        String[] words;
        Voucher voucher = null;
        int count = 1;

        while ((line = reader.readLine()) != null) {
            ValidatorDateInFile validator = new ValidatorDateInFile();
            try {
                validator.validate(line);
                words = line.split("\\s+");
                voucher = VoucherFactory.createVoucher(voucherFactory.getVoucherType(words[0].toLowerCase()),
                        words[0], words[2], words[1], Integer.parseInt(words[3]));
                vouchers.add(voucher);
            } catch (VoucherException e) {
                System.out.println(e.getMessage() + "в строке " + count);
                logger.log(Level.WARNING, e.getMessage());
            }
            count++;
        }
        return vouchers;
    }

    public void printAll() {
        for (int i = 0; i < vouchers.size(); i++) {
            System.out.println(vouchers.get(i));
        }
    }

    public ArrayList<Voucher> getVoucherListForClient(VoucherType type, String transport, String diet, int daysQuantity)
            throws Exception {

        ArrayList<Voucher> vouchersForClient = new ArrayList<>();

        boolean isContain = false;
        boolean bool = false;
        for (int i = 0; i < vouchers.size(); i++) {
            if (!type.equals(null) && !transport.equals("") && !diet.equals("") && daysQuantity != 0) {
                if (vouchers.get(i).getType().equals(type) && vouchers.get(i).getTransport().equalsIgnoreCase(transport)
                        && vouchers.get(i).getDiet().equalsIgnoreCase(diet) && vouchers.get(i).getDaysQuantity()
                        == daysQuantity) {
                    vouchersForClient.add(vouchers.get(i));
                    isContain = true;
                }
            } else {
                bool = true;
            }
        }
        if (!isContain && !bool) {
            System.out.println("Нет тура!");
        }
        return vouchersForClient;
    }

    public static void printForClient(ArrayList<Voucher> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void sort(ArrayList<Voucher> list) {
        Collections.sort(list, new VoucherComparator());
    }
}
