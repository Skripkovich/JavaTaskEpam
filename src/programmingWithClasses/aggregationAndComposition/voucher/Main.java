package programmingWithClasses.aggregationAndComposition.voucher;

/**
 * Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
 * различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
 * возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main (String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ValidatorInputDate validatorInputData = new ValidatorInputDate();
        VoucherList voucherList = new VoucherList();

        voucherList.setVouchers(voucherList.createVoucherList());

        System.out.println("Добро пожаловать в нашу туристическую компанию!");
        System.out.println("Вы можите выбрать тур:");
        System.out.println("Туры нашей компании:");
        voucherList.printAll();

        System.out.println("Выберите тип тура (cruise, excursion, health, relax, shopping):");
        String s = reader.readLine();

        System.out.println("Выберите транспорт (air, bus):");
        String s1 = reader.readLine();

        System.out.println("Выберите тип питания (RO, BB, HB, HB+, FB, FB+, AL:");
        String s2 = reader.readLine();

        System.out.println("Введите колличество дней:");
        String s3 = reader.readLine();

        ArrayList<Voucher> vouchersForClients = new ArrayList<>();

        try {

            vouchersForClients = voucherList.getVoucherListForClient(validatorInputData.getVoucherTypeForClient(s),
                    validatorInputData.getTransportForClient(s1), validatorInputData.getDietForClient(s2),
                    validatorInputData.getDaysQuantityForClient(s3));

            if (vouchersForClients.size() >= 1) {
                System.out.println("\nВозможные туры:");
            }

            if (vouchersForClients != null) {
                VoucherList.printForClient(vouchersForClients);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        if (vouchersForClients.size() > 1) {

            VoucherList.sort(vouchersForClients);
            System.out.println("\nПосле сортировки :");
            VoucherList.printForClient(vouchersForClients);
        }

    }
}

