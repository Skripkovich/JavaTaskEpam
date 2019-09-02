package programmingWithClasses.elementaryClassesAndObjects;

/**
 * Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
 * переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
 * наибольшее значение из этих двух переменных.
 */

public class Test1 {

    private int x;
    private int y;

    //метод вывода на экран
    public void print (int summ, int max){

        System.out.println("Максимальное значение из чисел " + this.x + " и " + this.y + " :" + max);
        System.out.println("Сумма значений из чисел " + this.x + " и " + this.y + " :" + summ);
    }

    //методы получения и изменения переменных
    public int getX (){
        return x;
    }

    public void setX (int x){
        this.x = x;
    }

    public int getY (){
        return y;
    }

    public void setY (int y){
        this.y = y;
    }

    //метод нахождения суммы значений этих переменных
    public int summ (int x, int y){

        int summ = x + y;
        return summ;
    }

    //метод нахождение наибольшего значения из этих двух переменных
    public int max (int x, int y){

        if (x>y){
            return x;
        }else return y;
    }

}
