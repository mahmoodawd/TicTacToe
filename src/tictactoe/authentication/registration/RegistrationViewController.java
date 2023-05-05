package tictactoe.authentication.registration;

import java.io.IOException;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Text;
import tictactoe.core.Navigation;
import tictactoe.core.ViewController;
import tictactoe.core.designsystem.ColorPalette;
import tictactoe.core.designsystem.Typography;
import tictactoe.core.designsystem.resources.ImagesUri;
import tictactoe.core.designsystem.resources.StylesUri;

public class RegistrationViewController extends GridPane {

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
    protected final Text registrationTxt;
    protected final Text usernameTxt;
    protected final Text passwordTxt;
    protected final Text confirmPasswordTxt;
    protected final Button registerBtn;
    protected final TextField usernameField;
    protected final Text invalidUsernameTxt;
    protected Text invalidPasswordTxt;
    protected Text confirmationErrorTxt;
    protected final ImageView imageFrame;
    protected final GridPane gridPane;
    protected final ColumnConstraints columnConstraints0;
    protected final ColumnConstraints columnConstraints1;
    protected final ColumnConstraints columnConstraints2;
    protected final RowConstraints rowConstraints16;
    protected final Text text;
    protected final Hyperlink hyperlink;
    protected final PasswordField confirmPasswordField;
    protected final PasswordField passwordField;
    RegistrationViewModel viewModel;

    public RegistrationViewController(RegistrationViewModel viewModel) {

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
        registrationTxt = new Text();
        usernameTxt = new Text();
        passwordTxt = new Text();
        confirmPasswordTxt = new Text();
        registerBtn = new Button();
        usernameField = new TextField();
        invalidUsernameTxt = new Text();
        invalidPasswordTxt = new Text();
        confirmationErrorTxt = new Text();
        imageFrame = new ImageView();
        gridPane = new GridPane();
        columnConstraints0 = new ColumnConstraints();
        columnConstraints1 = new ColumnConstraints();
        columnConstraints2 = new ColumnConstraints();
        rowConstraints16 = new RowConstraints();
        text = new Text();
        hyperlink = new Hyperlink();
        confirmPasswordField = new PasswordField();
        passwordField = new PasswordField();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(600.0);
        setPrefWidth(800.0);
        setStyle("-fx-border-color: white; -fx-background-size: 600 800;");
        getStylesheets().addAll(this.getClass().getResource(StylesUri.globalStyle).toExternalForm());
        this.setId("pane");
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

        GridPane.setHalignment(registrationTxt, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(registrationTxt, 1);
        registrationTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        registrationTxt.setStrokeWidth(0.0);
        registrationTxt.setText("Registration");
        registrationTxt.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        registrationTxt.setFont(Typography.headerBoldFont);

        GridPane.setHalignment(usernameTxt, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(usernameTxt, 4);
        usernameTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        usernameTxt.setStrokeWidth(0.0);
        usernameTxt.setText("username");
        usernameTxt.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        usernameTxt.setFont(Typography.subtitleOneRegularFont);
        GridPane.setMargin(usernameTxt, new Insets(0.0, 125, 5, 0.0));

        GridPane.setHalignment(passwordTxt, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(passwordTxt, 7);
        passwordTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        passwordTxt.setStrokeWidth(0.0);
        passwordTxt.setText("password");
        passwordTxt.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        passwordTxt.setFont(Typography.subtitleOneRegularFont);
        GridPane.setMargin(passwordTxt, new Insets(0.0, 125, 5, 0.0));

        GridPane.setHalignment(confirmPasswordTxt, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(confirmPasswordTxt, 10);
        confirmPasswordTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        confirmPasswordTxt.setStrokeWidth(0.0);
        confirmPasswordTxt.setText("confirm password");
        confirmPasswordTxt.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        confirmPasswordTxt.setFont(Typography.subtitleOneRegularFont);
        GridPane.setMargin(confirmPasswordTxt, new Insets(0.0, 65, 5, 0.0));

        GridPane.setHalignment(registerBtn, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(registerBtn, 13);
        registerBtn.setMnemonicParsing(false);
        registerBtn.setText("Register");
        registerBtn.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        registerBtn.setTextFill(javafx.scene.paint.Color.WHITE);
        registerBtn.setStyle("-fx-background-color: "+ColorPalette.lightBlue+"; -fx-background-radius: 15px;");
        registerBtn.setPrefWidth(160);

        GridPane.setRowIndex(usernameField, 5);
        usernameField.setPrefHeight(26.0);
        usernameField.setPrefWidth(438.0);
        GridPane.setMargin(usernameField, new Insets(0.0, 190.0, 0.0, 190.0));
        usernameField.setStyle("-fx-background-radius: 15px;");

        GridPane.setHalignment(invalidUsernameTxt, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(invalidUsernameTxt, 6);
        invalidUsernameTxt.setFill(javafx.scene.paint.Color.RED);
        invalidUsernameTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        invalidUsernameTxt.setStrokeWidth(0.0);
        invalidUsernameTxt.setText("This username already exists !");
        invalidUsernameTxt.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        invalidUsernameTxt.setVisible(false);

        GridPane.setHalignment(invalidPasswordTxt, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(invalidPasswordTxt, 9);
        invalidPasswordTxt.setFill(javafx.scene.paint.Color.RED);
        invalidPasswordTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        invalidPasswordTxt.setStrokeWidth(0.0);
        invalidPasswordTxt.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        invalidPasswordTxt.setVisible(false);
        invalidPasswordTxt.setFont(Typography.bodyTwoRegularFont);

        GridPane.setHalignment(confirmationErrorTxt, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(confirmationErrorTxt, 12);
        confirmationErrorTxt.setFill(javafx.scene.paint.Color.RED);
        confirmationErrorTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        confirmationErrorTxt.setStrokeWidth(0.0);
        confirmationErrorTxt.setText("Password doesn't match !");
        confirmationErrorTxt.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        confirmationErrorTxt.setVisible(false);
        

        GridPane.setRowIndex(imageFrame, 1);
        imageFrame.setFitHeight(70.0);
        imageFrame.setFitWidth(100.0);
        imageFrame.setPickOnBounds(true);
        imageFrame.setPreserveRatio(true);
        GridPane.setMargin(imageFrame, new Insets(0.0, 0, 50, 90.0));
        imageFrame.setImage(new Image(ImagesUri.back));

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

        GridPane.setColumnIndex(text, 1);
        GridPane.setHalignment(text, javafx.geometry.HPos.RIGHT);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Already have an account ?");
        text.setTextAlignment(javafx.scene.text.TextAlignment.RIGHT);

        GridPane.setColumnIndex(hyperlink, 2);
        hyperlink.setText("Login");
        hyperlink.setTextFill(javafx.scene.paint.Color.valueOf("#0c5eeb"));

        GridPane.setRowIndex(confirmPasswordField, 11);
        GridPane.setMargin(confirmPasswordField, new Insets(0.0, 190.0, 0.0, 190.0));
        confirmPasswordField.setStyle("-fx-background-radius: 15px;");

        GridPane.setRowIndex(passwordField, 8);
        passwordField.setPromptText("e.g. Sample_Sample947");
        GridPane.setMargin(passwordField, new Insets(0.0, 190.0, 0.0, 190.0));
        passwordField.setStyle("-fx-background-radius: 15px;");

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
        getChildren().add(registrationTxt);
        getChildren().add(usernameTxt);
        getChildren().add(passwordTxt);
        getChildren().add(confirmPasswordTxt);
        getChildren().add(registerBtn);
        getChildren().add(usernameField);
        getChildren().add(invalidUsernameTxt);
        getChildren().add(invalidPasswordTxt);
        getChildren().add(confirmationErrorTxt);
        getChildren().add(imageFrame);
        gridPane.getColumnConstraints().add(columnConstraints0);
        gridPane.getColumnConstraints().add(columnConstraints1);
        gridPane.getColumnConstraints().add(columnConstraints2);
        gridPane.getRowConstraints().add(rowConstraints16);
        gridPane.getChildren().add(text);
        gridPane.getChildren().add(hyperlink);
        getChildren().add(gridPane);
        getChildren().add(confirmPasswordField);
        getChildren().add(passwordField);
        registerBtn.setDisable(true);
        uiObservers();
        viewModelObservers();
        navigate();
}
    private void navigate(){
        registerBtn.setOnAction((event) -> {

        try {
            invalidUsernameTxt.setVisible(false);
            invalidPasswordTxt.setVisible(false);
            confirmationErrorTxt.setVisible(false);
            if(viewModel.validateUsername()){
                if(viewModel.validatePassword())
                    if(viewModel.doesPasswordMatch()){
                        Navigation.openPage(ViewController.LOGINVIEWCONTROLLER, registerBtn);
                    }
                    else
                        confirmationErrorTxt.setVisible(true);
                else{
                invalidPasswordTxt.setVisible(true);
            }
            }
            else{
                invalidUsernameTxt.setVisible(true);
            }
        } catch (IOException ex) {
            
        }
         }); 
    }
    private void uiObservers(){
        usernameField.textProperty().addListener((observable, oldValue, newValue) -> {
            viewModel.setUsername(newValue);
        });
        passwordField.textProperty().addListener((observable, oldValue, newValue) -> {
            viewModel.setPassword(newValue);
        });
        confirmPasswordField.textProperty().addListener((observable, oldValue, newValue) -> {
            viewModel.setConfirmPassword(newValue);
        });
    }
    private void viewModelObservers(){
        viewModel.getUsername().addListener((ObservableValue<? extends String> observable, String oldValue, String newValue) -> {
            registerBtn.setDisable(!viewModel.enableRegisterBtn());
        });
        viewModel.getConfirmPassword().addListener((ObservableValue<? extends String> observable, String oldValue, String newValue) -> {
            registerBtn.setDisable(!viewModel.enableRegisterBtn());
        });
        viewModel.getPassword().addListener((ObservableValue<? extends String> observable, String oldValue, String newValue) -> {
            registerBtn.setDisable(!viewModel.enableRegisterBtn());
        });
    }
    
}
