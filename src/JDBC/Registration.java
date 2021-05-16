package JDBC;

import javax.lang.model.util.ElementFilter;
import javax.swing.*;
import java.awt.*;

public class Registration extends JFrame {

    public Registration(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000,500);
        this.setBackground(Color.GREEN);
        this.getRootPane().setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

        Container mainContainer = this.getContentPane();
        mainContainer.setLayout(new FlowLayout(FlowLayout.CENTER,5,0));

        JPanel leftPanel = new JPanel();
        leftPanel.setBackground(Color.MAGENTA);
        leftPanel.setPreferredSize(new Dimension(477,400));
        JLabel registrationLabel = new JLabel("Registration");
        leftPanel.add(registrationLabel);


        //right panel
        JPanel rightPanel = new JPanel();
        rightPanel.setBackground(Color.CYAN);
        rightPanel.setPreferredSize(new Dimension(477,400));


        mainContainer.add(leftPanel);
        mainContainer.add(rightPanel);



    }

    public static void main(String[] args){

        new Registration("jdbc").setVisible(true);

    }
}
