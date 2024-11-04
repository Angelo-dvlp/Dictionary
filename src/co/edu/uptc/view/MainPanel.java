package co.edu.uptc.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MainPanel extends JPanel {

    private ButtonGroup btnGroup;
    private JRadioButton btnEnglish,btnFrench;
    private JLabel lblSpanish,lblLenguage;
    private JTextField txtSpanish, txtLenguage;
    private JButton translate,add;
    private GridBagConstraints gbc;


    
    public JLabel getLblLenguage() {
        return lblLenguage;
    }

    public JTextField getTxtSpanish() {
        return txtSpanish;
    }

    public JTextField getTxtLenguage() {
        return txtLenguage;
    }



    public MainPanel (ActionListener listener){

        this.initComponets(listener);

    }



    public void initComponets(ActionListener listener){
        
        initLayout();
        initButtonGroup(listener);  
        initBody();
        initUnderButtons(listener);
        
    }


    public void initLayout(){

        this.setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();

    }


    public void initButtonGroup(ActionListener listener){

        btnEnglish = new JRadioButton("Ingles");
        gbc.gridx=0;
        gbc.gridy=0;
        gbc.anchor=GridBagConstraints.CENTER;
        gbc.insets = new Insets(5, 3, 5, 3);
        this.add(btnEnglish , gbc);

        btnEnglish.addActionListener(listener);
        btnEnglish.setActionCommand("english");


        btnFrench = new JRadioButton("Frances");
        gbc.gridx =1;
        gbc.anchor=GridBagConstraints.WEST;
        this.add(btnFrench,gbc);

        btnFrench.addActionListener(listener);
        btnFrench.setActionCommand("french");


        btnGroup = new ButtonGroup();
        btnGroup.add(btnEnglish);
        btnGroup.add(btnFrench);     
        
        

    }



    public void initBody(){

        lblSpanish = new JLabel("Español");
        gbc.gridx = 0;
        gbc.gridy = 1;
        this.add(lblSpanish,gbc);


        txtSpanish = new JTextField();
        gbc.gridx = 1;
        gbc.weightx=1;
        gbc.fill=GridBagConstraints.HORIZONTAL;
        this.add(txtSpanish,gbc);


        lblLenguage = new JLabel("Seleccione un Idioma");
        gbc.gridx=0;
        gbc.gridy=2;
        gbc.weightx=0;
        this.add(lblLenguage,gbc);

        txtLenguage = new JTextField();
        gbc.gridx = 1;
        gbc.weightx=1;
        gbc.fill=GridBagConstraints.HORIZONTAL;
        this.add(txtLenguage,gbc);
  
    }



    public void initUnderButtons(ActionListener listener){

        translate = new JButton("Traducir");
        gbc.weightx=0;
        gbc.gridx=0;
        gbc.gridy=3;
        gbc.gridwidth= 2;
        this.add(translate,gbc);

        translate.addActionListener(listener);
        translate.setActionCommand("translate");


        add = new JButton("Agregar");
        gbc.weightx=0;
        gbc.gridx=0;
        gbc.gridy=4;
        this.add(add,gbc);

        add.addActionListener(listener);
        add.setActionCommand("add");

        
    }
}
