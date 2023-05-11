package tictactoe.main_menu.presentation.exit_dialog;

import java.io.IOException;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.stage.StageStyle;
import tictactoe.available_players.presentation.dialogs.SendRequestDialogViewController;
import tictactoe.core.Navigation;
import tictactoe.core.ViewController;
import tictactoe.core.designsystem.ColorPalette;
import tictactoe.core.designsystem.resources.StylesUri;

//public class ExitDialogController extends GridPane {
//
//    protected final ColumnConstraints columnConstraints;
//    protected final ColumnConstraints columnConstraints0;
//    protected final RowConstraints rowConstraints;
//    protected final RowConstraints rowConstraints0;
//    protected final Label label;
//    protected final GridPane gridPane;
//    protected final ColumnConstraints columnConstraints1;
//    protected final ColumnConstraints columnConstraints2;
//    protected final RowConstraints rowConstraints1;
//    protected final Button yesBtn;
//    protected final Button noBtn;
//
//    public ExitDialogController() {
//
//        columnConstraints = new ColumnConstraints();
//        columnConstraints0 = new ColumnConstraints();
//        rowConstraints = new RowConstraints();
//        rowConstraints0 = new RowConstraints();
//        label = new Label();
//        gridPane = new GridPane();
//        columnConstraints1 = new ColumnConstraints();
//        columnConstraints2 = new ColumnConstraints();
//        rowConstraints1 = new RowConstraints();
//        yesBtn = new Button();
//        noBtn = new Button();
//
//        setMaxHeight(USE_PREF_SIZE);
//        setMaxWidth(USE_PREF_SIZE);
//        setMinHeight(USE_PREF_SIZE);
//        setMinWidth(USE_PREF_SIZE);
//        setPrefHeight(200.0);
//        setPrefWidth(280.0);
//
//        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
//        columnConstraints.setMaxWidth(316.0);
//        columnConstraints.setMinWidth(10.0);
//        columnConstraints.setPrefWidth(316.0);
//
//        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
//        columnConstraints0.setMaxWidth(319.0);
//        columnConstraints0.setMinWidth(0.0);
//        columnConstraints0.setPrefWidth(0.0);
//
//        rowConstraints.setMaxHeight(190.0);
//        rowConstraints.setMinHeight(10.0);
//        rowConstraints.setPrefHeight(43.0);
//        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);
//
//        rowConstraints0.setMaxHeight(302.0);
//        rowConstraints0.setMinHeight(10.0);
//        rowConstraints0.setPrefHeight(116.0);
//        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);
//
//        GridPane.setHalignment(label, javafx.geometry.HPos.CENTER);
//        label.setPrefHeight(17.0);
//        label.setPrefWidth(207.0);
//        label.setText("Are You Sure You Want To Exit?");
//
//        GridPane.setHalignment(gridPane, javafx.geometry.HPos.CENTER);
//        GridPane.setRowIndex(gridPane, 1);
//        gridPane.setPrefHeight(50);
//        gridPane.setPrefWidth(50);
//
//        columnConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
//        columnConstraints1.setMaxWidth(153.0);
//        columnConstraints1.setMinWidth(10.0);
//        columnConstraints1.setPrefWidth(153.0);
//
//        columnConstraints2.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
//        columnConstraints2.setMaxWidth(170.0);
//        columnConstraints2.setMinWidth(10.0);
//        columnConstraints2.setPrefWidth(163.0);
//
//        rowConstraints1.setMinHeight(10.0);
//        rowConstraints1.setPrefHeight(30.0);
//        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);
//
//        GridPane.setHalignment(yesBtn, javafx.geometry.HPos.CENTER);
//        yesBtn.setMnemonicParsing(false);
//        yesBtn.setText("Yes");
//
//        GridPane.setColumnIndex(noBtn, 1);
//        GridPane.setHalignment(noBtn, javafx.geometry.HPos.CENTER);
//        noBtn.setMnemonicParsing(false);
//        noBtn.setText("No");
//        GridPane.setMargin(gridPane, new Insets(10.0, 90.0, 10.0, 50.0));
//        gridPane.setPadding(new Insets(10.0, 0.0, 0.0, 0.0));
//
//        getColumnConstraints().add(columnConstraints);
//        getColumnConstraints().add(columnConstraints0);
//        getRowConstraints().add(rowConstraints);
//        getRowConstraints().add(rowConstraints0);
//        getChildren().add(label);
//        gridPane.getColumnConstraints().add(columnConstraints1);
//        gridPane.getColumnConstraints().add(columnConstraints2);
//        gridPane.getRowConstraints().add(rowConstraints1);
//        gridPane.getChildren().add(yesBtn);
//        gridPane.getChildren().add(noBtn);
//        getChildren().add(gridPane);
//       // gridPane.setStyle("-fx-background-color: ;");
//        label.setStyle("-fx-font-weight: bold;");
//
//   
//      //  ExitDialogController dialog = new ExitDialogController();
////dialog.setStyle("-fx-background-color: red;");
//String lightRed= ColorPalette.lightRed;
//yesBtn.setStyle("-fx-text-fill: white; " +
//                "-fx-font-weight: bold; " +
//                "-fx-background-color:" + lightRed + "; " +
//                "-fx-background-radius: 30px;");
//      
//   
//noBtn.setStyle("-fx-text-fill: white; " +
//                "-fx-font-weight: bold; " +
//                "-fx-background-color:" + lightRed + "; " +
//                "-fx-background-radius: 30px;");     
//
//
//        yesBtn.setOnAction(event -> {
//            // Exit the application
//            System.exit(0);
//        });
//
//        noBtn.setOnAction(event -> {
//            // Hide the dialog
//            getScene().getWindow().hide();
//        });
//    }
//} ////////////////////////exxxxxxxxxxxxxxxxxxxxxxx



public class ExitDialogController extends GridPane {
    protected final Dialog<String> dialog;
    protected final GridPane gridPane;
    protected final Label label;
    protected final String title;
    protected final ButtonType yesBtn;
    protected final ButtonType noBtn;

    public ExitDialogController () {

        dialog = new Dialog<>();
        gridPane = new GridPane();
        label = new Label();
        title = "Request";
        yesBtn = new ButtonType("Yes");
        noBtn = new ButtonType("No");
        dialog.setTitle(title);
        label.setText("Are you  Sure You Want To Exit?");
        gridPane.add(label, 0, 0);
        dialog.getDialogPane().getButtonTypes().addAll(yesBtn, noBtn);

        DialogPane dialogPane = dialog.getDialogPane();
        dialogPane.getStylesheets().addAll(this.getClass().getResource(StylesUri.globalStyle).toExternalForm());
        dialogPane.setContent(gridPane);
        dialog.initStyle(StageStyle.UNIFIED);
        try {
            action();
        } catch (IOException ex) {
            Logger.getLogger(SendRequestDialogViewController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void action() throws IOException {
        Optional<String> result;
        result = dialog.showAndWait();
        if (result.isPresent()&&result.get().equals(yesBtn.getText())) { //TODO make accept performed on pressing the accept button only
            System.exit(0);
        }
        dialog.close();

    }
}
