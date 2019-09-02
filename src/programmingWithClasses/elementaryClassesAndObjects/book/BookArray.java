package programmingWithClasses.elementaryClassesAndObjects.book;

import java.util.ArrayList;

//для хранения данных
class  BookArray extends ArrayList {

    //вывод информации по названию автора
    public BookArray selectByAuthor (String name){

        BookArray result1 = new BookArray();

        for(int i=0;i <= this.size()-1;i++){

            BookClass book1 = (BookClass) this.get(i);

            if (book1.getAuthor() == name){
                result1.add(book1);
            }
        }
        return result1;
    }

    //вывод информации по названию издательства
    public BookArray selectByPublisher (String name){

        BookArray result1 = new BookArray();

        for(int i=0;i <= this.size()-1;i++){

            BookClass book1 = (BookClass) this.get(i);

            if (book1.getPublishing() == name){
                result1.add(book1);
            }
        }
        return result1;
    }

    //метод для печати
    public void bookPrintOut (){

        for(int i=0;i <= this.size()-1;i++){
            BookClass book1 = (BookClass) this.get(i);
            book1.toString(book1);
        }
    }
}
