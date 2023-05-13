package tictactoe.main_menu.presentation.exit_dialog;

import java.io.IOException;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.StageStyle;
import tictactoe.available_players.presentation.PassDataFromDialogToAvaliablePlayers;
import tictactoe.available_players.presentation.RequestStatus;
import tictactoe.core.Navigation;
import tictactoe.core.ViewController;
import tictactoe.core.designsystem.resources.StylesUri;

public class ExitDialogController extends DialogPane {
    
    protected final Dialog<String> dialog;
    protected final GridPane gridPane;
    protected final Label label;
    protected final String title;
    protected final ButtonType yesBtn;
    protected final ButtonType noBtn;
    protected String senderName = "";
    
    public ExitDialogController() {
        dialog = new Dialog<>();
        gridPane = new GridPane();
        label = new Label();
        title = "Request";
        yesBtn = new ButtonType("Yes");
        noBtn = new ButtonType("No");
        dialog.setTitle(title);
        label.setText("Do You Realy Want To Exit");
        gridPane.add(label, 0, 0);
        dialog.getDialogPane().getButtonTypes().addAll(yesBtn, noBtn);
        
        DialogPane dialogPane = dialog.getDialogPane();
        dialogPane.getStylesheets().addAll(this.getClass().getResource(StylesUri.globalStyle).toExternalForm());
        dialogPane.setContent(gridPane);
        dialog.initStyle(StageStyle.UNIFIED);
        try {
            setButtonActions();
        } catch (IOException ex) {
//            Logger.getLogger(Send.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    private void setButtonActions() throws IOException {
        
        Button acceptButton = (Button) dialog.getDialogPane().lookupButton(yesBtn);
        acceptButton.setOnAction(event -> {
            
            System.exit(0);
        });

        // Override the default behavior of the Close button
        Button denyButton = (Button) dialog.getDialogPane().lookupButton(noBtn);
        denyButton.setOnAction(event -> {
            
            dialog.close();
        });
    }
    
    public void show() {
        dialog.show();
    }
}
