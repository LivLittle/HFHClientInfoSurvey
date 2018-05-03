/*
 * Harold Pinks, Jorge Pizarro, Frank Cutrera, Olivia Little
 * This file is an example of how the GUI for the Habitat for humanity form will look.
 * This file will not yet connect to the actual database
 */
package guino1withpopup;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;


public class GUINo1WithPopUp extends JFrame {
        
    public static int textFieldArrNum = 9;
    public static int radioButtonArrNum = 8;
    public static int counter = 0;
    
    public static String firstName;
    public static String lastName;
    public static String email;
    public static String phoneNum;
    public static String street;
    public static String city;
    public static String stateInitials;
    public static String zip;
    public static String comment;
        
    public static boolean noEmail;
    public static boolean noPhoneNum;
    public static boolean noAddress;
    public static boolean emailContact;
    public static boolean textContact;
    public static boolean volunteer;
    public static boolean noComment;
    public static boolean quote;
    
    public static JTextField textFields[] = new JTextField[textFieldArrNum];
    public static JRadioButton radioButtons[] = new JRadioButton[radioButtonArrNum];
    
    public static JComponent[] components = {
        new JTextField(20),     //first name
        new JTextField(20),     //last name
        new JTextField(20),     //email
        new JRadioButton(),     //no email
        new JTextField(8),      //phone num
        new JRadioButton(),     //no phone num
        new JTextField(20),     //street
        new JTextField(20),     //city
        new JTextField(3),      //state
        new JTextField(6),      //zip
        new JRadioButton(),     //no address
        new JRadioButton(),     //email contact
        new JRadioButton(),     //text contact
        new JRadioButton(),     //volunteer
        new JTextField(20),     //comment
        new JRadioButton(),     //no comment
        new JRadioButton()      //quote
    };
    
    public static String[] stringLabels = {
        "FirstName:  ",                                             // 1
        "LastName:  ",                                              // 2
        "Email Address:  ",                                         // 3
        "I prefer not to give my email address:  ",                 // 4
        "Phone Number(no dashes)  :  ",                             // 5
        "I prefer not to five my phone number: ",                   // 6
        "Street Name:  ",                                           // 7
        "City:  ",                                                  // 8
        "State(two letters only):  ",                               // 9
        "Zip Code:  ",                                              // 10
        "I prefer not to give my address:  ",                       // 11
        "I want email notifications:  ",                            // 12
        "I want text notifications:  ",                             // 13 
        "I want to be contacted about volunteer information:  ",    // 14
        "What do you like best about ReStore?  ",                   // 15
        "I prefer not to answer:  ",                                // 16
        "I allow this discription to be quoted:  ",                 // 17
    };
    
    public GUINo1WithPopUp() {               
        JFrame frame = new JFrame("Restore Client Survery");
        JComponent labelsAndComps = setDualColumnFormat(stringLabels, components);
        JComponent panelContainer = new JPanel(new BorderLayout(5, 5));
        panelContainer.add(new JLabel("Welcome to Restore! Please fill out this form so we can get in contact with you!", SwingConstants.CENTER), BorderLayout.PAGE_START);
        JButton submit = new JButton("Submit");
        panelContainer.add(submit, BorderLayout.SOUTH);
        panelContainer.add(labelsAndComps, BorderLayout.CENTER);
        
        submit.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) { 
                submit(frame);
//                counter++;
                if(counter > 2) {
                    edit();
                    System.exit(0);
                    //send stuff to the database
                 }
            }
        });
        
        parseComponentArray(components, textFields, radioButtons);
        
        frame.add(panelContainer);
        frame.setSize(1000,450);
        frame.setVisible(true);
                        
        testBasicGUI(frame, textFields, radioButtons);
    }
    
    public static JComponent setDualColumnFormat(String[] stringLabels, JComponent[] components) {
        JComponent panel = new JPanel();
        GroupLayout groupLayout = new GroupLayout(panel);
        panel.setLayout(groupLayout);
        groupLayout.setAutoCreateContainerGaps(true);
        JLabel[] labels = new JLabel[stringLabels.length];
        
        for(int i = 0; i < labels.length; i++) {
            labels[i] = new JLabel(stringLabels[i]);
        }
        
        GroupLayout.SequentialGroup row = groupLayout.createSequentialGroup();
        GroupLayout.Group labelColumn = groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING);
        row.addGroup(labelColumn);
        
        GroupLayout.Group componentColumn = groupLayout.createParallelGroup();
        row.addGroup(componentColumn);
        
        groupLayout.setHorizontalGroup(row);
        
        GroupLayout.SequentialGroup labelAndCompColumn = groupLayout.createSequentialGroup();
        groupLayout.setVerticalGroup(labelAndCompColumn);
        
        int preferredSize = GroupLayout.PREFERRED_SIZE;
        
        for(JLabel label : labels) {
            labelColumn.addComponent(label);
        }
        
        for(Component component : components) {
            componentColumn.addComponent(component, preferredSize, preferredSize, preferredSize);
        }
        
        for(int i = 0; i < labels.length; i++) {
            labelAndCompColumn.addGroup(groupLayout.createParallelGroup()
                    .addComponent(labels[i])
                    .addComponent(components[i], preferredSize, preferredSize, preferredSize));
        }
        return panel;
    }
    
    private static void parseComponentArray(JComponent[] components, JTextField[] textFields, JRadioButton[] radioButtons) {
        int lastRadioElementPosition = -1;
        int lastTextElementPosition = -1;
        
        for (int i=0; i < components.length; i++) {
            if(components[i] instanceof JRadioButton) {
                radioButtons[lastRadioElementPosition + 1] = (JRadioButton)components[i];
                lastRadioElementPosition ++;
            }
            if(components[i] instanceof JTextField) {
                textFields[lastTextElementPosition + 1] = (JTextField)components[i];
                lastTextElementPosition ++;
            }
        }    
    }
    
    private static void testBasicGUI(JFrame frame, JTextField[] textFields, JRadioButton[] radioButtons) {
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                for (JTextField textField : textFields) {
                    if(textField.getText().equals(""))
                        System.out.println("No text");
                    else System.out.println(textField.getText());
                }
                
                for(JRadioButton radioButton : radioButtons) {
                    if (radioButton.isSelected() ==  true) {
                        System.out.println("true");
                    }
                    else if (radioButton.isSelected() == false) {
                        System.out.println("false");
                    }
                    else {
                        System.out.println("borked");
                    }
                }
                
                if (ValidateInput.validateState(textFields[6].getText()) == true) {
                System.out.println("regular expression phone: true");
                }
                else {
                    System.out.println("regular expression phone: false");
                }
                
                System.exit(0);
            }
        });
    }
    
    private static void submit(JFrame frame) {
        int popUpAnswer = JOptionPane.showConfirmDialog(null, "Are you sure you want to submit?", "Continue?", 0);
        if (popUpAnswer == JOptionPane.YES_OPTION){
            getInfo(textFields, radioButtons);
            validate(frame);
        }
    }
    
    private static void getInfo(JTextField[] textFields, JRadioButton[] radioButtons) {
        firstName = textFields[0].getText();                                   
        lastName  = textFields[1].getText();
        email = textFields[2].getText();
        phoneNum = textFields[3].getText();
        street = textFields[4].getText();
        city = textFields[5].getText();
        stateInitials = textFields[6].getText();
        zip = textFields[7].getText();
        comment = textFields[8].getText();        
        
        noEmail = radioButtons[0].isSelected();
        noPhoneNum = radioButtons[1].isSelected();
        noAddress = radioButtons[2].isSelected();
        emailContact = radioButtons[3].isSelected();
        textContact = radioButtons[4].isSelected();
        volunteer = radioButtons[5].isSelected();
        noComment = radioButtons[6].isSelected();
        quote = radioButtons[7].isSelected();
    }
    
    private static void edit() {      
        EditInput.edit(firstName);
        EditInput.edit(lastName);
        EditInput.edit(email);
        EditInput.editPhoneNum(phoneNum);
        EditInput.edit(street);
        EditInput.edit(city);
        EditInput.editState(stateInitials);
        EditInput.editZip(zip);
        EditInput.editComment(comment);
    }
    
    private static void validate(JFrame frame) {
        String message = "";
        
        if(ValidateInput.validate(firstName) == false)
            message += "First name exceeds character limit.\n";
        
        if(ValidateInput.validate(lastName) == false) 
            message += "Last name exceeds character limit.\n";
        
        if(ValidateInput.validateEmail(email) == false && noEmail == false) 
            message += "Email exceeds character limit or does not contain '@'.\n";
        
        if(ValidateInput.validatePhoneNum(phoneNum) == false && noPhoneNum == false) 
            message += "Phone number exceeds more than 10 digits or contians symbols.\n";
        
        if(ValidateInput.validate(city) == false && noAddress == false) 
            message += "City name exceeds character limit.\n";
        
        if(ValidateInput.validate(street) == false && noAddress == false) 
            message += "Street name exceeds character limit.\n";
        
        if(ValidateInput.validateState(stateInitials) == false && noAddress == false) 
            message += "State exceeds the character limit of 2.\n";
        
        if(ValidateInput.validateZip(zip) == false && noAddress == false) 
            message += "Zip code exceeds more than 5 digits.\n";
        
        if(ValidateInput.validateComment(comment) == false && noComment == false) 
            message += "Your comment on Restore exceeds character limit.\n";
        
        if(message != "") {
            JOptionPane.showMessageDialog(frame, message);
            counter++;
        }
    }
    
    public static void main(String[] args) {
        new GUINo1WithPopUp();          
    }
}
