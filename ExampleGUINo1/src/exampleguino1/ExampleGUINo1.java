/*
 * Harold Pinks, Jorge Pizarro, Frank Cutrera, Olivia Little
 * This file is an example of how the GUI for the Habitat for humanity form will look.
 * This file will not yet connect to the actual database
 */
package exampleguino1;

import java.awt.FlowLayout;
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


public class ExampleGUINo1 extends JFrame {
    
    private final ActionButtonHandler actionHandler;  //this action handler is used for ALL the buttons
    private JFrame frame;
    private Container container;
    private JPanel panel;
    private JTextField firstName, lastName, email, phoneNum1,phoneNum2, phoneNum3, street, city, state, zip, quote;
    private JRadioButton disregardEmail, disregardPhoneNum, disregardAddress, emailOption, textOption, volunteerOption, disregardQuote, quoteYesOption, quoteNoOption;
    
    public ExampleGUINo1() {
        frame = new JFrame("Contact Information");
        actionHandler = new ActionButtonHandler();  //Creates the action handler for the action handler 
        FlowLayout flowLayout = new FlowLayout(FlowLayout.CENTER);
        panel = new JPanel();
        
        panel.setLayout(flowLayout);
        container = frame.getContentPane();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //Program closes when user hits close
        frame.setSize(400, 600);
        frame.setResizable(false);
        
        firstName = new JTextField("First Name: ");
        lastName = new JTextField("Last Name: ");
        email = new JTextField("Email: ");
        phoneNum1 = new JTextField("Phone Number: ");
        phoneNum2 = new JTextField("-");
        phoneNum3 = new JTextField("-");
        street = new JTextField("Street Name: ");
        city = new JTextField("City Name: ");
        state = new JTextField("State: ");
        zip = new JTextField("Zip: ");
        quote = new JTextField("What do you like best about ReStore?");
        
        disregardEmail = new JRadioButton("Prefer not to answer");
        disregardPhoneNum = new JRadioButton("Prefer not to answer");
        disregardAddress = new JRadioButton("Prefer not to answer");
        emailOption = new JRadioButton("I want email notifications about Restore");
        textOption = new JRadioButton("I want text notifications about Restore");
        volunteerOption = new JRadioButton("Would you like to be contacted specifically about volunteer information");
        disregardQuote = new JRadioButton("Prefer not to answer");
        quoteYesOption = new JRadioButton("Yes");
        quoteNoOption = new JRadioButton("No");              
                
    }
    
    private class ActionButtonHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            
        }
    }
    public static void main(String[] args) {
        new ExampleGUINo1();           //creates a new instantiation of calculator
    }
}
