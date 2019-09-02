package programmingWithClasses.aggregationAndComposition.text;

class TextClass {

    private String header;
    private String body = "";

    public String getHeader() {
        return header;
    }

    public String getBody() {
        return body;
    }

    public TextClass (Word word){

        header = word.getValue();
    }

    public TextClass (Phrase phrase){

        header = phrase.getValue();
    }

    public void bodyAdd (Word word){

        body += " " + word.getValue();
    }

    public void bodyAdd (Phrase phrase){

        body += " " + phrase.getValue();
    }


}
