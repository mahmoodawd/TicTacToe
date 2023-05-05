package tictactoe.available_players.presentation;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.ListChangeListener;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import tictactoe.available_players.domain.model.Player;
import tictactoe.available_players.presentation.dialogs.NoPlayerSelectedDialog;
import tictactoe.available_players.presentation.dialogs.RequestDeniedDialogViewController;
import tictactoe.available_players.presentation.dialogs.SendRequestDialogViewController;
import tictactoe.core.Navigation;
import tictactoe.core.ViewController;
import tictactoe.core.designsystem.resources.ImagesUri;
import tictactoe.core.designsystem.resources.StylesUri;

public class AvailablePlayersViewController extends VBox {

    protected final Button sendRequestBtn;
    protected final Button backBtn;
    protected final Label availablePlayerTxt;
    private final ToggleGroup toggleGroup = new ToggleGroup();
    private final VBox toggleButtonsContainer;
    private final VBox backButtonBox;
    private final ScrollPane toggleButtonsScrollPane;
    private AvailablePlayersViewModel viewModel = null;
    private String selectedPlayer;
    protected final Image backIcon = new Image(getClass().getResourceAsStream(ImagesUri.back));

    public AvailablePlayersViewController(AvailablePlayersViewModel viewModel) {
        this.viewModel = viewModel;
        ImageView backIconView = new ImageView(backIcon);
        backIconView.setFitWidth(50);
        backIconView.setFitHeight(50);

        sendRequestBtn = new Button();
        backBtn = new Button();
        toggleButtonsContainer = new VBox();
        backButtonBox = new VBox();
        toggleButtonsScrollPane = new ScrollPane(toggleButtonsContainer);
        availablePlayerTxt = new Label();

        setAlignment(javafx.geometry.Pos.CENTER);
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setSpacing(10.0);
        setPadding(new Insets(16.0));

        sendRequestBtn.setText("Send Request");
        sendRequestBtn.setCursor(Cursor.HAND);
        sendRequestBtn.setMnemonicParsing(false);
        backIconView.setFitHeight(50);
        backIconView.setFitWidth(50);
        backBtn.setGraphic(backIconView);
        backBtn.setCursor(Cursor.HAND);
        backBtn.setStyle("-fx-background-color: transparent; -fx-pref-width: 50px; -fx-pref-height: 50px;");

        backButtonBox.getChildren().add(backBtn);
        backButtonBox.setAlignment(Pos.CENTER_LEFT);

        availablePlayerTxt.setStyle("-fx-font-size: 28;");
        availablePlayerTxt.setText("Available Players");

        toggleButtonsContainer.setAlignment(javafx.geometry.Pos.CENTER);
        toggleButtonsContainer.setSpacing(20.0);
        toggleButtonsContainer.setPadding(new Insets(30.0));
        toggleButtonsContainer.setId("my-vbox");

        toggleButtonsScrollPane.setFitToWidth(true);
        toggleButtonsScrollPane.setPrefViewportWidth(50);
        toggleButtonsScrollPane.setMinViewportWidth(50);
        toggleButtonsScrollPane.setHbarPolicy(ScrollBarPolicy.NEVER);
        toggleButtonsScrollPane.setVbarPolicy(ScrollBarPolicy.AS_NEEDED);

        getChildren().add(backButtonBox);
        getChildren().add(availablePlayerTxt);
        getChildren().add(toggleButtonsScrollPane);
        getChildren().add(sendRequestBtn);

        getStylesheets().addAll(this.getClass().getResource(StylesUri.globalStyle).toExternalForm());
        this.setId("pane");
        setPrefWidth(800);
        setMaxHeight(600);
        sendRequestBtn.setOnAction((event) -> SendRequest());
        backBtn.setOnAction((event) -> back());
        initialize();
    }

    private void initialize() {
        viewPlayers();
        getCurrentToggled();

    }

    void SendRequest() {
        SendRequestDialogViewController sendRequestDialog = new SendRequestDialogViewController(sendRequestBtn, selectedPlayer);
        try {
            if (selectedPlayer == null) {
                new NoPlayerSelectedDialog().show();
            } else {
                sendRequestDialog.show();
                viewModel.sendRequest(new Player(selectedPlayer));
                SimpleObjectProperty<RequestStatus> rs = viewModel.getRequestStatus();
                rs.addListener((observable, oldValue, newValue) -> {
                    System.out.println(newValue);
                    switch (rs.getValue()) {
                        case ACCEPTED: {
                            try {
                                Navigation.openPage(ViewController.MULTIPLAYERVIEWCONTROLLER, this);
                            } catch (IOException ex) {
                                Logger.getLogger(AvailablePlayersViewController.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        break;
                        case REJECTED:
                            new RequestDeniedDialogViewController().show();
                            break;
                    case SENDING:
                    {
                        try {
                            sendRequestDialog.show();
                        } catch (IOException ex) {
                            Logger.getLogger(AvailablePlayersViewController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                        break;
                    }
                });

            }
        } catch (IOException ex) {
            Logger.getLogger(AvailablePlayersViewController.class.getName()).log(Level.SEVERE, null, ex);
        } 

    }

    private void viewPlayers() {
        viewModel.getAvailablePlayers().addListener(new ListChangeListener<Player>() {
            @Override
            public void onChanged(ListChangeListener.Change<? extends Player> change) {

            }
        });

        for (Player player : viewModel.getAvailablePlayers()) {
            RadioButton radioButton = new RadioButton(player.getName());
            radioButton.setToggleGroup(toggleGroup);
            toggleButtonsContainer.getChildren().add(radioButton);
            toggleButtonsScrollPane.setVvalue(toggleButtonsScrollPane.getVmax());
        }
    }

    private void getCurrentToggled() {
        toggleGroup.selectedToggleProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                RadioButton selectedRadioButton = (RadioButton) newValue;
                selectedPlayer = selectedRadioButton.getText();
            }
        });

    }

    private void back() {
        try {
            Navigation.openPage(ViewController.MAINVIEWCONTROLLER, this);
        } catch (IOException ex) {
            Logger.getLogger(AvailablePlayersViewController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
