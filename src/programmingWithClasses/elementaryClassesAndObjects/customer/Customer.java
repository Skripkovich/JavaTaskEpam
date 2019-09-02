package programmingWithClasses.elementaryClassesAndObjects.customer;

/**
 * Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
 * и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
 * и методами. Задать критерии выбора данных и вывести эти данные на консоль.
 * Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
 * Найти и вывести:
 * a) список покупателей в алфавитном порядке;
 * b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
 */

import java.util.Collections;
import java.util.Comparator;

public class Customer {

    static Comparator<CustomerClass> surname = new Comparator <CustomerClass>() {

        @Override
        public int compare(CustomerClass o1, CustomerClass o2) {

            return o1.getSurname().compareTo(o2.getSurname());
        }
    };

    public static void main (String [] args){

        CustomerArray customerArray = new CustomerArray();

        customerArray.add(new CustomerClass("Скрипкович", "Александр", "Олегович",
                "Минск", 21543, "842145483"));
        customerArray.add(new CustomerClass("Вронская", "Анна", "Сергеевна",
                "Минск", 35694, "234988875"));
        customerArray.add(new CustomerClass("Лобач", "Николай", "Андреевич",
                "Брест", 54987, "315469822"));

        CustomerArray customerSelect = new CustomerArray();

        //выводим данные на экран
        customerSelect = customerArray.selectByName("Николай");
        customerSelect.customerPrintOut();
        System.out.println();

        //a) список покупателей в алфавитном порядке
        Collections.sort(customerArray, surname );
        customerArray.customerPrintOut();
        System.out.println();

        //b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
        int startPos = 15000,finPos = 35000;
        for (int i = 0; i <= customerArray.size()-1;i++){

            CustomerClass costumer = (CustomerClass) customerArray.get(i);

            if(costumer.getCard() >= startPos && costumer.getCard() <= finPos){
                costumer.toString(costumer);
            }

        }
    }
}

