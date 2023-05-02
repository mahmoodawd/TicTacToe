package tictactoe.available_players.presentation.dialogs;

import javafx.geometry.Pos;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.StageStyle;
import tictactoe.core.designsystem.resources.ImagesUri;
import tictactoe.core.designsystem.resources.StylesUri;

public class SendRequestDialogViewController extends DialogPane {

    protected final Dialog<String> dialog;
    protected final GridPane gridPane;
    protected final Label label;
    protected final String title;
    protected final ButtonType okBtn;
    protected final Image loadingGif = new Image(getClass().getResourceAsStream(ImagesUri.loading));

    public SendRequestDialogViewController() {
        ImageView imageView = new ImageView(loadingGif);
        imageView.setFitWidth(50);
        imageView.setFitHeight(50);

        dialog = new Dialog<>();
        gridPane = new GridPane();
        label = new Label();
        title = "Sending";
        okBtn = new ButtonType("OK");
        dialog.setTitle(title);
        label.setText("Sending Request to .......");
        gridPane.setAlignment(Pos.CENTER);
        gridPane.add(label, 0, 0);
        gridPane.add(imageView, 1, 0);
        dialog.getDialogPane().getButtonTypes().addAll(okBtn);

        DialogPane dialogPane = dialog.getDialogPane();
        dialogPane.getStylesheets().addAll(this.getClass().getResource(StylesUri.globalStyle).toExternalForm());
        dialogPane.setContent(gridPane);
        dialog.initStyle(StageStyle.UNIFIED);
        dialog.showAndWait();

    }
}
