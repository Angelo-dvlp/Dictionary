package co.edu.uptc.model;


public class Word {
    
    private String spanishWord ;
    private String translatedWord ;

    //
    
    public String getSpanishWord() {
        return spanishWord;
    }

    public void setSpanishWord(String spanishWord) {
        this.spanishWord = spanishWord;
    }

    public String getTranslatedWord() {
        return translatedWord;
    }

    public void setTranslatedWord(String translatedWord) {
        this.translatedWord = translatedWord;
    }



    public Word(String spanishWord, String translatedWord) {
        this.spanishWord = spanishWord;
        this.translatedWord = translatedWord;
    }


    
    public Word() {
    }

    @Override
    public String toString() {
        return "Word [spanishWord=" + spanishWord + ", translatedWord=" + translatedWord + "]";
    }



    

}
