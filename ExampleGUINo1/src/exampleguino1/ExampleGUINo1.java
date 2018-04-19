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
    
//    private final ActionButtonHandler actionHandler;  //this action handler is used for ALL the buttons
//    private JFrame frame;
//    private Container container;
//    private JPanel panel;
//    private Dimension d1, d2, d3, d4, d5;
//    private JTextField firstName, lastName, email, phoneNum1,phoneNum2, phoneNum3, street, city, state, zip, quote;
//    private JRadioButton disregardEmail, disregardPhoneNum, disregardAddress, emailOption, textOption, volunteerOption, disregardQuote, quoteYesOption, quoteNoOption;
    
    static JComponent[] components = {
        new JTextField(15),
        new JTextField(15),
        new JTextField(15),
        new JRadioButton(),
        new JTextField(10),
        new JRadioButton(),
        new JTextField(),
        new JTextField(),
        new JTextField(),
        new JTextField(),
        new JRadioButton(),
        new JRadioButton(),
        new JRadioButton(),
        new JRadioButton(),
        new JTextField(),
        new JRadioButton(),
        new JRadioButton()
    };
    
    static String[] stringLabels = {
        "FirstName: ",
        "LastName: ",
        "Email Address: ",
        "Phone Number(no dashes): ",
        "I prefer not to give my email address: ",
        "Street Name: ",
        "City: ",
        "State: ",
        "Zip Code: ",
        "I prefer not to give my address: ", 
        "I want email notifications: ",
        "I want text notifications: ",
        "I want to be contacted about volunteer information: ",
        "What do you like best about ReStore?",
        "I prefer not to answer",
        "I allow this discription to be quoted:",
        "I do not allow this discription to be quoted:",
    };
    
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
    
    /*public ExampleGUINo1() {
        frame = new JFrame("Contact Information");
        actionHandler = new ActionButtonHandler();  //Creates the action handler for the action handler 
        FlowLayout flowLayout = new FlowLayout(FlowLayout.CENTER);
        container = frame.getContentPane();
        panel = new JPanel();
        
        panel.setLayout(flowLayout);
        container.setLayout(flowLayout);
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
        
        d1 = new Dimension(300, 300);
        d2 = new Dimension(100, 50);
        d3 = new Dimension();
        d4 = new Dimension();
        d5 = new Dimension();
       
        panel.setPreferredSize(d1);
        
        firstName.setPreferredSize(d2);
        
        panel.add(firstName , lastName, email, disregardEmail, phoneNum1, phoneNum2, phoneNum3,
                disregardPhoneNum, street, city, state, zip, disregardAddress, emailOption,
                textOption, volunteerOption, quote, disregardQuote, quoteYesOption);
        
        firstName.setEditable(true);
        
        container.add(panel);
        frame.setVisible(true);
    }
*/
    
    private class ActionButtonHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            
        }
    }
    public static void main(String[] args) {
//        new ExampleGUINo1();           //creates a new instantiation of calculator
        JComponent labelsAndComps = setDualColumnFormat(stringLabels, components);
        JComponent panelContainer = new JPanel(new BorderLayout(5, 5));
        panelContainer.add(new JLabel("Purchase Form", SwingConstants.CENTER), BorderLayout.PAGE_START);
        panelContainer.add(labelsAndComps, BorderLayout.CENTER);
        
        JOptionPane.showMessageDialog(null, labelsAndComps);
    }
}
