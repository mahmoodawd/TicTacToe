/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe.authentication.registration.presentation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import tictactoe.core.Remote;

/**
 *
 * @author omar_
 */
public class RegistrationViewModel {
     String contatinsUpperCaseMsg="";
     String contatinsLowerCaseMsg="";
     String containsSpecialCharacterMsg="";
     String passwordMatchesMsg="";
     String containsNumberMsg="";
     StringBuilder validatePasswordMsg=new StringBuilder();
     SimpleStringProperty password = new SimpleStringProperty();
     SimpleStringProperty confirmPassword = new SimpleStringProperty();
     SimpleStringProperty username = new SimpleStringProperty();

     SimpleBooleanProperty validation = new SimpleBooleanProperty();
     Remote remote;
     
    public RegistrationViewModel(Remote remote){
        password.set("");
        confirmPassword.set("");
        username.set("");
        this.remote = remote;
        isUsernameAvailable();
        
    }
    public SimpleBooleanProperty getValidation() {
        return validation;
    }

    public void setValidation(SimpleBooleanProperty validation) {
        this.validation = validation;
    }

    public SimpleStringProperty getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username.set(username);
    }

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
    boolean isLengthEqual(){
        return confirmPassword.get().length() == password.get().length();
    }
      
    boolean isPasswordLengthSufficient(){
        return(password.get().length()>5);
    }
    protected boolean containsNumber(){
        boolean result = false;
        Pattern pattern = Pattern.compile(".*\\d.*");
        Matcher matcher = pattern.matcher(password.get());
        if(matcher.find()){
            containsNumberMsg = "";
            result = true;
        }
        else
            containsNumberMsg = "Password must contain at least 1 number !";
        return result;
    }
    /*boolean containsNumber(){
        boolean result = false;
        char[] chars = password.get().toCharArray();
        for(char c: chars){
            if(Character.isDigit(c)){
                containsNumberMsg = "";
                result = true;
                break;
            }
            else
                containsNumberMsg = "Password must contain at least 1 number !";
        }
        return result;
    }*/
    boolean contatinsUpperCase(){
        boolean result = false;
        for(int i=0; i<password.get().length(); i++){
          if(Character.isUpperCase(password.get().charAt(i))){
            contatinsUpperCaseMsg="";
            result = true;
            break;
          }
          else
            contatinsUpperCaseMsg = "Password must contain at least 1 Upper Case letter";
        }
        return result;
    }
    boolean contatinsLowerCase(){
        boolean result = false;
        for(int i=0; i<password.get().length(); i++){
            if(Character.isLowerCase(password.get().charAt(i))){
                contatinsLowerCaseMsg="";
                result = true;
                break;
            }
            else
                contatinsLowerCaseMsg = "Password must contain at least 1 lower case letter";
        }
        return result;
    }
    boolean containsSpecialCharacter() {
        boolean result = false;
        String pattern = "[!@#$%^&*()_+=\\[\\]{};':\"\\\\|,.<>\\/?]";
        for (int i = 0; i < password.get().length(); i++) {
            if (String.valueOf(password.get().charAt(i)).matches(pattern)){
                containsSpecialCharacterMsg="";
                result = true;
                break;
            }
            else
                containsSpecialCharacterMsg = "Password must contain at least 1 special character";
        }
        return result;
    }
    protected boolean doesPasswordMatch(){
        return(confirmPassword.get().equals(password.get()));
    }
    void concatinateValidatePasswordMsg(){
        if(!containsNumberMsg.isEmpty()){
            validatePasswordMsg.append(containsNumberMsg);
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
    }
    protected boolean validatePassword(){
        validatePasswordMsg.setLength(0);
        containsNumber();
        contatinsUpperCase();
        contatinsLowerCase();
        containsSpecialCharacter();
        doesPasswordMatch();
        concatinateValidatePasswordMsg();
        return isPasswordLengthSufficient()&& contatinsUpperCase() && contatinsLowerCase() && containsSpecialCharacter() && containsNumber();
    }
    protected boolean enableRegisterBtn(){
        return isLengthEqual()&&!username.get().isEmpty()&&!password.get().isEmpty()&&!confirmPassword.get().isEmpty()&&isUsernameLengthSufficient()
            &&isPasswordLengthSufficient();
    }
    boolean isUsernameLengthSufficient(){   
        return (username.get().length()>5);
    }
    protected boolean validateUsername(){
        boolean result = false;
        if(result==false)
            result=true;
        return result;
    }
    private void isUsernameAvailable(){
        
        remote.getRegistrationResponse().addListener((observable, oldValue, newValue) -> {
            
            if("Register Successful".equals(newValue))
                validation.set(true);
            else
                validation.set(false);
            
        });
    }
    protected void sendRegisterCredentials(){
        remote.sendRegistrationCridentials(username.get(), password.get());
    }
}
