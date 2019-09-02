package programmingWithClasses.aggregationAndComposition.voucher;

public class ValidatorDateInFile {

    public void validate(String line) throws VoucherException {
        int count = 1;
        String[] words = line.split("\\s+");
        if (words.length != 5) {
            throw new VoucherException("Неверные данные в файле! ");
        } else {
            String country = words[0].toLowerCase();
            String diet = words[1].toLowerCase();
            String transport = words[2].toLowerCase();
            String daysQuantity = words[3];

            switch (diet) {
                case "ro":
                case "bb":
                case "hb":
                case "hb+":
                case "fb":
                case "fb+":
                case "al":
                    break;
                default:
                    throw new VoucherException("Неверное питание!");
            }
            switch (transport) {
                case "bus":
                case "air":
                    break;
                default:
                    throw new VoucherException("Неверынй транспорт");
            }
            switch (country) {
                case "israel":
                case "germany":
                case "thailand":
                case "china":
                case "india":
                case "switzerland":
                case "belorussia":
                case "sweden":
                case "finland":
                case "norway":
                case "estonia":
                case "denmark":
                case "spain":
                case "england":
                case "usa":
                case "ukraine":
                case "russia":
                case "egypt":
                case "turkey":
                case "tunisia":
                case "italy":
                case "france":
                    break;
                default:
                    throw new VoucherException("Неверная страна");
            }
            if (!daysQuantity.matches("[+]?\\d+")) {
                throw new VoucherException("Неверное колличество дней");
            }
        }
    }
}
