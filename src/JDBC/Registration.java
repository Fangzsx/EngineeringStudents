package JDBC;

import javax.lang.model.util.ElementFilter;
import javax.swing.*;
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
        mainLeftPanel.setLayout(new BoxLayout(mainLeftPanel, BoxLayout.PAGE_AXIS));
        mainLeftPanel.setPreferredSize(new Dimension(477,400));
        JLabel registrationLabel = new JLabel("Registration");
        mainLeftPanel.add(registrationLabel);

        JPanel fillUpForm = new JPanel();
        fillUpForm.setLayout(new BorderLayout());

        JLabel departmentLabel = new JLabel("Department");
        JTextField departmentTF = new JTextField(10);

        JLabel firstNameLabel = new JLabel("First Name");
        JTextField firstNameTF = new JTextField(10);

        JLabel lastNameLabel = new JLabel("Last Name");
        JTextField lastNameTF = new JTextField(10);

        JLabel passOutYearLabel = new JLabel("Pass Out Year");
        JTextField passOutYearTF = new JTextField(5);

        JLabel universityRankLabel = new JLabel("University Rank");
        JTextField universityRankTF = new JTextField(5);

        //add components to fillout form
        fillUpForm.add(departmentLabel);
        fillUpForm.add(departmentTF);
        fillUpForm.add(firstNameLabel);
        fillUpForm.add(firstNameTF);
        fillUpForm.add(lastNameLabel);
        fillUpForm.add(lastNameTF);
        fillUpForm.add(passOutYearLabel);
        fillUpForm.add(passOutYearTF);
        fillUpForm.add(universityRankLabel);
        fillUpForm.add(universityRankTF);

        mainLeftPanel.add(fillUpForm);







        //right panel
        JPanel rightPanel = new JPanel();
        rightPanel.setBackground(Color.CYAN);
        rightPanel.setPreferredSize(new Dimension(477,400));


        mainContainer.add(mainLeftPanel);
        mainContainer.add(rightPanel);



    }

    public static void main(String[] args){

        new Registration("jdbc").setVisible(true);

    }
}
