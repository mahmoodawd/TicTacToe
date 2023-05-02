package tictactoe.main_menu.presentation;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public  class MainViewBase extends BorderPane {

    protected final VBox vBox;
    protected final Button singleBtn;
    protected final Button onloneBtn;
    protected final Button multiBtn;
    protected final Button exitBtn;
    protected final AnchorPane anchorePane;
    protected final ImageView imgeLogo;
    protected final ImageView imageView;
    protected final ImageView imageView0;
    protected final ImageView imgeO;
    protected final ImageView imgeO0;
    protected final ImageView imgeX;
    protected final AnchorPane anchorPane;
    protected final ImageView imgeX0;
    protected final AnchorPane anchorPane0;
    protected final ImageView imgX;
    protected final ImageView imgeO1;

    public MainViewBase() {

        vBox = new VBox();
        singleBtn = new Button();
        onloneBtn = new Button();
        multiBtn = new Button();
        exitBtn = new Button();
        anchorePane = new AnchorPane();
        imgeLogo = new ImageView();
        imageView = new ImageView();
        imageView0 = new ImageView();
        imgeO = new ImageView();
        imgeO0 = new ImageView();
        imgeX = new ImageView();
        anchorPane = new AnchorPane();
        imgeX0 = new ImageView();
        anchorPane0 = new AnchorPane();
        imgX = new ImageView();
        imgeO1 = new ImageView();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(395.0);
        setPrefWidth(551.0);

        BorderPane.setAlignment(vBox, javafx.geometry.Pos.CENTER);
        vBox.setAlignment(javafx.geometry.Pos.CENTER);
        vBox.setPrefHeight(130.0);
        vBox.setPrefWidth(600.0);

        singleBtn.setMnemonicParsing(false);
        singleBtn.setPrefHeight(25.0);
        singleBtn.setPrefWidth(129.0);
        singleBtn.setText("Single");
        VBox.setMargin(singleBtn, new Insets(8.0, 0.0, 0.0, 50.0));

        onloneBtn.setMnemonicParsing(false);
        onloneBtn.setPrefHeight(25.0);
        onloneBtn.setPrefWidth(132.0);
        onloneBtn.setText("Multi");
        VBox.setMargin(onloneBtn, new Insets(8.0, 0.0, 0.0, 50.0));

        multiBtn.setMnemonicParsing(false);
        multiBtn.setPrefHeight(25.0);
        multiBtn.setPrefWidth(133.0);
        multiBtn.setText("Online");
        VBox.setMargin(multiBtn, new Insets(8.0, 0.0, 0.0, 50.0));

        exitBtn.setMnemonicParsing(false);
        exitBtn.setPrefHeight(25.0);
        exitBtn.setPrefWidth(135.0);
        exitBtn.setText("Exite");
        VBox.setMargin(exitBtn, new Insets(8.0, 0.0, 0.0, 50.0));
        setBottom(vBox);

        BorderPane.setAlignment(anchorePane, javafx.geometry.Pos.CENTER);
        anchorePane.setPrefHeight(136.0);
        anchorePane.setPrefWidth(512.0);

        imgeLogo.setFitHeight(61.0);
        imgeLogo.setFitWidth(69.0);
        imgeLogo.setLayoutX(328.0);
        imgeLogo.setLayoutY(55.0);
        imgeLogo.setPickOnBounds(true);
        imgeLogo.setPreserveRatio(true);
        imgeLogo.setImage(new Image(getClass().getResource("../../../../../../Download%20(E)/Logo.png").toExternalForm()));

        imageView.setFitHeight(62.0);
        imageView.setFitWidth(70.0);
        imageView.setLayoutX(276.0);
        imageView.setLayoutY(44.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("../../../../../../Download%20(E)/Logo.png").toExternalForm()));

        imageView0.setFitHeight(66.0);
        imageView0.setFitWidth(71.0);
        imageView0.setLayoutX(224.0);
        imageView0.setLayoutY(31.0);
        imageView0.setPickOnBounds(true);
        imageView0.setPreserveRatio(true);
        imageView0.setImage(new Image(getClass().getResource("../../../../../../Download%20(E)/Logo.png").toExternalForm()));

        imgeO.setFitHeight(32.0);
        imgeO.setFitWidth(23.0);
        imgeO.setLayoutX(28.0);
        imgeO.setLayoutY(14.0);
        imgeO.setPickOnBounds(true);
        imgeO.setPreserveRatio(true);

        imgeO0.setFitHeight(32.0);
        imgeO0.setFitWidth(23.0);
        imgeO0.setLayoutX(119.0);
        imgeO0.setLayoutY(81.0);
        imgeO0.setPickOnBounds(true);
        imgeO0.setPreserveRatio(true);

        imgeX.setFitHeight(32.0);
        imgeX.setFitWidth(23.0);
        imgeX.setLayoutX(477.0);
        imgeX.setLayoutY(15.0);
        imgeX.setPickOnBounds(true);
        imgeX.setPreserveRatio(true);
        setTop(anchorePane);

        BorderPane.setAlignment(anchorPane, javafx.geometry.Pos.CENTER);
        anchorPane.setPrefHeight(68.0);
        anchorPane.setPrefWidth(200.0);

        imgeX0.setFitHeight(32.0);
        imgeX0.setFitWidth(23.0);
        imgeX0.setLayoutX(14.0);
        imgeX0.setLayoutY(70.0);
        imgeX0.setPickOnBounds(true);
        imgeX0.setPreserveRatio(true);
        setLeft(anchorPane);

        BorderPane.setAlignment(anchorPane0, javafx.geometry.Pos.CENTER);
        anchorPane0.setPrefHeight(200.0);
        anchorPane0.setPrefWidth(200.0);

        imgX.setFitHeight(32.0);
        imgX.setFitWidth(23.0);
        imgX.setLayoutX(21.0);
        imgX.setLayoutY(14.0);
        imgX.setPickOnBounds(true);
        imgX.setPreserveRatio(true);

        imgeO1.setFitHeight(32.0);
        imgeO1.setFitWidth(23.0);
        imgeO1.setLayoutX(122.0);
        imgeO1.setLayoutY(58.0);
        imgeO1.setPickOnBounds(true);
        imgeO1.setPreserveRatio(true);
        setRight(anchorPane0);

        vBox.getChildren().add(singleBtn);
        vBox.getChildren().add(onloneBtn);
        vBox.getChildren().add(multiBtn);
        vBox.getChildren().add(exitBtn);
        anchorePane.getChildren().add(imgeLogo);
        anchorePane.getChildren().add(imageView);
        anchorePane.getChildren().add(imageView0);
        anchorePane.getChildren().add(imgeO);
        anchorePane.getChildren().add(imgeO0);
        anchorePane.getChildren().add(imgeX);
        anchorPane.getChildren().add(imgeX0);
        anchorPane0.getChildren().add(imgX);
        anchorPane0.getChildren().add(imgeO1);

    }
}
