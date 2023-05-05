package tictactoe.available_players.presentation.dialogs;

import java.io.IOException;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.stage.StageStyle;
import tictactoe.core.Navigation;
import tictactoe.core.ViewController;
import tictactoe.core.designsystem.resources.ImagesUri;
import tictactoe.core.designsystem.resources.StylesUri;

public class SendRequestDialogViewController extends DialogPane {

    protected final Dialog<String> dialog;
    protected final GridPane gridPane;
    protected final Label label;
    protected final String title;
    protected final ButtonType cancelBtn;
    private Node owner;
    protected final Image loadingGif = new Image(getClass().getResourceAsStream(ImagesUri.loading));

    public SendRequestDialogViewController(Node owner, String player) {
        ImageView imageView = new ImageView(loadingGif);
        imageView.setFitWidth(50);
        imageView.setFitHeight(50);

        dialog = new Dialog<>();
        gridPane = new GridPane();
        label = new Label();
        title = "Sending";
        cancelBtn = new ButtonType("Cancel");

        dialog.setDialogPane(this);
        dialog.initOwner(owner.getScene().getWindow());

        dialog.setTitle(title);
        dialog.initStyle(StageStyle.UNIFIED);

        label.setText("Sending Request to " + player + "\nPlease Wait....");

        gridPane.setAlignment(Pos.CENTER);
        gridPane.add(label, 0, 0);
        gridPane.add(imageView, 1, 0);

        getStylesheets().addAll(this.getClass().getResource(StylesUri.globalStyle).toExternalForm());
        getButtonTypes().addAll(cancelBtn);
        centerButtons(this);
        setContent(gridPane);

    }

    private void centerButtons(DialogPane dialogPane) {
        Region spacer = new Region();
        ButtonBar.setButtonData(spacer, ButtonBar.ButtonData.BIG_GAP);
        HBox.setHgrow(spacer, Priority.ALWAYS);
        dialogPane.applyCss();
        HBox hboxDialogPane = (HBox) dialogPane.lookup(".container");
        hboxDialogPane.getChildren().add(spacer);
    }

    public void show() throws IOException {
        Optional<String> result;
        dialog.showAndWait();
//        if (result.isPresent()) {
//            dialog.close();
//    }
}

public void close() {
        dialog.close();
    }
}
