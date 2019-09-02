package algorithmization.arrayOfArrays;

/**
 *  Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3,
 * ...,n^2 так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
 * собой. Построить такой квадрат.
 */


import java.util.Scanner;



public class Task2_16 {

    //Четный
    private void method(int n, int[][] matrix){

        int var =1;
        int line = 0;
        int column = (n/2);
        int var2 = 1;

            if(n%2==1) {
                matrix[0][column] = var;

                //Создаем квадрат
                while (var < (n * n)) {
                    var++;
                    line--;
                    column++;

                    if (line < 0) {
                        if (column > n - 1) {
                            column--;
                            line = line + 2;
                            matrix[line][column] = var;
                        } else {
                            line = n - 1;
                            matrix[line][column] = var;
                        }
                    } else if (column > n - 1) {
                        column = 0;
                        matrix[line][column] = var;
                    } else if (matrix[line][column] > 0) {
                        column--;
                        line = line + 2;
                        matrix[line][column] = var;
                    } else {
                        matrix[line][column] = var;
                    }
                }

            }
            else if (n==4){

                //заполняем массив
                for (int i = 0; i<n; i++){

                    for (int j = 0; j<n; j++){

                        matrix[i][j] = var;
                        var++;
                    }
                }

                int check = n/4;

                //квадрат на 4
                for (int i = 0; i<=check; i++) {

                    for (int j = i; j <check; j++) {

                        int a = 0;
                        int b = 0;

                        a = matrix[i][j];
                        matrix[i][j] = matrix[n-var2][n-var2];
                        matrix[n-var2][n-var2] = a;
                        b = matrix[i][n-var2];
                        matrix[i][n-var2] = matrix[n-var2][j];
                        matrix[n-var2][j] = b;
                        var2++;
                    }
                }
            }
            else { //квадраты кратный 4

                //заполняем массив
                for (int i = 0; i<n; i++){

                    for (int j = 0; j<n; j++){

                        matrix[i][j] = var;
                        var++;
                    }
                }

                //большие диагонали
                for (int i = 0; i <4; i++) {

                    for (int j = i; j <= i; j++) {

                        int a = 0;
                        int b = 0;

                        a = matrix[i][j];
                        matrix[i][j] = matrix[n-var2][n-var2];
                        matrix[n-var2][n-var2] = a;
                        b = matrix[i][n-var2];
                        matrix[i][n-var2] = matrix[n-var2][j];
                        matrix[n-var2][j] = b;
                        var2++;
                    }
                }

                //маленькие диагонали
                int count = 0;
                var2=3;
                int count2 = 4;
                int var3 = 1;
                int check = n/4;
                int flag = 0;
                int counter = 0;
                int flag1 = 0;

                while (flag<check) {
                    // побочная диагональ
                    while (flag1<(n/4)) {
                        for (int i = count; i < count + 2; i++) {

                            for (int j = i; j <= i; j++) {

                                int a = 0;

                                a = matrix[i][var2 + count+counter];
                                a = 0;
                                matrix[i][var2 + count +counter] = matrix[var2 + count][j];
                                matrix[i][var2 + count +counter] = 0;
                                matrix[var2 + count][j] = a;
                                var2--;
                            }
                        }
                        var2 = 3;
                        flag1++;
                        counter=counter+4;
                    }

                    //главная диагональ
                    var2 = 3;
                    for (int i = count; i < count + 2; i++) {

                        for (int j = n - count2; j <= n - count2; j++) {

                            int a = 0;

                            a = matrix[i][j];
                            a = 0;
                            matrix[i][j] = matrix[var2 + count][n - var3];
                            matrix[i][j] = 0;
                            matrix[var2 + count][n - var3] = a;
                            var2--;
                            var3++;
                        }
                        count2--;
                    }
                    count = count + 4;
                    count2 = count2 + 6;
                    flag++;
                    var2=3;
                    var3=var3+2;
                }
            }

            //выводим матрицу
            for (int i = 0; i<n; i++){

                for (int j = 0; j<n; j++){

                    System.out.print(matrix[i][j] + "\t");
                }
                System.out.println();
            }
            System.out.println();


    }

    //Не четный
    private void method1 (int n, int [][] matrix){

        int var =1;
        int line = 0;
        int column = (n/2);

        matrix[line][column] = var;
        int currentRow = line;
        int currentColumn = column;

        while (var < n * n) {
            line--;
            column++;
            if (line < 0) {
                line = n - 1;
            }
            if (column >= n) {
                column = 0;
            }
            if (matrix[line][column] != 0) {
                line = currentRow + 1;
                column = currentColumn;
            }
            matrix[line][column] = ++var;
            currentRow = line;
            currentColumn = column;
        }

        //выводим матрицу
        for (int i = 0; i<n; i++){

            for (int j = 0; j<n; j++){

                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

    }

    public static void main (String [] args){

        Task2_16 task2_16 = new Task2_16();

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите n: ");
        int n = sc.nextInt();

        int [][] matrix = new int[n][n];

        if (n % 2 == 0){
            task2_16.method(n, matrix);
        } else {
            task2_16.method1(n, matrix);
        }

        sc.close();
    }

}


