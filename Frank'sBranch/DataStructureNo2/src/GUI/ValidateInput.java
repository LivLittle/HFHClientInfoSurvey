/*
 * Harold Pinks, Jorge Pizarro, Frank Cutrera, Olivia Little
 * This file will hold the functions which will check the data in the form,
 * to see if it is valid. These functions are the last check before info is
 * inputed into the data base
 */
package guino1withpopup;

public class ValidateInput {
    
    public static boolean validate(String name) {   //edits for the following variables: first name, last name, street, city
        return name.matches("^.{1,45}$");           //returns true if the the string has any characters < 45
    }
    
    public static boolean validateEmail(String email) {     
        return email.matches("^.{1,30}@.{1,15}$");  //returns true if <= 30 characters then @ and then <= 15 characers
    }
    
    public static boolean validatePhoneNum(String phoneNum) {  
        return phoneNum.matches("^\\d{10}$");       //returns true if there is exactly 10 digits
    }
    
    public static boolean validateState(String state) { 
        return state.matches("^([A-Za-z]{2})$");    //returns true if there is 2 alpahbetical characters, lower or uppercase
    }
    
    public static boolean validateZip(String zip) { 
        return zip.matches("^\\d{5}$");             //returns true if there is exactly 5 digits
    }
    
    public static boolean validateComment(String comment) { 
        return comment.matches("^.{1,1000}$");      //returns true if there are any characters between 1 and 10000 characters
    }
}
