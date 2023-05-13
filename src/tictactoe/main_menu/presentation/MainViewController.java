package tictactoe.main_menu.presentation;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;
import tictactoe.available_players.presentation.dialogs.ReceivedRequestDialogViewController;
import tictactoe.core.Navigation;
import tictactoe.core.ViewController;
import tictactoe.core.designsystem.ColorPalette;
import tictactoe.core.designsystem.resources.ImagesUri;
import tictactoe.main_menu.presentation.exit_dialog.ExitDialogController;
//import tictactoe.main_menu.presentation.exit_dialog.ExitDialogContoller;

public class MainViewController extends GridPane {

    MainViewModel viewModel = null;
    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final ColumnConstraints columnConstraints1;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final ImageView imageLogo;
    protected final VBox vBox;
    protected final Button singleBtn;
    protected final Button multiBtn;
    protected final Button onlineBtn;
    protected final Button exitBtn;
    protected final BorderPane borderPane_L1;
    protected final ImageView img3;
    protected final ImageView img1;
    protected final ImageView img2;
    protected final ImageView img4;
    protected final ImageView img5;
    protected final BorderPane pordderL2;
    protected final ImageView img7;
    protected final ImageView img6;
    protected final ImageView img8;
    protected final ImageView img9;
    protected final BorderPane prderR1;
    protected final ImageView img12;
    protected final ImageView img10;
    protected final ImageView img11;
    protected final ImageView img13;
    protected final ImageView img14;
    protected final BorderPane prderR2;
    protected final ImageView img15;
    protected final ImageView img16;
    protected final ImageView img17;
    protected final ImageView img18;

    public MainViewController(MainViewModel viewModel) {

        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        columnConstraints1 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        imageLogo = new ImageView();
        vBox = new VBox();
        singleBtn = new Button();
        multiBtn = new Button();
        onlineBtn = new Button();
        exitBtn = new Button();
        borderPane_L1 = new BorderPane();
        img3 = new ImageView();
        img1 = new ImageView();
        img2 = new ImageView();
        img4 = new ImageView();
        img5 = new ImageView();
        pordderL2 = new BorderPane();
        img7 = new ImageView();
        img6 = new ImageView();
        img8 = new ImageView();
        img9 = new ImageView();
        prderR1 = new BorderPane();
        img12 = new ImageView();
        img10 = new ImageView();
        img11 = new ImageView();
        img13 = new ImageView();
        img14 = new ImageView();
        prderR2 = new BorderPane();
        img15 = new ImageView();
        img16 = new ImageView();
        img17 = new ImageView();
        img18 = new ImageView();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(600.0);
        setPrefWidth(800.0);

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMaxWidth(597.0);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(159.0);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMaxWidth(597.0);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(255.0);

        columnConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1.setMaxWidth(527.0);
        columnConstraints1.setMinWidth(3.0);
        columnConstraints1.setPrefWidth(186.0);

        rowConstraints.setMaxHeight(218.0);
        rowConstraints.setMinHeight(10.0);
        rowConstraints.setPrefHeight(212.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints0.setMaxHeight(358.0);
        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setPrefHeight(188.0);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setColumnIndex(imageLogo, 1);
        imageLogo.setFitHeight(163.0);
        imageLogo.setFitWidth(253.0);
        imageLogo.setPickOnBounds(true);
        imageLogo.setPreserveRatio(true);

        GridPane.setColumnIndex(vBox, 1);
        GridPane.setHalignment(vBox, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(vBox, 1);
        vBox.setPrefHeight(200.0);
        vBox.setPrefWidth(100.0);

        singleBtn.setMnemonicParsing(false);
        singleBtn.setPrefHeight(25.0);
        singleBtn.setPrefWidth(255.0);
        singleBtn.setText("Single");
        VBox.setMargin(singleBtn, new Insets(-70.0, 0.0, 10.0, 0.0));
        singleBtn.setPadding(new Insets(5.0, 0.0, 5.0, 0.0));

        multiBtn.setMnemonicParsing(false);
        multiBtn.setPrefHeight(25.0);
        multiBtn.setPrefWidth(255.0);
        multiBtn.setText("Multi");
        VBox.setMargin(multiBtn, new Insets(10.0, 0.0, 10.0, 0.0));
        multiBtn.setPadding(new Insets(5.0, 0.0, 5.0, 0.0));

        onlineBtn.setMnemonicParsing(false);
        onlineBtn.setPrefHeight(25.0);
        onlineBtn.setPrefWidth(255.0);
        onlineBtn.setText("Online");
        VBox.setMargin(onlineBtn, new Insets(10.0, 0.0, 10.0, 0.0));
        onlineBtn.setPadding(new Insets(5.0, 0.0, 5.0, 0.0));

        exitBtn.setMnemonicParsing(false);
        exitBtn.setPrefHeight(25.0);
        exitBtn.setPrefWidth(255.0);
        exitBtn.setText("Exit");
        VBox.setMargin(exitBtn, new Insets(10.0, 0.0, 10.0, 0.0));
        exitBtn.setPadding(new Insets(5.0, 0.0, 5.0, 10.0));
        GridPane.setMargin(vBox, new Insets(60.0, 0.0, 70.0, 40));
        vBox.setPadding(new Insets(100.0, 0.0, 0.0, 0.0));

        borderPane_L1.setPrefHeight(200.0);
        borderPane_L1.setPrefWidth(200.0);

        BorderPane.setAlignment(img3, javafx.geometry.Pos.CENTER);
        img3.setFitHeight(45.0);
        img3.setFitWidth(30.0);
        img3.setPickOnBounds(true);
        img3.setPreserveRatio(true);
        img3.setImage(new Image(ImagesUri.x));
        //   img3.setImage(new Image(getClass().getResource("../../../../../../Frame%201206.png").toExternalForm()));
        borderPane_L1.setCenter(img3);

        BorderPane.setAlignment(img1, javafx.geometry.Pos.CENTER);
        img1.setFitHeight(45.0);
        img1.setFitWidth(30.0);
        img1.setPickOnBounds(true);
        img1.setPreserveRatio(true);
        img1.setImage(new Image(ImagesUri.o));
        //   img1.setImage(new Image(getClass().getResource("../../../../../../Frame%201206.png").toExternalForm()));
        borderPane_L1.setTop(img1);

        BorderPane.setAlignment(img2, javafx.geometry.Pos.CENTER);
        img2.setFitHeight(45.0);
        img2.setFitWidth(30.0);
        img2.setPickOnBounds(true);
        img2.setPreserveRatio(true);
        img2.setImage(new Image(ImagesUri.x));
        // img2.setImage(new Image(getClass().getResource("../../../../../../Frame%201206.png").toExternalForm()));
        borderPane_L1.setLeft(img2);

        BorderPane.setAlignment(img4, javafx.geometry.Pos.CENTER);
        img4.setFitHeight(45.0);
        img4.setFitWidth(30.0);
        img4.setPickOnBounds(true);
        img4.setPreserveRatio(true);
        img4.setImage(new Image(ImagesUri.o));
        //  img4.setImage(new Image(getClass().getResource("../../../../../../Frame%201206.png").toExternalForm()));
        borderPane_L1.setRight(img4);

        BorderPane.setAlignment(img5, javafx.geometry.Pos.CENTER);
        img5.setFitHeight(45.0);
        img5.setFitWidth(30.0);
        img5.setPickOnBounds(true);
        img5.setPreserveRatio(true);
        img5.setImage(new Image(ImagesUri.o));
        //  img5.setImage(new Image(getClass().getResource("../../../../../../Frame%201206.png").toExternalForm()));
        borderPane_L1.setBottom(img5);

        GridPane.setRowIndex(pordderL2, 1);
        pordderL2.setPrefHeight(200.0);
        pordderL2.setPrefWidth(200.0);

        BorderPane.setAlignment(img7, javafx.geometry.Pos.CENTER);
        img7.setFitHeight(45.0);
        img7.setFitWidth(30.0);
        img7.setPickOnBounds(true);
        img7.setPreserveRatio(true);
        img7.setImage(new Image(ImagesUri.x));
        // img7.setImage(new Image(getClass().getResource("../../../../../../Frame%201206.png").toExternalForm()));
        pordderL2.setCenter(img7);

        BorderPane.setAlignment(img6, javafx.geometry.Pos.CENTER);
        img6.setFitHeight(45.0);
        img6.setFitWidth(30.0);
        img6.setPickOnBounds(true);
        img6.setPreserveRatio(true);
        img6.setImage(new Image(ImagesUri.o));
        // img6.setImage(new Image(getClass().getResource("../../../../../../Frame%201206.png").toExternalForm()));
        pordderL2.setLeft(img6);

        BorderPane.setAlignment(img8, javafx.geometry.Pos.CENTER);
        img8.setFitHeight(45.0);
        img8.setFitWidth(30.0);
        img8.setPickOnBounds(true);
        img8.setPreserveRatio(true);
        img8.setImage(new Image(ImagesUri.x));
        // img8.setImage(new Image(getClass().getResource("../../../../../../Frame%201206.png").toExternalForm()));
        pordderL2.setRight(img8);

        BorderPane.setAlignment(img9, javafx.geometry.Pos.CENTER);
        img9.setFitHeight(45.0);
        img9.setFitWidth(30.0);
        img9.setPickOnBounds(true);
        img9.setPreserveRatio(true);
        // img9.setImage(new Image(getClass().getResource("../../../../../../Frame%201206.png").toExternalForm()));
        pordderL2.setBottom(img9);

        GridPane.setColumnIndex(prderR1, 2);
        prderR1.setPrefHeight(200.0);
        prderR1.setPrefWidth(200.0);

        BorderPane.setAlignment(img12, javafx.geometry.Pos.CENTER);
        img12.setFitHeight(45.0);
        img12.setFitWidth(30.0);
        img12.setPickOnBounds(true);
        img12.setPreserveRatio(true);
        img12.setImage(new Image(ImagesUri.o));
        // img12.setImage(new Image(getClass().getResource("../../../../../../Frame%201206.png").toExternalForm()));
        prderR1.setCenter(img12);

        BorderPane.setAlignment(img10, javafx.geometry.Pos.CENTER);
        img10.setFitHeight(45.0);
        img10.setFitWidth(30.0);
        img10.setPickOnBounds(true);
        img10.setPreserveRatio(true);
        img10.setImage(new Image(ImagesUri.x));
        // img10.setImage(new Image(getClass().getResource("../../../../../../Frame%201206.png").toExternalForm()));
        prderR1.setTop(img10);

        BorderPane.setAlignment(img11, javafx.geometry.Pos.CENTER);
        img11.setFitHeight(45.0);
        img11.setFitWidth(30.0);
        img11.setPickOnBounds(true);
        img11.setPreserveRatio(true);
        img11.setImage(new Image(ImagesUri.o));
        //  img11.setImage(new Image(getClass().getResource("../../../../../../Frame%201206.png").toExternalForm()));
        prderR1.setLeft(img11);

        BorderPane.setAlignment(img13, javafx.geometry.Pos.CENTER);
        img13.setFitHeight(45.0);
        img13.setFitWidth(30.0);
        img13.setPickOnBounds(true);
        img13.setPreserveRatio(true);
        img13.setImage(new Image(ImagesUri.x));
        //  img13.setImage(new Image(getClass().getResource("../../../../../../Frame%201206.png").toExternalForm()));
        prderR1.setRight(img13);

        BorderPane.setAlignment(img14, javafx.geometry.Pos.CENTER);
        img14.setFitHeight(45.0);
        img14.setFitWidth(30.0);
        img14.setPickOnBounds(true);
        img14.setPreserveRatio(true);
        img14.setImage(new Image(ImagesUri.x));
        //  img14.setImage(new Image(getClass().getResource("../../../../../../Frame%201206.png").toExternalForm()));
        prderR1.setBottom(img14);

        GridPane.setColumnIndex(prderR2, 2);
        GridPane.setRowIndex(prderR2, 1);
        prderR2.setPrefHeight(200.0);
        prderR2.setPrefWidth(200.0);

        BorderPane.setAlignment(img15, javafx.geometry.Pos.CENTER);
        img15.setFitHeight(45.0);
        img15.setFitWidth(30.0);
        img15.setPickOnBounds(true);
        img15.setPreserveRatio(true);
        img15.setImage(new Image(ImagesUri.x));
        //  img15.setImage(new Image(getClass().getResource("../../../../../../Frame%201206.png").toExternalForm()));
        prderR2.setLeft(img15);

        BorderPane.setAlignment(img16, javafx.geometry.Pos.CENTER);
        img16.setFitHeight(45.0);
        img16.setFitWidth(30.0);
        img16.setPickOnBounds(true);
        img16.setPreserveRatio(true);
        img16.setImage(new Image(ImagesUri.o));
        //  img16.setImage(new Image(getClass().getResource("../../../../../../Frame%201206.png").toExternalForm()));
        prderR2.setCenter(img16);

        BorderPane.setAlignment(img17, javafx.geometry.Pos.CENTER);
        img17.setFitHeight(45.0);
        img17.setFitWidth(30.0);
        img17.setPickOnBounds(true);
        img17.setPreserveRatio(true);
        img17.setImage(new Image(ImagesUri.o));
        // img17.setImage(new Image(getClass().getResource("../../../../../../Frame%201206.png").toExternalForm()));
        prderR2.setRight(img17);

        BorderPane.setAlignment(img18, javafx.geometry.Pos.CENTER);
        img18.setFitHeight(45.0);
        img18.setFitWidth(30.0);
        img18.setPickOnBounds(true);
        img18.setPreserveRatio(true);
        // img18.setImage(new Image(ImagesUri.x));
        //   img18.setImage(new Image(getClass().getResource("../../../../../../Frame%201206.png").toExternalForm()));
        prderR2.setBottom(img18);
        setPadding(new Insets(-10.0, 0.0, 0.0, 0.0));

        getColumnConstraints().add(columnConstraints);
        getColumnConstraints().add(columnConstraints0);
        getColumnConstraints().add(columnConstraints1);
        getRowConstraints().add(rowConstraints);
        getRowConstraints().add(rowConstraints0);
        getChildren().add(imageLogo);
        vBox.getChildren().add(singleBtn);
        vBox.getChildren().add(multiBtn);
        vBox.getChildren().add(onlineBtn);
        vBox.getChildren().add(exitBtn);
        getChildren().add(vBox);
        getChildren().add(borderPane_L1);
        getChildren().add(pordderL2);
        getChildren().add(prderR1);
        getChildren().add(prderR2);

        String lightYellow = ColorPalette.lightYellow;
        String lightblue = ColorPalette.lightBlue;
        String lightRed = ColorPalette.lightRed;

        singleBtn.setStyle("-fx-text-fill: white; "
                + "-fx-font-weight: bold; "
                + "-fx-background-color:" + lightYellow + "; "
                + "-fx-background-radius: 30px;");

        multiBtn.setStyle("-fx-text-fill: white; "
                + "-fx-font-weight: bold; "
                + "-fx-background-color: #2475C5; "
                + "-fx-background-radius: 30px;");

        onlineBtn.setStyle("-fx-text-fill: white; "
                + "-fx-font-weight: bold; "
                + "-fx-background-color:" + lightblue + "; "
                + "-fx-background-radius: 30px;");

        exitBtn.setStyle("-fx-text-fill: white; "
                + "-fx-font-weight: bold; "
                + "-fx-background-color:" + lightRed + "; "
                + "-fx-background-radius: 30px;");

        singleBtn.setOnAction((event) -> {

            try {
                Navigation.openPage(ViewController.SINGLEMODEVIEWCONTROLLER, singleBtn);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        });

        /*
         singleBtn.setOnAction((event) -> {
            try {
                    Navigation.openPage(ViewController.SINGLEVIEWCONTROLLER, singleBtn);
            } catch (IOException ex) {
                Logger.getLogger(MainViewController.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
         */
        onlineBtn.setOnAction((event) -> {
            Platform.runLater(() -> {
                 try {
                Navigation.openPage(ViewController.LOGINVIEWCONTROLLER, onlineBtn);
            } catch (IOException ex) {
                Logger.getLogger(MainViewController.class.getName()).log(Level.SEVERE, null, ex);
            }
            });
           
        });

        multiBtn.setOnAction((event) -> {
            try {

                Navigation.openPage(ViewController.MULTIMODEVIEWCONTROLLER, multiBtn);
            } catch (IOException ex) {
                Logger.getLogger(MainViewController.class.getName()).log(Level.SEVERE, null, ex);
            }
        });

        exitBtn.setOnAction((event) -> {
//            Navigation.openDialog(ViewController.EXITDIALOGCONTROLLER);

            new ExitDialogController().show();
        });

    }
}
