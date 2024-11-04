package co.edu.uptc.model;

import java.util.ArrayList;

public class AllWords {

    private ArrayList<Word> dictionary;

    
    public ArrayList<Word> getDictionary() {
        return dictionary;
    }

    public void setDictionary(ArrayList<Word> dictionary) {
        this.dictionary = dictionary;
    }

    
    
    

    public AllWords() {

        

    }




    public String findWord(String word) {

        String traslatedWord = "";
        int i = 0;
        boolean found =false;


        while (!found && dictionary.size()>i) {

            if (dictionary.get(i).getSpanishWord().equals(word)) {

                traslatedWord = dictionary.get(i).getTranslatedWord();
                found = true;

            }else{
                i++;
            }
            
        }

        return traslatedWord;
    }



    @Override
    public String toString() {
        return "AllWords [dictionary=" + dictionary.toString() + "]";
    }



    

}
