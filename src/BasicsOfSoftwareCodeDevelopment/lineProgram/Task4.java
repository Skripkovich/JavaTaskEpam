package BasicsOfSoftwareCodeDevelopment.lineProgram;

/**
 * Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
 * дробную и целую части числа и вывести полученное значение числа.
 */

public class Task4 {

    public static void main (String[] args) {

        float r = 325.647f;

        //отделяем дробную часть от r
        int r1 = (int)r;

        // отделяем целую часть от r
        float r2 = r%1;

        //преобразовываем дробную часть в целую
        int r3 = ((int) (r2*1000));

        //преобразовываем целую часть в дробную
        float r4 = ((float)r1/1000);

        //меняем местами дробную часть и целую действительного числа r
        float rezult = r3+r4;

        System.out.println(r);
        System.out.print(rezult);


    }
}
