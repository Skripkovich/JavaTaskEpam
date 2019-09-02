package programmingWithClasses.aggregationAndComposition.text;

class Phrase {
    private String value = "";

    public String getValue (){

        return value;
    }

    public void valueAdd (Word word){

        value = value + " " + word.getValue() ;
    }
}
