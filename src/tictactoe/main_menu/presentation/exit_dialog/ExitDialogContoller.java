package tictactoe.main_menu.presentation.exit_dialog;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Font;

public class ExitDialogContoller extends BorderPane {

    protected final Label textDialog;
    protected final GridPane gridPane;
    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final RowConstraints rowConstraints;
    protected final Button YesBtn;
    protected final Button NoBtn;

    public ExitDialogContoller() {

        textDialog = new Label();
        gridPane = new GridPane();
        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        YesBtn = new Button();
        NoBtn = new Button();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0);
        setPrefWidth(400.0);

        BorderPane.setAlignment(textDialog, javafx.geometry.Pos.CENTER_LEFT);
        textDialog.setPrefHeight(97.0);
        textDialog.setPrefWidth(294.0);
        textDialog.setText("              Are You sure You Want to Exit?");
        textDialog.setFont(new Font(13.0));
        setTop(textDialog);

        BorderPane.setAlignment(gridPane, javafx.geometry.Pos.CENTER);
        gridPane.setPrefHeight(262.0);
        gridPane.setPrefWidth(600.0);

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMaxWidth(314.0);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(58.0);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMaxWidth(369.0);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(142.0);

        rowConstraints.setMinHeight(10.0);
        rowConstraints.setPrefHeight(30.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setHalignment(YesBtn, javafx.geometry.HPos.LEFT);
        YesBtn.setMnemonicParsing(false);
        YesBtn.setText("Yes");

        GridPane.setColumnIndex(NoBtn, 1);
        GridPane.setHalignment(NoBtn, javafx.geometry.HPos.LEFT);
        NoBtn.setMnemonicParsing(false);
        NoBtn.setText("No");
        GridPane.setMargin(NoBtn, new Insets(0.0));
        gridPane.setPadding(new Insets(0.0, 100.0, 0.0, 100.0));
        BorderPane.setMargin(gridPane, new Insets(0.0, 0.0, 250.0, 0.0));
        setCenter(gridPane);

        gridPane.getColumnConstraints().add(columnConstraints);
        gridPane.getColumnConstraints().add(columnConstraints0);
        gridPane.getRowConstraints().add(rowConstraints);
        gridPane.getChildren().add(YesBtn);
        gridPane.getChildren().add(NoBtn);

        
      ////  DialogExitecontoller dialog = new DialogExitecontoller() ;
//dialog.setStyle("-fx-background-color: red;");

      
        
        YesBtn.setOnAction(event -> {
            // Exit the application
            System.exit(0);
        });

        NoBtn.setOnAction(event -> {
            // Hide the dialog
            getScene().getWindow().hide();
        });
    }
}
