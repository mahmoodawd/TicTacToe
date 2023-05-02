/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe.core.designsystem;

import java.security.Provider;
import java.security.Provider.Service;
import java.util.List;
import java.util.Map;



public class MenuDialogPassData extends Service {

    private String data;

    public MenuDialogPassData(Provider provider, String type, String algorithm, String className, List<String> aliases, Map<String, String> attributes) {
        super(provider, type, algorithm, className, aliases, attributes);
    }

 
    public String get() {
        return data;
    }

    public void set(String data) {
        this.data = data;
    }
}
