package co.edu.uptc.persistence;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import co.edu.uptc.model.AllWords;

public class ManageJSON {


    private String file;



    public ManageJSON(String file ) {
        
        this.file = file;
        

    }


    public AllWords readJson(){

        AllWords dictionary = null;

        try {

            JsonReader jsonReader = new Gson().newJsonReader(new FileReader(this.file));
            dictionary = new Gson().fromJson(jsonReader, AllWords.class);
           
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return dictionary;
    }


    
    public void writeJson(AllWords dictionary){

        String newJson = new Gson().toJson(dictionary);

        try {
            PrintWriter writer = new PrintWriter(this.file);
            writer.write(newJson);
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

    
}
