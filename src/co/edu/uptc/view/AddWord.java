package co.edu.uptc.view;

import javax.swing.JOptionPane;

public class AddWord {

    public AddWord() {


    }

    public String[] getInfo() {

        String[] newWordInfo = new String[3];
        int option = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el idioma\n1. Ingles\n2. Frances"));

            switch (option) {
                case 1:

                newWordInfo[0] ="english";
                newWordInfo[2] = JOptionPane.showInputDialog("Ingrese la palabra en Ingles");
                    break;

                case 2:

                newWordInfo[0] ="french";
                newWordInfo[2] = JOptionPane.showInputDialog("Ingrese la palabra en Frances");
                    break;

                default:
                    break;
            }

            newWordInfo[1] = JOptionPane.showInputDialog("Ingrese la traduccion en Español");
        
           return newWordInfo; 
    }
}
