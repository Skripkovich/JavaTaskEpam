package stringsAndBasicsOfTextProcessing.workingWithRegularExpressions.task3_1;

/**
 * Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три различных
 * операции: отсортировать абзацы по количеству предложений; в каждом предложении отсортировать слова по длине;
 * отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по
 * алфавиту.
 */

import java.util.Scanner;

public class Main {

    public static void main (String [] args){

        String s = "Война изуродовала Боровое. Вперемежку с уцелевшими избами стояли, как памятники народного горя," +
                "обуглившиеся печи. Торчали столбы от ворот. Сарай зиял огромной дырой – от него отломили половину и " +
                "унесли." +
                "\n" +
                "Были сады, а теперь пни – как гнилые зубы. Лишь кое-где приютились по две-три яблоньки-подростка." +
                "\n" +
                "Село обезлюдело.";


        System.out.println("Данн текст:");
        System.out.println(s);
        System.out.println();
        System.out.println("Выберите вводом цифр от 1 до 3 вкючительно какую операцию Вы хотите произвести с текстом:\n"+
                            "1) Отсортировать абзацы по количеству предложений\n"+
                            "2) В каждом предложении отсортировать слова по длине\n" +
                            "3) Отсортировать лексемы в предложении по убыванию количества вхождений заданного символа,"+
                            "а в случае равенства – по алфавиту.");

        System.out.println();
        System.out.println("Введите цифру от 1 до 3 включительно для выбора действия:");

        Scanner sc = new Scanner(System.in);

        boolean check = true;

        while (check){
            while (!sc.hasNextInt()) {
                sc.next();
                System.out.print("Ошибка! Введите цифры от 1 до 3 включительно: ");
            }

            int in = sc.nextInt();

            if (in == 1){

                //сортировка абзацев по количеству предложений
                SortParagraph.sortParagrph(s);
            }
            else if (in == 2) {

                //сортировка слов в предложении по длинне
                SortWords.sortWords(s);
            }
            else if (in ==3){

                //сортировка по вхождению
                Scanner sc2 = new Scanner(System.in);

                System.out.println("Введите вхождение для сортировки: ");

                String in1 = sc2.nextLine();

                SortByOccurrence.SortByOccurrence(s,in1);
                System.out.println();
            }

            else if (in == 0){

                check = false;
            }
            else {
                System.out.print("Ошибка! Введите цифры от 1 до 3 включительно: ");
            }
        }

        sc.close();

    }
}
