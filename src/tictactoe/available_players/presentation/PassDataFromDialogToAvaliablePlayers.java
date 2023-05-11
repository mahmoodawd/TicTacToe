package tictactoe.available_players.presentation;

import javafx.beans.property.SimpleStringProperty;

public class PassDataFromDialogToAvaliablePlayers {

    private static PassDataFromDialogToAvaliablePlayers instance = null;
    public SimpleStringProperty requestStatus = new SimpleStringProperty();

    private PassDataFromDialogToAvaliablePlayers() {

    }

    public SimpleStringProperty getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(String result) {
        requestStatus.set(result);
    }

    public static synchronized PassDataFromDialogToAvaliablePlayers getInstance() {

        if (instance == null) {
            instance = new PassDataFromDialogToAvaliablePlayers();
        }

        return instance;
    }
}
