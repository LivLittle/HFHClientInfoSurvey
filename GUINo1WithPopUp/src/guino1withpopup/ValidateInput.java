/*
 * Harold Pinks, Jorge Pizarro, Frank Cutrera, Olivia Little
 * This file will hold the functions which will check the data in the form,
 * to see if it is valid. These functions are the last check before info is
 * inputed into the data base
 */
package guino1withpopup;

public class ValidateInput {
    
    public static boolean validate(String name) {   //outputs: if name is too long, if name has invalid characters  (first name, last name, street, city)
        return name.matches("^.{1,45}$"); //change to hold only 45 characters
    }
    
    public static boolean validateEmail(String email) {     //outputs: if greater than 45 characters, no @ sign
        return email.matches("^.{1,20}@.{1,15}$"); //double check this 
    }
    
    public static boolean validatePhoneNum(String phoneNum) {   //outputs: if more than 9 characters, if there is invalid characters        //////////good////////////
        return phoneNum.matches("^\\d{10}$");
    }
    
    public static boolean validateState(String state) { //outputs: if more than two character, if two characters are an not a state
        return state.matches("^([A-Za-z]{2})$");
    }
    
    public static boolean validateZip(String zip) { //outputs: if more than max number of characters, if there are characters other than numbers    /////////good////////
        return zip.matches("^\\d{5}$");
    }
    
    public static boolean validateComment(String comment) { //outputs: if greater than 1000 characters.
        return comment.matches("^.{1,1000}$");
    }
}
