package stringsAndBasicsOfTextProcessing.workingWithAStringAsAnObject;

/**
 *  В строке вставить после каждого символа 'a' символ 'b'.
 */

public class Task2_2 {

    public static void main(String [] args){

        StringBuilder sb = new StringBuilder("asdfgkdf a adskfdAadadkadadwadaaaad adad aaaad   dadadad");

        for (int i = 0; i<sb.length(); i++) {
            if (sb.charAt(i)=='a') {
                sb.insert(i+1, "b");
            }
        }

        System.out.println(sb);
    }
}
