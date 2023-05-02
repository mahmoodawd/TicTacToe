package tictactoe.authentication.login.presentation;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
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
    protected final ImageView backIcon;
    protected final Text invalidPasswordWarning;
    protected final Text invalidUsernameWarning;
    protected final GridPane gridPane;
    protected final ColumnConstraints columnConstraints0;
    protected final ColumnConstraints columnConstraints1;
    protected final ColumnConstraints columnConstraints2;
    protected final RowConstraints rowConstraints11;
    protected final Hyperlink registerLink;
    protected final Text notificationTxt;
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
        backIcon = new ImageView();
        invalidPasswordWarning = new Text();
        invalidUsernameWarning = new Text();
        gridPane = new GridPane();
        columnConstraints0 = new ColumnConstraints();
        columnConstraints1 = new ColumnConstraints();
        columnConstraints2 = new ColumnConstraints();
        rowConstraints11 = new RowConstraints();
        registerLink = new Hyperlink();
        notificationTxt = new Text();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(600.0);
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

        GridPane.setHalignment(passwordTxt, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(passwordTxt, 6);
        passwordTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        passwordTxt.setStrokeWidth(0.0);
        passwordTxt.setText("password");
        passwordTxt.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        passwordTxt.setFont(Typography.subtitleOneRegularFont);

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
        userNameTxt.setFont(Typography.subtitleOneRegularFont);

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
        loginBtn.setTextFill(javafx.scene.paint.Color.WHITE);
        loginBtn.setStyle("-fx-background-color: "+ColorPalette.lightBlue+"; -fx-background-radius: 15px;");
        loginBtn.setPrefWidth(160);

        backIcon.setFitHeight(44.0);
        backIcon.setFitWidth(70.0);
        backIcon.setPickOnBounds(true);
        backIcon.setPreserveRatio(true);
        GridPane.setMargin(backIcon, new Insets(30.0, 0.0, 0.0, 50.0));

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
        invalidUsernameWarning.setText("This username doesn't exist !");
        invalidUsernameWarning.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);

        GridPane.setRowIndex(gridPane, 10);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(100.0);

        columnConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1.setMaxWidth(294.4000244140625);
        columnConstraints1.setMinWidth(10.0);
        columnConstraints1.setPrefWidth(249.79998779296875);

        columnConstraints2.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints2.setMaxWidth(267.1999877929687);
        columnConstraints2.setMinWidth(10.0);
        columnConstraints2.setPrefWidth(241.60001220703123);

        rowConstraints11.setMinHeight(10.0);
        rowConstraints11.setPrefHeight(30.0);
        rowConstraints11.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setColumnIndex(registerLink, 2);
        registerLink.setAlignment(javafx.geometry.Pos.TOP_LEFT);
        registerLink.setPrefHeight(19.0);
        registerLink.setPrefWidth(206.0);
        registerLink.setText("Register");
        registerLink.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        registerLink.setTextFill(javafx.scene.paint.Color.valueOf("#0048ff"));
        registerLink.setUnderline(true);
        registerLink.setPadding(new Insets(0.0, 210.0, 0.0, 0.0));

        GridPane.setColumnIndex(notificationTxt, 1);
        GridPane.setHalignment(notificationTxt, javafx.geometry.HPos.RIGHT);
        notificationTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        notificationTxt.setStrokeWidth(0.0);
        notificationTxt.setText("Don't hava an account?");
        setOpaqueInsets(new Insets(0.0));

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
        getChildren().add(backIcon);
        getChildren().add(invalidPasswordWarning);
        getChildren().add(invalidUsernameWarning);
        gridPane.getColumnConstraints().add(columnConstraints0);
        gridPane.getColumnConstraints().add(columnConstraints1);
        gridPane.getColumnConstraints().add(columnConstraints2);
        gridPane.getRowConstraints().add(rowConstraints11);
        gridPane.getChildren().add(registerLink);
        gridPane.getChildren().add(notificationTxt);
        getChildren().add(gridPane);

    }
}
