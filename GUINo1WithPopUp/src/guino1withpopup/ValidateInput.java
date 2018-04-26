/*
 * Harold Pinks, Jorge Pizarro, Frank Cutrera, Olivia Little
 * This file will hold the functions which will check the data in the form,
 * to see if it is valid. There will also be functions to edit the inputed data
 * before it is checked by the validation functions
 */
package guino1withpopup;

public class ValidateInput {
    
    public static boolean validateName(String name) {
        return name.matches("[A-Z][a-z]+"); //change to hold only 45 characters
    }
    
    public static boolean validateEmail(String email) {
        return email.matches("");
    }
    
    public static boolean validatePhoneNum(String phoneNum) {
        return phoneNum.matches("");
    }
    
    public static boolean validateStreet(String street) {
        return street.matches("");
    }
    
    public static boolean validateCity(String city) {
        return city.matches("");
    }
    
    public static boolean validateState(String state) {
        return state.matches("");
    }
    
    public static boolean validateZip(String zip) {
        return zip.matches("");
    }
    
    public static boolean validateComment(String comment) {
        return comment.matches("");
    }
}
