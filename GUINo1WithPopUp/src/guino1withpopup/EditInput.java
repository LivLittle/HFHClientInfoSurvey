/*
 * Harold Pinks, Jorge Pizarro, Frank Cutrera, Olivia Little
 * This file will edit some of the user inputs for extraneous 
 */
package guino1withpopup;

public class EditInput {
    
    public static String edit(String name) {    //edit first name, last name, email, street, and city
        name.trim();
        name.substring(0, 45);
        return name;  //takes all characters that arent letters(45) and some punctuation
    }
    
    public static String editPhoneNum(String phoneNum) {
        phoneNum.trim();
        phoneNum.substring(0, 10);
        //take out everything other than numbers
        return phoneNum; 
    }
    
    public static String editState(String state) {
        state.trim();
        state.substring(0, 2);
        return state;  //truncates all letters after the first two and takes off all character which arent letters
    }
    
    public static String editZip(String zip) {
        zip.trim();
        zip.substring(0, 5);
        return "";  //truncates all letters after the max number of zip characters, also takes off all character which arnt numbers
    }
    
    public static String editComment(String comment) {
        comment.trim();
        comment.substring(0, 1000);
        return "";  //truncates all characters after 1000
    }
}
