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
    
    private ActionComponentHandler actionHandler;
    
    static JComponent[] components = {
        new JTextField(20),
        new JTextField(20),
        new JTextField(20),
        new JTextField(10),
        new JRadioButton(),
        new JRadioButton(),
        new JTextField(20),
        new JTextField(20),
        new JTextField(5),
        new JTextField(10),
        new JRadioButton(),
        new JRadioButton(),
        new JRadioButton(),
        new JTextField(20),
        new JRadioButton(),
        new JRadioButton(),
        new JRadioButton()
    };
    
    static String[] stringLabels = {
        "FirstName:  ",
        "LastName:  ",
        "Email Address:  ",
        "Phone Number(no dashes):  ",
        "I prefer not to give my email address:  ",
        "Street Name:  ",
        "City:  ",
        "State:  ",
        "Zip Code:  ",
        "I prefer not to give my address:  ", 
        "I want email notifications:  ",
        "I want text notifications:  ",
        "I want to be contacted about volunteer information:  ",
        "What do you like best about ReStore?  ",
        "I prefer not to answer:  ",
        "I allow this discription to be quoted:  ",
        "I do not allow this discription to be quoted:  ",
    };
    
    public ExampleGUINo1() {
        JComponent labelsAndComps = setDualColumnFormat(stringLabels, components);
        JComponent panelContainer = new JPanel(new BorderLayout(5, 5));
        panelContainer.add(new JLabel("Purchase Form", SwingConstants.CENTER), BorderLayout.PAGE_START);
        panelContainer.add(labelsAndComps, BorderLayout.CENTER);
        
        actionHandler = new ActionComponentHandler();
        
        testBasicGUI();
        
        JOptionPane.showMessageDialog(null, labelsAndComps);
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
    
    private static void testBasicGUI() {
        
//        for(Component component : components) {
//            System.out.print(component.getAccessibleContext());
//        }
    }
    
//    private static boolean validateEmail() {
//        
//    }
//    
//    private static int editPhoneNum() {
//        
//    }
//    
//    private static boolean validatePhoneNum() {
//        
//    }
//    
//    private static boolean validateAddress() {
//        
//    }
//    
//    private static String editState() {
//        
//    }
//    
//    private static boolean validateState() {
//        
//    }  
    
    private class ActionComponentHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            
        }
    }
    public static void main(String[] args) {
        new ExampleGUINo1();           //creates a new instantiation of calculator
    }
}
