package tictactoe.available_players.presentation.dialogs;

import java.io.IOException;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.StageStyle;
import tictactoe.core.Navigation;
import tictactoe.core.ViewController;
import tictactoe.core.designsystem.resources.StylesUri;

public class ReceivedRequestDialogViewController extends DialogPane {

    protected final Dialog<String> dialog;
    protected final GridPane gridPane;
    protected final Label label;
    protected final String title;
    protected final ButtonType acceptBtn;
    protected final ButtonType denyBtn;

    public ReceivedRequestDialogViewController() {

        dialog = new Dialog<>();
        gridPane = new GridPane();
        label = new Label();
        title = "Request";
        acceptBtn = new ButtonType("Accept");
        denyBtn = new ButtonType("Deny");
        dialog.setTitle(title);
        label.setText("You have Received a request from .......");
        gridPane.add(label, 0, 0);
        dialog.getDialogPane().getButtonTypes().addAll(acceptBtn, denyBtn);

        DialogPane dialogPane = dialog.getDialogPane();
        dialogPane.getStylesheets().addAll(this.getClass().getResource(StylesUri.globalStyle).toExternalForm());
        dialogPane.setContent(gridPane);
        dialog.initStyle(StageStyle.UNIFIED);
        try {
            accept();
        } catch (IOException ex) {
            Logger.getLogger(SendRequestDialogViewController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void accept() throws IOException {
        Optional<String> result;
        result = dialog.showAndWait();
        if (result.isPresent()) { //TODO make accept performed on pressing the accept button only
            Navigation.openPage(ViewController.ONLINEMULTIPLAYERVIEWCONTROLLER, null);
        }

    }
}
