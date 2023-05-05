package tictactoe.available_players.presentation.dialogs;

import javafx.geometry.Pos;
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
import tictactoe.core.designsystem.resources.ImagesUri;
import tictactoe.core.designsystem.resources.StylesUri;

public class RequestDeniedDialogViewController extends DialogPane {

    protected final Dialog<String> dialog;
    protected final GridPane gridPane;
    protected final Label label;
    protected final String title;
    protected final ButtonType tryOntherBtn;
    protected final Image sadIcon = new Image(getClass().getResourceAsStream(ImagesUri.sad));

    public RequestDeniedDialogViewController() {
        ImageView imageView = new ImageView(sadIcon);
        imageView.setFitWidth(50);
        imageView.setFitHeight(50);

        dialog = new Dialog<>();
        gridPane = new GridPane();
        label = new Label();
        title = "Request";
        tryOntherBtn = new ButtonType("Try Another player");
        dialog.setTitle(title);
        label.setText("Request Denied .......");
        gridPane.setAlignment(Pos.CENTER);
        gridPane.add(label, 0, 0);
        gridPane.add(imageView, 1, 0);
        dialog.getDialogPane().getButtonTypes().addAll(tryOntherBtn);

        DialogPane dialogPane = dialog.getDialogPane();
        centerButtons(dialogPane);
        dialogPane.getStylesheets().addAll(this.getClass().getResource(StylesUri.globalStyle).toExternalForm());
        dialogPane.setContent(gridPane);
        dialog.initStyle(StageStyle.UNIFIED);
        

    }
    private void centerButtons(DialogPane dialogPane) {
      Region spacer = new Region();
      ButtonBar.setButtonData(spacer, ButtonBar.ButtonData.BIG_GAP);
      HBox.setHgrow(spacer, Priority.ALWAYS);
      dialogPane.applyCss();
      HBox hboxDialogPane = (HBox) dialogPane.lookup(".container");
      hboxDialogPane.getChildren().add(spacer);
   }
    public void show(){
        dialog.showAndWait();
    }
}
