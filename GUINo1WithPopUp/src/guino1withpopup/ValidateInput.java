/*
 * Harold Pinks, Jorge Pizarro, Frank Cutrera, Olivia Little
 * This file will hold the functions which will check the data in the form,
 * to see if it is valid. These functions are the last check before info is
 * inputed into the data base
 */
package guino1withpopup;

public class ValidateInput {
    
    public static boolean validateName(String name) {   //outputs: if name is too long, if name has invalid characters
        return name.matches("[{1-45}]"); //change to hold only 45 characters
    }
    
    public static boolean validateEmail(String email) {     //outputs: if greater than 45 characters, no @ sign
        return email.matches("/@[{1-45}]"); //double check this 
    }
    
    public static boolean validatePhoneNum(String phoneNum) {   //outputs: if more than 9 characters, if there is invalid characters
        return phoneNum.matches("[0-9][{10}]+");
    }
    
    public static boolean validateStreet(String street) {   //outputs: if more than 45 characters, if there is invalid characters
        return street.matches("[{1-45}]+");
    }
    
    public static boolean validateCity(String city) {   //outputs: if more than 45 characters, if there is invalid characters
        return city.matches("[{1-45}]+");
    }
    
    public static boolean validateState(String state) { //outputs: if more than two character, if two characters are an not a state
        return state.matches("[A-Z][{2}]+");
    }
    
    public static boolean validateZip(String zip) { //outputs: if more than max number of characters, if there are characters other than numbers
        return zip.matches("[0-9][{9}]+");
    }
    
    public static boolean validateComment(String comment) { //outputs: if greater than 1000 characters.
        return comment.matches("[{1-1000}]+");
    }
}
