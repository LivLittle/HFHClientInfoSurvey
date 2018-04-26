/*
 * Harold Pinks, Jorge Pizarro, Frank Cutrera, Olivia Little
 * This file will edit some of the user inputs for extraneous 
 */
package guino1withpopup;

public class EditInput {
    
    public static String edit(String name) {    //first name, last name, street, and city
        return "";  //takes all characters that arent letters(45) and some punctuation out of the names
    }
    
    public static String editEmail(String email) {
        return "";  //truncates all characters after 45 characters
    }
    
    public static String editPhoneNum(String phoneNum) {
        return "";  //takes out all character which are not numbers(10)
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
