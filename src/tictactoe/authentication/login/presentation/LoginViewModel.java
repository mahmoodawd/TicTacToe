
package tictactoe.authentication.login.presentation;

import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import tictactoe.core.Navigation;


public class LoginViewModel {

    SimpleStringProperty username = new SimpleStringProperty();
    SimpleStringProperty password = new SimpleStringProperty();
    
    public LoginViewModel(){
        username.set("");
        password.set("");
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
    protected boolean validateUsername(){
        return true;
    }
    protected boolean validatePassword(){
        return true;
    }
}
