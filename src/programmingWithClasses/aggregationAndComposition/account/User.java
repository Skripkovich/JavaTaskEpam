package programmingWithClasses.aggregationAndComposition.account;

import java.util.ArrayList;
import java.util.Collections;

class User {

    private String surname;
    private String name;
    private String secondName;
    private AccountClass account;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setAccount(AccountClass account) {
        this.account = account;
    }

    public AccountClass getAccount() {
        return account;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public User (){

    }

    public User (String surname, String name, String secondName, AccountClass account){

        this.surname = surname;
        this.name = name;
        this.secondName = secondName;
        this.account = account;

    }

    public void print (){

        System.out.println("Фамилия Имя Отчество: " + this.surname + " " + this.name + " " + this.secondName);
        System.out.println("Номер счета и баланс:");

        for (int i = 0; i<this.account.name.size(); i++){

            System.out.println(i+1 +") " + this.account.name.get(i) + " " + this.account.bal.get(i) + " Статус: " +
                        this.account.status.get(i));


        }
    }

    public void blockUnblock (String number, String status){

        int a = account.name.indexOf(number);

        if (status.equals("Заблокировать")){

            account.status.set(a,"Заблокирован" );
        } else {
            account.status.set(a,"Активен" );
        }
    }

    public void sortName() {

        ArrayList sortPosition = new ArrayList();

        for (int i = 0; i<account.name.size(); i++) {
            sortPosition.add(i, account.name.get(i));
        }

        Collections.sort(sortPosition);

        for (int i =0; i< sortPosition.size(); i++){

            for (int j =0; j<account.name.size(); j++) {
                if (sortPosition.get(i).equals(account.name.get(j))){

                    sortPosition.set(i, account.name.get(i));
                    account.name.set(i, account.name.get(j));
                    account.name.set(j, (String) sortPosition.get(i));

                    sortPosition.set(i, account.bal.get(i));
                    account.bal.set(i, account.bal.get(j));
                    account.bal.set(j, (String) sortPosition.get(i));

                    sortPosition.set(i, account.status.get(i));
                    account.status.set(i, account.status.get(j));
                    account.status.set(j, (String) sortPosition.get(i));

                }
            }
        }
    }

    public void sortBalance() {

        ArrayList sortPosition = new ArrayList();

        for (int i = 0; i<account.bal.size(); i++) {
            sortPosition.add(i, account.bal.get(i));
        }

        Collections.sort(sortPosition);

        for (int i =0; i< sortPosition.size(); i++){

            for (int j =0; j<account.bal.size(); j++) {
                if (sortPosition.get(i).equals(account.bal.get(j))){

                    sortPosition.set(i, account.name.get(i));
                    account.name.set(i, account.name.get(j));
                    account.name.set(j, (String) sortPosition.get(i));

                    sortPosition.set(i, account.bal.get(i));
                    account.bal.set(i, account.bal.get(j));
                    account.bal.set(j, (String) sortPosition.get(i));

                    sortPosition.set(i, account.status.get(i));
                    account.status.set(i, account.status.get(j));
                    account.status.set(j, (String) sortPosition.get(i));

                }
            }
        }
    }

    public void sortStatus() {

        ArrayList sortPosition = new ArrayList();
        ArrayList a = new ArrayList();

        for (int i = 0; i<account.status.size(); i++) {
            sortPosition.add(i, account.status.get(i));
        }

        Collections.sort(sortPosition);

        for (int i =0; i< sortPosition.size(); i++){

            for (int j =0; j<account.status.size(); j++) {
                if (sortPosition.get(i).equals(account.status.get(j))){

                    a.add(i, account.name.get(i));
                    account.name.set(i, account.name.get(j));
                    account.name.set(j, (String) a.get(i));

                    a.add(i, account.bal.get(i));
                    account.bal.set(i, account.bal.get(j));
                    account.bal.set(j, (String) a.get(i));

                    a.add(i, account.status.get(i));
                    account.status.set(i, account.status.get(j));
                    account.status.set(j, (String) a.get(i));

                }
            }
        }
    }

    public void summAccount (){

        double summ = 0.0;

        for (int i = 0; i<account.status.size(); i++){

            if (account.status.get(i).equals("Активен")){


                summ += Double.parseDouble(account.bal.get(i));
            }
        }
         System.out.println("Сумма на счетах составляет: " + summ);
    }

    public void summAccountPlus (){

        double summ = 0.0;

        for (int i = 0; i<account.bal.size(); i++){

            if (account.bal.get(i).charAt(0) != '-'){

                summ += Double.parseDouble(account.bal.get(i));
            }
        }
        System.out.println("Положительная сумма на счетах: " + summ);
    }

    public void summAccountMinus (){

        double summ = 0.0;

        for (int i = 0; i<account.bal.size(); i++){

            if (account.bal.get(i).charAt(0) == '-'){

                summ += Double.parseDouble(account.bal.get(i));
            }
        }
        System.out.println("Сумма задолжности составляет: " + summ);
    }
}
