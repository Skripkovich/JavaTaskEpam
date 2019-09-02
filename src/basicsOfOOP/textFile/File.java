package basicsOfOOP.textFile;

/**
 * Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
 * вывести на консоль содержимое, дополнить, удалить.
 */


import java.io.*;

public class File {

    public static void main (String[] args){

        Directory directory = new Directory("F:\\Games\\");

        FileClass file = new TextFile("file", directory);

        String s = "Skripkovich";

        file.createFile(s);
        file.rename("FileFile228", s);
        file.addFile(" Alexander");
        file.print();
        file.deleteDate();

    }
}

