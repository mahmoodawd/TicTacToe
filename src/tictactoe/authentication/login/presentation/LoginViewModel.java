
package tictactoe.authentication.login.presentation;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import tictactoe.core.Navigation;
import tictactoe.core.Remote;


public class LoginViewModel {

    SimpleStringProperty username = new SimpleStringProperty();
    SimpleStringProperty password = new SimpleStringProperty();
    SimpleStringProperty validation = new SimpleStringProperty();

    Remote remote;

    public LoginViewModel(Remote remote){
        username.set("");
        password.set("");
        this.remote = remote;
    }

    public SimpleStringProperty getValidation() {
        return validation;
    }

    public void setValidation(SimpleStringProperty validation) {
        this.validation = validation;
    }
    
    public SimpleStringProperty getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username.set(username);
    }

    public SimpleStringProperty getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password.set(password);
    }
    boolean isPasswordLengthSufficient(){
        return(password.get().length()>5);
    }
    boolean isUsernameLengthSufficient(){   
        return (username.get().length()>5);
    }
    protected boolean enableLoginBtn(){
        return isPasswordLengthSufficient()&&isUsernameLengthSufficient();
    }
    protected void sendLoginCredentials(){
        remote.sendLoginCridentials(username.get(), password.get());
    }
    protected void validation(){
        remote.getLoginResponse().addListener((observable, oldValue, newValue) -> {
            validation.set(newValue);
        });
    }
    /*protected void validatePassword(){
        remote.getLoginResponse().addListener((observable, oldValue, newValue) -> {
            
            if("Successful".equals(newValue))
                passwordValidation.set(true);
            else
                passwordValidation.set(false);
            
        });
    }*/
}
