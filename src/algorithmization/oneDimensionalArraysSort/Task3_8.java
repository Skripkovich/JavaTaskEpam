package algorithmization.oneDimensionalArraysSort;

/**
 * Составить программу, которая приводит  дроби к общему знаменателю и упорядочивает их в порядке возрастания.
 */

import java.util.Scanner;

public class Task3_8 {

    public static void main (String [] args){

        Scanner sc1 = new Scanner(System.in);

        System.out.print("Введите длинну массива: ");
        int a = sc1.nextInt();

        int [] massP = new int[a];
        int [] massQ = new int[a];

        int max = 0;
        boolean flag = false;
        int counter = 1;
        int variable = 0;

        try {

            //Заполняем массив
            for(int i = 0; i<a; i++){

               massP [i] = 2+(int) (Math.random()*20);
               massQ [i] = 2+(int) (Math.random()*20);
            }

            //выводим на экран дроби
            for (int i = 0; i<a; i++){

                System.out.print(massP[i] + "/" + massQ[i] + " ");
            }

            //найти наибольшее число знаменателя
            for (int i = 0; i<a; i++){

                for (int j = 0; j<a; j++){

                    if (massQ[i]>massQ[j] & massQ[i]>max){

                        max = massQ[i];
                    } else if (massQ[j]>max){
                        max = massQ[j];
                    }
                }
            }

            //находим наименьший общий дилитель
            while (!flag) {
                max=max*counter;
                counter++;

                for (int i = 0; i < massQ.length; i++) {

                    if (max%massQ[i] == 0) {
                        flag = true;

                    }else {
                        flag=false;
                        break;
                    }
                }
            }

            flag = false;

            System.out.println();

            //домножаем дроби
            for (int i = 0; i<massP.length; i++){

                int var =0;
                var = max/massQ[i];

                massP[i]= massP[i]*var;
                massQ[i] = massQ[i]*var;
                System.out.print(massP[i] + "/" + massQ[i] + " ");
            }

            //сортируем дроби
            while (!flag) {
                flag = true;
                for (int i = 0; i < massP.length - 1; i++) {
                    if (massP[i] > massP[i + 1]) {
                        flag = false;

                        variable = massP[i];
                        massP[i] = massP[i + 1];
                        massP[i + 1] = variable;
                    }
                }
            }

            //выводим на жкран новые дроби
            for (int i = 0; i<massP.length; i++){

                System.out.print(massP[i] + "/" + massQ[i] + " ");
            }
        }finally {
            sc1.close();
        }
    }
}
