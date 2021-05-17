package JDBC;

import javax.imageio.plugins.jpeg.JPEGHuffmanTable;
import javax.lang.model.util.ElementFilter;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.TableModel;
import java.awt.*;

public class Registration extends JFrame {

    public Registration(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000,500);
        this.getRootPane().setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

        Container mainContainer = this.getContentPane();
        mainContainer.setLayout(new FlowLayout(FlowLayout.CENTER,5,0));

        JPanel mainLeftPanel = new JPanel();
        mainLeftPanel.setLayout(null);
         mainLeftPanel.setPreferredSize(new Dimension(477,400));
        JLabel registrationLabel = new JLabel("Registration");
        registrationLabel.setBounds(10,25,80,20);
        mainLeftPanel.add(registrationLabel);

        //left panel
        JPanel leftPanel = new JPanel();
        leftPanel.setBorder(new EmptyBorder(10,10,10,10));
        leftPanel.setBounds(0, 50, 300,150);
        leftPanel.setLayout(new GridLayout(5,2,10,5));

        JLabel departmentLabel = new JLabel("Department");
        JTextField departmentField = new JTextField();
        JLabel firstNameLabel = new JLabel("First name");
        JTextField firstNameField = new JTextField();
        JLabel lastNameLabel = new JLabel("Last name");
        JTextField lastNameField = new JTextField();
        JLabel passOutYearLabel = new JLabel("Pass out Year");
        JTextField passOutYearField = new JTextField();
        JLabel universityRankLabel = new JLabel("University Rank");
        JTextField universityRankField = new JTextField();

        //add them to left panel
        leftPanel.add(departmentLabel);
        leftPanel.add(departmentField);
        leftPanel.add(firstNameLabel);
        leftPanel.add(firstNameField);
        leftPanel.add(lastNameLabel);
        leftPanel.add(lastNameField);
        leftPanel.add(passOutYearLabel);
        leftPanel.add(passOutYearField);
        leftPanel.add(universityRankLabel);
        leftPanel.add(universityRankField);
        mainLeftPanel.add(leftPanel);

        //buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(3, 30,0));
        buttonPanel.setBorder(new EmptyBorder(5,5,5,5));
        buttonPanel.setBounds(20,250,380,70);

        JButton addButton = new JButton("Add");
        addButton.setFocusable(false);
        JButton editButton = new JButton("Edit");
        editButton.setFocusable(false);
        JButton deleteButton = new JButton("Delete");
        deleteButton.setFocusable(false);

        buttonPanel.add(addButton);
        buttonPanel.add(editButton);
        buttonPanel.add(deleteButton);

        mainLeftPanel.add(buttonPanel);





        //right panel
        JPanel rightPanel = new JPanel();
        rightPanel.setBackground(Color.CYAN);
        rightPanel.setPreferredSize(new Dimension(477,400));
        rightPanel.setLayout(null);




        mainContainer.add(mainLeftPanel);
        mainContainer.add(rightPanel);



    }

    public static void main(String[] args){

        new Registration("jdbc").setVisible(true);

    }
}
