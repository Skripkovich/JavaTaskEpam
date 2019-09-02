package programmingWithClasses.elementaryClassesAndObjects.book;

/**
 * Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
 * метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
 * методами. Задать критерии выбора данных и вывести эти данные на консоль.
 * Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
 * Найти и вывести:
 * a) список книг заданного автора;
 * b) список книг, выпущенных заданным издательством;
 * c) список книг, выпущенных после заданного года.
 */

public class Book {

    public static void main (String [] args){

        BookArray bookArray = new BookArray();

        bookArray.add(new BookClass("Danko", "Life with Dragon", "Minsk", 2015,
                364, 13.99, "Solid"));
        bookArray.add(new BookClass("Danko", "Life with Dragon2", "Minsk", 2017,
                399, 18.99, "Solid"));
        bookArray.add(new BookClass("Danko", "Dragon is dead", "Minsk", 2018,
                954, 20.00, "Soft"));
        bookArray.add(new BookClass("Petro", "Green people", "Piter", 2012,
                469, 11.58, "Soft"));
        bookArray.add(new BookClass("Petro", "Spring in Summer", "Piter", 2019,
                523, 18.75, "Solid"));
        bookArray.add(new BookClass("Vasil", "Java", "Minsk", 2050,
                864, 20.99, "Solid"));

        //a) список книг заданного автора;
        BookArray bookSelect = new BookArray();

        bookSelect = bookArray.selectByAuthor("Danko");
        bookSelect.bookPrintOut();
        System.out.println();
        System.out.println("_____________________________________");

        // b) список книг, выпущенных заданным издательством;
        bookSelect = bookArray.selectByPublisher("Piter");
        bookSelect.bookPrintOut();
        System.out.println();
        System.out.println("______________________________________");

        //c) список книг, выпущенных после заданного года.
        int startYear = 2016;
        for (int i = 0; i<bookArray.size(); i++){

            BookClass book = (BookClass) bookArray.get(i);

            if (book.getYear()> startYear){

                book.toString(book);
            }
        }
    }

}

