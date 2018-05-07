/*
 * Harold Pinks, Jorge Pizarro, Frank Cutrera, Olivia Little
 * This file will edit some of the user inputs for extraneous 
 */
package gui;

public class EditInput {
    
    public static String edit(String name) {    //edit first name, last name, email, street, and city
        name = name.trim();
        
        if (name.length() > 45) {
            name = name.substring(0, 45);
        }
        return name;  //takes all characters that arent letters(45) and some punctuation
    }
    
    public static String editPhoneNum(String phoneNum) {
        phoneNum = phoneNum.trim();
        
        if(phoneNum.length() > 10) {
            phoneNum = phoneNum.substring(0, 10);
        }                                            //take out everything other than numbers/////////////////////////////
        return phoneNum; 
    }
    
    public static String editState(String state) {
        state = state.trim();
        
        if(state.length() > 2) {
            state = state.substring(0, 2);
        }
        return state;  //truncates all letters after the first two and takes off all character which arent letters
    }
    
    public static String editZip(String zip) {
        zip = zip.trim();
        
        if(zip.length() > 5) {
            zip = zip.substring(0, 5);
        }
        return zip;  //truncates all letters after the max number of zip characters, also takes off all character which arnt numbers
    }
    
    public static String editComment(String comment) {
        comment = comment.trim();
        
        if(comment.length() > 1000) {
            comment = comment.substring(0, 1000);
        }
        return comment;  //truncates all characters after 1000
    }
}
