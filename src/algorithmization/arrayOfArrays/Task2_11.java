package algorithmization.arrayOfArrays;

/**
 *  Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
 * которых число 5 встречается три и более раз.
 */



import java.util.ArrayList;
import java.util.Random;

public class Task2_11 {

    public static void main (String [] ar){

       Random rng = new Random();

        int[][] matrix = new int[10][20];

        ArrayList mass = new ArrayList();

            //Заполняем матрицу и проверяем на наличие колличества чисел 5
            for (int i = 0; i < 10; i++) {

                int counter = 0;
                for (int j = 0; j < 20; j++) {
                    matrix[i][j] = rng.nextInt(15);
                    if (matrix[i][j] == 5){
                        counter +=1;
                    }
                }
                if (counter>=3){
                    mass.add(i+1);
                }
            }

            //Выводим матрицу на экран
            for (int i = 0; i < 10; i++) {

                for (int j = 0; j < 20; j++) {
                    System.out.print(matrix[i][j] + "\t");
                }
                System.out.println();
            }
            System.out.println();

            if (mass.isEmpty()){
                System.out.print("Строк в котрохы число 5 встречается три и более раз нет");
            } else{
                System.out.print("Строки в которых число 5 встречается три и более раз: " + mass);
            }



    }
}
