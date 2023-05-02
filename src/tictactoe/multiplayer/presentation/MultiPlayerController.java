package tictactoe.multiplayer.presentation;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import tictactoe.core.Navigation;
import tictactoe.core.ViewController;
import tictactoe.core.designsystem.ColorPalette;
import tictactoe.core.designsystem.Typography;

public  class MultiPlayerController extends GridPane {

    protected final ColumnConstraints columnConstraints;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final RowConstraints rowConstraints2;
    protected final RowConstraints rowConstraints3;
    protected final RowConstraints rowConstraints4;
    protected final RowConstraints rowConstraints5;
    protected final RowConstraints rowConstraints6;
    protected final RowConstraints rowConstraints7;
    protected final RowConstraints rowConstraints8;
    protected final RowConstraints rowConstraints9;
    protected final RowConstraints rowConstraints10;
    protected final RowConstraints rowConstraints11;
    protected final RowConstraints rowConstraints12;
    protected final RowConstraints rowConstraints13;
    protected final RowConstraints rowConstraints14;
    protected final RowConstraints rowConstraints15;
    protected final Text titleTextView;
    protected final Text playerNameOneTextView;
    protected final Text playerNameTwoTextView;
    protected final Button startButton;
    protected final TextField playerOneTextField;
    protected final Text invalidUsernameTxt;
    protected final Text invalidPasswordTxt;
    protected final Text confirmationErrorTxt;
    protected final ImageView imageFrame;
    protected final GridPane gridPane;
    protected final ColumnConstraints columnConstraints0;
    protected final ColumnConstraints columnConstraints1;
    protected final ColumnConstraints columnConstraints2;
    protected final RowConstraints rowConstraints16;
    protected final PasswordField playerTwoTextField;
 
    private MultiPlayerViewModel viewModel;
    public MultiPlayerController(MultiPlayerViewModel viewModel) {
    this.viewModel = viewModel;
        columnConstraints = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        rowConstraints2 = new RowConstraints();
        rowConstraints3 = new RowConstraints();
        rowConstraints4 = new RowConstraints();
        rowConstraints5 = new RowConstraints();
        rowConstraints6 = new RowConstraints();
        rowConstraints7 = new RowConstraints();
        rowConstraints8 = new RowConstraints();
        rowConstraints9 = new RowConstraints();
        rowConstraints10 = new RowConstraints();
        rowConstraints11 = new RowConstraints();
        rowConstraints12 = new RowConstraints();
        rowConstraints13 = new RowConstraints();
        rowConstraints14 = new RowConstraints();
        rowConstraints15 = new RowConstraints();
        titleTextView = new Text();
        playerNameOneTextView = new Text();
        playerNameTwoTextView = new Text();
        startButton = new Button();
        playerOneTextField = new TextField();
        invalidUsernameTxt = new Text();
        invalidPasswordTxt = new Text();
        confirmationErrorTxt = new Text();
        imageFrame = new ImageView();
        gridPane = new GridPane();
        columnConstraints0 = new ColumnConstraints();
        columnConstraints1 = new ColumnConstraints();
        columnConstraints2 = new ColumnConstraints();
        rowConstraints16 = new RowConstraints();
        playerTwoTextField = new PasswordField();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0);
        setPrefWidth(600.0);
        setStyle("-fx-background-color: #FFFFFF;");

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(100.0);

        rowConstraints.setMinHeight(10.0);
        rowConstraints.setPrefHeight(30.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setPrefHeight(30.0);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints1.setMinHeight(10.0);
        rowConstraints1.setPrefHeight(30.0);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints2.setMinHeight(10.0);
        rowConstraints2.setPrefHeight(30.0);
        rowConstraints2.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints3.setMinHeight(10.0);
        rowConstraints3.setPrefHeight(30.0);
        rowConstraints3.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints4.setMinHeight(10.0);
        rowConstraints4.setPrefHeight(30.0);
        rowConstraints4.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints5.setMinHeight(10.0);
        rowConstraints5.setPrefHeight(30.0);
        rowConstraints5.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints6.setMinHeight(10.0);
        rowConstraints6.setPrefHeight(30.0);
        rowConstraints6.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints7.setMinHeight(10.0);
        rowConstraints7.setPrefHeight(30.0);
        rowConstraints7.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints8.setMinHeight(10.0);
        rowConstraints8.setPrefHeight(30.0);
        rowConstraints8.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints9.setMinHeight(10.0);
        rowConstraints9.setPrefHeight(30.0);
        rowConstraints9.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints10.setMinHeight(10.0);
        rowConstraints10.setPrefHeight(30.0);
        rowConstraints10.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints11.setMinHeight(10.0);
        rowConstraints11.setPrefHeight(30.0);
        rowConstraints11.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints12.setMinHeight(10.0);
        rowConstraints12.setPrefHeight(30.0);
        rowConstraints12.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints13.setMinHeight(10.0);
        rowConstraints13.setPrefHeight(30.0);
        rowConstraints13.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints14.setMinHeight(10.0);
        rowConstraints14.setPrefHeight(30.0);
        rowConstraints14.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints15.setMinHeight(10.0);
        rowConstraints15.setPrefHeight(30.0);
        rowConstraints15.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setHalignment(titleTextView, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(titleTextView, 1);
        titleTextView.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        titleTextView.setStrokeWidth(0.0);
        titleTextView.setText("Multi Player");
        titleTextView.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        titleTextView.setFont(new Font(18.0));

        GridPane.setHalignment(playerNameOneTextView, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(playerNameOneTextView, 4);
        playerNameOneTextView.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        playerNameOneTextView.setStrokeWidth(0.0);
        playerNameOneTextView.setText("player 1");
        playerNameOneTextView.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);

        GridPane.setHalignment(playerNameTwoTextView, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(playerNameTwoTextView, 7);
        playerNameTwoTextView.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        playerNameTwoTextView.setStrokeWidth(0.0);
        playerNameTwoTextView.setText("player 2");
        playerNameTwoTextView.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);

        GridPane.setHalignment(startButton, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(startButton, 10);
        startButton.setMnemonicParsing(false);
        startButton.setPrefHeight(26.0);
        startButton.setPrefWidth(141.0);
        startButton.setText("start");
        startButton.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        startButton.setTextFill(javafx.scene.paint.Color.WHITE);

        GridPane.setRowIndex(playerOneTextField, 5);
        playerOneTextField.setPrefHeight(26.0);
        playerOneTextField.setPrefWidth(438.0);
        GridPane.setMargin(playerOneTextField, new Insets(10.0, 190.0, 0.0, 190.0));
        playerOneTextField.setPadding(new Insets(10.0, 0.0, 0.0, 0.0));

        GridPane.setHalignment(invalidUsernameTxt, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(invalidUsernameTxt, 6);
        invalidUsernameTxt.setFill(javafx.scene.paint.Color.RED);
        invalidUsernameTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        invalidUsernameTxt.setStrokeWidth(0.0);
        invalidUsernameTxt.setText("Invalid username !");
        invalidUsernameTxt.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        invalidUsernameTxt.setVisible(false);

        GridPane.setHalignment(invalidPasswordTxt, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(invalidPasswordTxt, 9);
        invalidPasswordTxt.setFill(javafx.scene.paint.Color.RED);
        invalidPasswordTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        invalidPasswordTxt.setStrokeWidth(0.0);
        invalidPasswordTxt.setText("Password must be at least 6 characters and contain upper & lower case letters, special characters and numbers !");
        invalidPasswordTxt.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        invalidPasswordTxt.setVisible(false);

        GridPane.setHalignment(confirmationErrorTxt, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(confirmationErrorTxt, 12);
        confirmationErrorTxt.setFill(javafx.scene.paint.Color.RED);
        confirmationErrorTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        confirmationErrorTxt.setStrokeWidth(0.0);
        confirmationErrorTxt.setText("Password doesn't match !");
        confirmationErrorTxt.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        confirmationErrorTxt.setVisible(false);

        GridPane.setRowIndex(imageFrame, 1);
        imageFrame.setFitHeight(46.0);
        imageFrame.setFitWidth(60.0);
        imageFrame.setPickOnBounds(true);
        imageFrame.setPreserveRatio(true);
        GridPane.setMargin(imageFrame, new Insets(0.0, 0.0, 0.0, 120.0));

        GridPane.setRowIndex(gridPane, 14);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(100.0);

        columnConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1.setMaxWidth(193.5999755859375);
        columnConstraints1.setMinWidth(10.0);
        columnConstraints1.setPrefWidth(184.00002441406252);

        columnConstraints2.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints2.setMaxWidth(240.79997558593743);
        columnConstraints2.setMinWidth(10.0);
        columnConstraints2.setPrefWidth(240.79997558593743);

        rowConstraints16.setMinHeight(10.0);
        rowConstraints16.setPrefHeight(30.0);
        rowConstraints16.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setRowIndex(playerTwoTextField, 8);
        GridPane.setMargin(playerTwoTextField, new Insets(0.0, 190.0, 0.0, 190.0));

        getColumnConstraints().add(columnConstraints);
        getRowConstraints().add(rowConstraints);
        getRowConstraints().add(rowConstraints0);
        getRowConstraints().add(rowConstraints1);
        getRowConstraints().add(rowConstraints2);
        getRowConstraints().add(rowConstraints3);
        getRowConstraints().add(rowConstraints4);
        getRowConstraints().add(rowConstraints5);
        getRowConstraints().add(rowConstraints6);
        getRowConstraints().add(rowConstraints7);
        getRowConstraints().add(rowConstraints8);
        getRowConstraints().add(rowConstraints9);
        getRowConstraints().add(rowConstraints10);
        getRowConstraints().add(rowConstraints11);
        getRowConstraints().add(rowConstraints12);
        getRowConstraints().add(rowConstraints13);
        getRowConstraints().add(rowConstraints14);
        getRowConstraints().add(rowConstraints15);
        getChildren().add(titleTextView);
        getChildren().add(playerNameOneTextView);
        getChildren().add(playerNameTwoTextView);
        getChildren().add(startButton);
        getChildren().add(playerOneTextField);
        getChildren().add(invalidUsernameTxt);
        getChildren().add(invalidPasswordTxt);
        getChildren().add(confirmationErrorTxt);
        getChildren().add(imageFrame);
        gridPane.getColumnConstraints().add(columnConstraints0);
        gridPane.getColumnConstraints().add(columnConstraints1);
        gridPane.getColumnConstraints().add(columnConstraints2);
        gridPane.getRowConstraints().add(rowConstraints16);
        getChildren().add(gridPane);
        getChildren().add(playerTwoTextField);
         startButton.setStyle("-fx-background-color: "+ColorPalette.lightBlue+"; -fx-background-radius: 15px;");
         playerOneTextField.setStyle("-fx-background-radius: 15px;");
         playerTwoTextField.setStyle("-fx-background-radius: 15px;");
         titleTextView.setFont(Typography.headerBoldFont);
         playerNameOneTextView.setFont(Typography.subtitleOneRegularFont);
         playerNameTwoTextView.setFont(Typography.subtitleOneRegularFont);
         startButton.setOnAction((event) -> {
             
        try {
            Navigation.openPage(ViewController.ONLINEVIEWCONTROLLER, startButton);
        } catch (IOException ex) {
            Logger.getLogger(MultiPlayerController.class.getName()).log(Level.SEVERE, null, ex);
        }
         });
    }
}
