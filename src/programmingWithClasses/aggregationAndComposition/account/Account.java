package programmingWithClasses.aggregationAndComposition.account;

/**
 * Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
 * счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
 * всем счетам, имеющим положительный и отрицательный балансы отдельно.
 */

public class Account {

    public static void main (String [] ar){

        AccountClass skrip = new AccountClass();

        User skripkovich = new User("Скрипкович", "Александр", "Олегович", skrip);

        skrip.accountInform("255489F", "25.69", "Активен");
        skrip.accountInform("254777A", "-286.35", "Активен");
        skrip.accountInform("365488S", "154.86", "Активен");
        skrip.accountInform("985588W", "-801.86", "Активен");

        skripkovich.print();
        System.out.println();

        //Блокировка/разблокировка счета
        skripkovich.blockUnblock("254777A", "Заблокировать");
        skripkovich.blockUnblock("985588W", "Заблокировать");
        skripkovich.print();
        System.out.println();

        //Сортировка по номеру счету, по балансу и по статусу
        skripkovich.sortName();
        //skripkovich.sortBalance();
        //skripkovich.sortStatus();
        skripkovich.print();
        System.out.println();

        //Общая сумма по счетам
        skripkovich.summAccount();
        System.out.println();

        //Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.
        skripkovich.summAccountPlus();
        skripkovich.summAccountMinus();


    }

}



