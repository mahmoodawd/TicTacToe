package tictactoe.available_players.presentation;

import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.Pane;
import javafx.scene.control.Label;
import tictactoe.available_players.presentation.dialogs.SendRequestDialogViewController;
import tictactoe.core.designsystem.resources.ImagesUri;
import tictactoe.core.designsystem.resources.StylesUri;

public class AvailablePlayersViewController extends Pane {

    protected final Button sendRequesBtn;
    protected final ListView<RadioButton> playersListView;
    protected final Label availablePlayerTxt;
    protected final RadioButton radioButton;
    protected final RadioButton radioButton0;
    protected final RadioButton radioButton1;
    protected final RadioButton radioButton2;
    protected final RadioButton radioButton3;
    private AvailablePlayersViewModel viewModel = null;

    public AvailablePlayersViewController(AvailablePlayersViewModel viewModel) {

        sendRequesBtn = new Button();
        playersListView = new ListView();
        availablePlayerTxt = new Label();
        radioButton = new RadioButton();
        radioButton0 = new RadioButton();
        radioButton1 = new RadioButton();
        radioButton2 = new RadioButton();
        radioButton3 = new RadioButton();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(600.0);
        setPrefWidth(800.0);

        sendRequesBtn.setAlignment(javafx.geometry.Pos.BOTTOM_CENTER);
        sendRequesBtn.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        sendRequesBtn.setLayoutX(280.0);
        sendRequesBtn.setLayoutY(520.0);
        sendRequesBtn.setMaxHeight(USE_PREF_SIZE);
        sendRequesBtn.setMaxWidth(USE_PREF_SIZE);
        sendRequesBtn.setMinHeight(USE_PREF_SIZE);
        sendRequesBtn.setMinWidth(USE_PREF_SIZE);
        sendRequesBtn.setMnemonicParsing(false);
        sendRequesBtn.setPrefHeight(50.0);
        sendRequesBtn.setPrefWidth(250.0);
        sendRequesBtn.setText("Send Request");
        sendRequesBtn.setCursor(Cursor.HAND);
        sendRequesBtn.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);

        playersListView.setLayoutX(192.0);
        playersListView.setLayoutY(127.0);
        playersListView.setMaxHeight(USE_PREF_SIZE);
        playersListView.setMaxWidth(USE_PREF_SIZE);
        playersListView.setMinHeight(USE_PREF_SIZE);
        playersListView.setMinWidth(USE_PREF_SIZE);
        playersListView.setPrefHeight(346.0);
        playersListView.setPrefWidth(412.0);
        playersListView.setStyle("-fx-border-color: #FF827E; -fx-border-radius: 10;");

        availablePlayerTxt.setAlignment(javafx.geometry.Pos.TOP_CENTER);
        availablePlayerTxt.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        availablePlayerTxt.setLayoutX(251.0);
        availablePlayerTxt.setLayoutY(14.0);
        availablePlayerTxt.setMaxHeight(USE_PREF_SIZE);
        availablePlayerTxt.setMaxWidth(USE_PREF_SIZE);
        availablePlayerTxt.setMinHeight(USE_PREF_SIZE);
        availablePlayerTxt.setMinWidth(USE_PREF_SIZE);
        availablePlayerTxt.setPrefHeight(90.0);
        availablePlayerTxt.setPrefWidth(294.0);
        availablePlayerTxt.setStyle("-fx-font-size: 28; -fx-background-color: #FFFFFF; -fx-font-weight: bold; -fx-label-padding: 10;");
        availablePlayerTxt.setText("Available Players");
    
        radioButton.setLayoutX(250.0);
        radioButton.setLayoutY(163.0);
        radioButton.setMnemonicParsing(false);
        radioButton.setPrefHeight(50.0);
        radioButton.setPrefWidth(250.0);
        radioButton.setStyle("-fx-font-size: 26; -fx-alignment: center;");
        radioButton.setText("Player1");

        radioButton0.setLayoutX(250.0);
        radioButton0.setLayoutY(222.0);
        radioButton0.setMnemonicParsing(false);
        radioButton0.setPrefHeight(50.0);
        radioButton0.setPrefWidth(250.0);
        radioButton0.setStyle("-fx-font-size: 26; -fx-alignment: center;");
        radioButton0.setText("Player2");

        radioButton1.setLayoutX(251.0);
        radioButton1.setLayoutY(280.0);
        radioButton1.setMnemonicParsing(false);
        radioButton1.setPrefHeight(50.0);
        radioButton1.setPrefWidth(250.0);
        radioButton1.setStyle("-fx-font-size: 26; -fx-alignment: center;");
        radioButton1.setText("Player3");

        radioButton2.setLayoutX(251.0);
        radioButton2.setLayoutY(333.0);
        radioButton2.setMnemonicParsing(false);
        radioButton2.setPrefHeight(50.0);
        radioButton2.setPrefWidth(250.0);
        radioButton2.setStyle("-fx-font-size: 26; -fx-alignment: center;");
        radioButton2.getStyleClass().add("radio-button");
        radioButton2.setText("Player4");

        radioButton3.setLayoutX(251.0);
        radioButton3.setLayoutY(388.0);
        radioButton3.setMnemonicParsing(false);
        radioButton3.setPrefHeight(50.0);
        radioButton3.setPrefWidth(250.0);
        radioButton3.setStyle("-fx-font-size: 26; -fx-alignment: center;");
        radioButton3.setText("Player5");

        ToggleGroup g = new ToggleGroup();
        radioButton.setToggleGroup(g);
        radioButton0.setToggleGroup(g);
        radioButton1.setToggleGroup(g);
        radioButton2.setToggleGroup(g);
        radioButton3.setToggleGroup(g);

        getChildren().add(sendRequesBtn);
        getChildren().add(playersListView);
        getChildren().add(availablePlayerTxt);
        getChildren().add(radioButton);
        getChildren().add(radioButton0);
        getChildren().add(radioButton1);
        getChildren().add(radioButton2);
        getChildren().add(radioButton3);
       
        getStylesheets().addAll(this.getClass().getResource(StylesUri.globalStyle).toExternalForm());
        this.setId("pane");
        sendRequesBtn.setOnAction((event) -> showSendingDialog());
    }

    void showSendingDialog() {

//        ReceivedRequestDialogViewController receivedRequest = new ReceivedRequestDialogViewController();
        //RequestDeniedDialogViewController requestDenied = new RequestDeniedDialogViewController();
        SendRequestDialogViewController sendRequest = new SendRequestDialogViewController();

    }
}
