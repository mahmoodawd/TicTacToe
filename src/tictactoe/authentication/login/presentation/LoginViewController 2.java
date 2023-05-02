/*package tictactoe.authentication.login.presentation;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Text;
import tictactoe.core.designsystem.ColorPalette;
import tictactoe.core.designsystem.Typography;

public class LoginViewController extends GridPane {
   
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
    protected final Text passwordTxt;
    protected final Text loginTxt;
    protected final Text userNameTxt;
    protected final TextField userNameField;
    protected final PasswordField passwordField;
    protected final Button loginBtn;
    protected final ImageView imageView;
    protected final ImageView backIcon;
    protected final FlowPane flowPane;
    protected final Text notificationTxt;
    protected final Hyperlink registerLink;
    protected final Text invalidPasswordWarning;
    protected final Text invalidUsernameWarning;
    private LoginViewModel viewModel;
    
    public LoginViewController(LoginViewModel viewModel) {
        
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
        passwordTxt = new Text();
        loginTxt = new Text();
        userNameTxt = new Text();
        userNameField = new TextField();
        passwordField = new PasswordField();
        loginBtn = new Button();
        imageView = new ImageView();
        backIcon = new ImageView();
        flowPane = new FlowPane();
        notificationTxt = new Text();
        registerLink = new Hyperlink();
        invalidPasswordWarning = new Text();
        invalidUsernameWarning = new Text();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(513.0);
        setPrefWidth(600.0);

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

        GridPane.setHalignment(passwordTxt, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(passwordTxt, 6);
        passwordTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        passwordTxt.setStrokeWidth(0.0);
        passwordTxt.setText("password");
        passwordTxt.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        passwordTxt.setFont(Typography.headerMediumFont);

        GridPane.setHalignment(loginTxt, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(loginTxt, 1);
        loginTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        loginTxt.setStrokeWidth(0.0);
        loginTxt.setText("Login");
        loginTxt.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        loginTxt.setFont(Typography.headerBoldFont);

        GridPane.setHalignment(userNameTxt, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(userNameTxt, 3);
        userNameTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        userNameTxt.setStrokeWidth(0.0);
        userNameTxt.setText("username");
        userNameTxt.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        userNameTxt.setFont(Typography.headerMediumFont);

        GridPane.setRowIndex(userNameField, 4);
        GridPane.setMargin(userNameField, new Insets(0.0, 200.0, 0.0, 200.0));

        GridPane.setRowIndex(passwordField, 7);
        passwordField.setOpaqueInsets(new Insets(0.0));
        GridPane.setMargin(passwordField, new Insets(0.0, 200.0, 0.0, 200.0));

        GridPane.setHalignment(loginBtn, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(loginBtn, 9);
        loginBtn.setMnemonicParsing(false);
        loginBtn.setText("Login");
        loginBtn.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        loginBtn.setStyle("-fx-background-color: "+ColorPalette.lightBlue+"; -fx-background-radius: 15px;");


        imageView.setFitHeight(53.0);
        imageView.setFitWidth(120.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);

        backIcon.setFitHeight(44.0);
        backIcon.setFitWidth(70.0);
        backIcon.setPickOnBounds(true);
        backIcon.setPreserveRatio(true);
        GridPane.setMargin(backIcon, new Insets(30.0, 0.0, 0.0, 50.0));

        GridPane.setHalignment(flowPane, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(flowPane, 10);
        flowPane.setAlignment(javafx.geometry.Pos.CENTER_RIGHT);
        flowPane.setPrefHeight(200.0);
        flowPane.setPrefWidth(200.0);

        notificationTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        notificationTxt.setStrokeWidth(0.0);
        notificationTxt.setText("Don't hava an account?");
        notificationTxt.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);

        registerLink.setAlignment(javafx.geometry.Pos.TOP_LEFT);
        registerLink.setText("Register");
        registerLink.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        registerLink.setUnderline(true);
        registerLink.setPadding(new Insets(0.0, 210.0, 0.0, 0.0));

        GridPane.setHalignment(invalidPasswordWarning, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(invalidPasswordWarning, 8);
        invalidPasswordWarning.setFill(javafx.scene.paint.Color.RED);
        invalidPasswordWarning.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        invalidPasswordWarning.setStrokeWidth(0.0);
        invalidPasswordWarning.setText("Invalid username or password !");
        invalidPasswordWarning.setVisible(false);

        GridPane.setHalignment(invalidUsernameWarning, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(invalidUsernameWarning, 5);
        invalidUsernameWarning.setFill(javafx.scene.paint.Color.RED);
        invalidUsernameWarning.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        invalidUsernameWarning.setStrokeWidth(0.0);
        invalidUsernameWarning.setText("This username doesn't exist");
        invalidUsernameWarning.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        invalidUsernameWarning.setVisible(false);

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
        getChildren().add(passwordTxt);
        getChildren().add(loginTxt);
        getChildren().add(userNameTxt);
        getChildren().add(userNameField);
        getChildren().add(passwordField);
        getChildren().add(loginBtn);
        getChildren().add(imageView);
        getChildren().add(backIcon);
        flowPane.getChildren().add(notificationTxt);
        flowPane.getChildren().add(registerLink);
        getChildren().add(flowPane);
        getChildren().add(invalidPasswordWarning);
        getChildren().add(invalidUsernameWarning);
        
        

    }
}*/
