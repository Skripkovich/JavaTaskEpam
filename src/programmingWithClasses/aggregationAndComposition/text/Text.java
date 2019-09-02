package programmingWithClasses.aggregationAndComposition.text;

/**
 *  Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
 * консоль текст, заголовок текста.
 */

public class Text {

    public static void main (String [] args){

        Word word = new Word("JAVA");

        TextClass text = new TextClass(word);

        Word word1 = new Word("Java");
        Word word2 = new Word("is");
        Word word3 = new Word("best");

        Phrase phrase = new Phrase();
        phrase.valueAdd(word1);
        phrase.valueAdd(word2);
        phrase.valueAdd(word3);

        text.bodyAdd(phrase);

        System.out.println("Header: " + text.getHeader());
        System.out.println("Body:" + text.getBody());
    }
}

