package co.edu.uptc.view;

import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
    
    private MainPanel mainPanel;

    public MainPanel getMainPanel() {
        return mainPanel;
    }

    public void setMainPanel(MainPanel mainPanel) {
        this.mainPanel = mainPanel;
    }

    public MyFrame(ActionListener listener) {
        super("Diccionario");
        this.setSize(250, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.initComponets(listener);
        this.setVisible(true);
    }

    public void initComponets(ActionListener listener) {
        mainPanel = new MainPanel(listener);
        this.setContentPane(mainPanel);
    }
    

}
