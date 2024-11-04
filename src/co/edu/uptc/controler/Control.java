/* Miguel Salamanca */

package co.edu.uptc.controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.uptc.model.AllWords;
import co.edu.uptc.model.Word;
import co.edu.uptc.persistence.ManageJSON;
import co.edu.uptc.view.AddWord;
import co.edu.uptc.view.MyFrame;

public class Control implements ActionListener {
    
    private MyFrame myFrame;
    private AllWords dictionary;
    private ManageJSON manageJSON;

    public Control(){

        myFrame = new MyFrame(this);        
        
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        
        String source = e.getActionCommand();

        if (source.equals("translate")) {

            String lenguage = myFrame.getMainPanel().getLblLenguage().getText(); 
            String word = myFrame.getMainPanel().getTxtSpanish().getText();
            

            if (lenguage.equals("Ingles")) {
                
                
                dictionary = new ManageJSON("data/englishDictionary.json").readJson();
                
                if (dictionary.findWord(word).equals("")) {
                    System.out.println("La palabra: "+word+" no esta registrada en el diccionario");
                }else{
                    myFrame.getMainPanel().getTxtLenguage().setText(dictionary.findWord(word));
                }

                
            }
            else if (lenguage.equals("Frances")) {

                dictionary = new ManageJSON("data/frenchDictionary.json").readJson();

                if (dictionary.findWord(word).equals("")) {
                    System.out.println("La palabra: "+word+" no esta registrada en el diccionario");
                }else{
                    myFrame.getMainPanel().getTxtLenguage().setText(dictionary.findWord(word));
                }

            }
        }



        if (source.equals("add")) {
            
            String[] newWordInfo = new AddWord().getInfo();

            if (newWordInfo[0].equals("english")) {
                
                manageJSON = new ManageJSON("data/englishDictionary.json");
                dictionary = manageJSON.readJson();
                dictionary.getDictionary().add(new Word(newWordInfo[1],newWordInfo[2]));
                manageJSON.writeJson(dictionary);
               
                
            }else if (newWordInfo[0].equals("french")) {

                manageJSON = new ManageJSON("data/frenchDcitionary.json");
                dictionary = manageJSON.readJson();
                dictionary.getDictionary().add(new Word(newWordInfo[1],newWordInfo[2]));
                manageJSON.writeJson(dictionary);
            
            }
        }


        if (source.equals("english")) {

            myFrame.getMainPanel().getLblLenguage().setText("Ingles");
        }   


        if (source.equals("french")) {
            
            myFrame.getMainPanel().getLblLenguage().setText("Frances");

        }
        
    }

}
