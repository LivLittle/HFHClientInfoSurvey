/*
 * Harold Pinks, Jorge Pizarro, Frank Cutrera, Olivia Little
 * This file will edit some of the user inputs for extraneous 
 */
package guino1withpopup;

public class EditInput {
    
    public static String edit(String name) {    //first name, last name, street, and city
        name.trim();
        name.substring(0, 45);
        return name;  //takes all characters that arent letters(45) and some punctuation
    }
    
    public static String editPhoneNum(String phoneNum) {
        phoneNum.trim();
        phoneNum.substring(0, 10);
//        phoneNum.
        return phoneNum; 
    }
    
    public static String editState(String state) {
        return "";  //truncates all letters after the first two and takes off all character which arent letters
    }
    
    public static String editZip(String zip) {
        return "";  //truncates all letters after the max number of zip characters, also takes off all character which arnt numbers
    }
    
    public static String editComment(String comment) {
        return "";  //truncates all characters after 1000
    }
}
