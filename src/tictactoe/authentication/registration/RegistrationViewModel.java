/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe.authentication.registration;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author omar_
 */
public class RegistrationViewModel {
     String sufficientLengthMsg="";
     String contatinsUpperCaseMsg="";
     String contatinsLowerCaseMsg="";
     String containsSpecialCharacterMsg="";
     String passwordMatchesMsg="";
     StringBuilder validatePasswordMsg=new StringBuilder();
     SimpleStringProperty password = new SimpleStringProperty();
     SimpleStringProperty confirmPassword = new SimpleStringProperty("");

    public String getValidatePasswordMsg() {
        return validatePasswordMsg.toString();
    }

    public void setValidatePasswordMsg(String validatePasswordMsg) {
        this.validatePasswordMsg.append(validatePasswordMsg);
    }
    
    public SimpleStringProperty getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password.set(password);
    }

    public SimpleStringProperty getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword.set(confirmPassword);
    }
    public boolean isLengthEqual(){
        return confirmPassword.get().length() == password.get().length();
    }
     
    protected  boolean sufficientLength(){
        if (password.get().length()>5){
            sufficientLengthMsg="";
            return true;
        }
        else
            sufficientLengthMsg = "Password must be at least 6 characters";
        return false;
    }
    protected  boolean contatinsUpperCase(){
        for(int i=0; i<password.get().length(); i++){
          if(Character.isUpperCase(password.get().charAt(i))){
            contatinsUpperCaseMsg="";
            return true;
          }
        }
        contatinsUpperCaseMsg = "Password must contain at least 1 Upper Case letter";
        return false;
    }
    protected  boolean contatinsLowerCase(){
        for(int i=0; i<password.get().length(); i++){
            if(Character.isUpperCase(password.get().charAt(i))){
                contatinsLowerCaseMsg="";
                return true;
            }
        }
        contatinsLowerCaseMsg = "Password must contatin at least 1 lower case letter";
        return false;
    }
    public  boolean containsSpecialCharacter() {
        String pattern = "[!@#$%^&*()_+=\\[\\]{};':\"\\\\|,.<>\\/?]";
        for (int i = 0; i < password.get().length(); i++) {
            if (String.valueOf(password.get().charAt(i)).matches(pattern)){
                containsSpecialCharacterMsg="";
                return true;
            }
        }
        containsSpecialCharacterMsg = "Password must contain at least 1 special character";
        return false;
    }
    public boolean doesPasswordMatch(){
        return(confirmPassword.equals(password));
    }
    public boolean validatePassword(){
        sufficientLength();
        contatinsUpperCase();
        contatinsLowerCase();
        containsSpecialCharacter();
        doesPasswordMatch();
        if(!sufficientLengthMsg.isEmpty()){
            validatePasswordMsg.append(sufficientLengthMsg);
            validatePasswordMsg.append(System.lineSeparator());
        }
        if(!contatinsUpperCaseMsg.isEmpty()){
            validatePasswordMsg.append(contatinsUpperCaseMsg);
            validatePasswordMsg.append(System.lineSeparator());
        }
        if(!contatinsLowerCaseMsg.isEmpty()){
            validatePasswordMsg.append(contatinsLowerCaseMsg);
            validatePasswordMsg.append(System.lineSeparator());
        }
        if(!containsSpecialCharacterMsg.isEmpty()){
            validatePasswordMsg.append(containsSpecialCharacterMsg);
        }
        if(sufficientLength() && contatinsUpperCase() && contatinsLowerCase() && containsSpecialCharacter())
            return true;
        return false;
    }
    
}
