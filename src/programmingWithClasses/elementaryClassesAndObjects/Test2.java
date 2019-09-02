package programmingWithClasses.elementaryClassesAndObjects;

/**
 * Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. Добавьте
 * конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра
 * класса.
 */

public class Test2 {

    private int a;
    private int b;

    //конструктор с входными параметрами
    public Test2 (String a, String b){

        System.out.println("Конструктор с входными параметрами: " + a + " и " + b);
    }

    //конструктор, который инициализирует переменные по умолчанию
    public Test2 (){

        a = 1;
        b = 1;
    }

    //Геттеры и сеттеры
    public void setA (int a){
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getB() {
        return b;
    }
}
