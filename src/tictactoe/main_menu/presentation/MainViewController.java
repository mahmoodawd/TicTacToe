package tictactoe.main_menu.presentation;


import tictacktoe_sigle_mode_presentation.SingleViewModel;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import static javafx.scene.layout.Region.USE_PREF_SIZE;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.SVGPath;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import tictactoe.core.Navigation;
import tictactoe.core.ViewController;
import tictactoe.core.designsystem.ColorPalette;
import tictactoe.core.designsystem.Typography;
import tictactoe.core.designsystem.resources.ImagesUri;







public  class  MainViewController extends BorderPane {
private MainViewModel viewModel= null;  

 
  protected final VBox vBox;
    protected final Button singleBtn;
    protected final Button multiBtn;
    protected final Button onlineBtn;
    protected final Button exitBtn;
    protected final AnchorPane anchorePane;
    protected final ImageView imgeLogo1;
    protected final ImageView imageLogo2;
    protected final ImageView imageLogo3;
    protected final ImageView imgeO;
    protected final ImageView imgeO0;
    protected final ImageView imgeX;
    protected final AnchorPane anchorPane;
    protected final ImageView imgeX0;
    protected final AnchorPane anchorPane0;
    protected final ImageView imgX;
    protected final ImageView imgeO1;


public MainViewController(MainViewModel viewModel)  { 
  
       vBox = new VBox();
        singleBtn = new Button();
        multiBtn = new Button();
        onlineBtn = new Button();
        exitBtn = new Button();
        anchorePane = new AnchorPane();
        imgeLogo1 = new ImageView();
        imageLogo2 = new ImageView();
        imageLogo3 = new ImageView();
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

        multiBtn.setMnemonicParsing(false);
        multiBtn.setPrefHeight(25.0);
        multiBtn.setPrefWidth(132.0);
        multiBtn.setText("Multi");
        VBox.setMargin(multiBtn, new Insets(8.0, 0.0, 0.0, 50.0));

        onlineBtn.setMnemonicParsing(false);
        onlineBtn.setPrefHeight(25.0);
        onlineBtn.setPrefWidth(133.0);
        onlineBtn.setText("Online");
        VBox.setMargin(onlineBtn, new Insets(8.0, 0.0, 0.0, 50.0));

        exitBtn.setMnemonicParsing(false);
        exitBtn.setPrefHeight(25.0);
        exitBtn.setPrefWidth(135.0);
        exitBtn.setText("Exite");
        VBox.setMargin(exitBtn, new Insets(8.0, 0.0, 0.0, 50.0));
        setBottom(vBox);

        BorderPane.setAlignment(anchorePane, javafx.geometry.Pos.CENTER);
        anchorePane.setPrefHeight(136.0);
        anchorePane.setPrefWidth(512.0);

        imgeLogo1.setFitHeight(61.0);
        imgeLogo1.setFitWidth(69.0);
        imgeLogo1.setLayoutX(328.0);
        imgeLogo1.setLayoutY(55.0);
        imgeLogo1.setPickOnBounds(true);
        imgeLogo1.setPreserveRatio(true);
      
       
      imgeLogo1.setImage(new Image(ImagesUri.logo));
        imageLogo2.setFitHeight(62.0);
        imageLogo2.setFitWidth(70.0);
        imageLogo2.setLayoutX(276.0);
        imageLogo2.setLayoutY(44.0);
        imageLogo2.setPickOnBounds(true);
        imageLogo2.setPreserveRatio(true);
     
      
  imageLogo2.setImage(new Image(ImagesUri.logo));
        imageLogo3.setFitHeight(66.0);
        imageLogo3.setFitWidth(71.0);
        imageLogo3.setLayoutX(224.0);
        imageLogo3.setLayoutY(31.0);
        imageLogo3.setPickOnBounds(true);
        imageLogo3.setPreserveRatio(true);
      
    imageLogo3.setImage(new Image(ImagesUri.logo));
           
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
 imgeO0.setImage(new Image(ImagesUri.oPNG)); 
 
        imgeX.setFitHeight(32.0);
        imgeX.setFitWidth(23.0);
        imgeX.setLayoutX(477.0);
        imgeX.setLayoutY(15.0);
        imgeX.setPickOnBounds(true);
        imgeX.setPreserveRatio(true);
         imgeX.setImage(new Image(ImagesUri.xPNG));
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
        imgeX0.setImage(new Image(ImagesUri.xPNG));
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
         imgeO1.setImage(new Image(ImagesUri.oPNG));
        setRight(anchorPane0);

        vBox.getChildren().add(singleBtn);
        vBox.getChildren().add(multiBtn);
        vBox.getChildren().add(onlineBtn);
        vBox.getChildren().add(exitBtn);
        anchorePane.getChildren().add(imgeLogo1);
        anchorePane.getChildren().add(imageLogo2);
        anchorePane.getChildren().add(imageLogo3);
        anchorePane.getChildren().add(imgeO);
        anchorePane.getChildren().add(imgeO0);
        anchorePane.getChildren().add(imgeX);
        anchorPane.getChildren().add(imgeX0);
        anchorPane0.getChildren().add(imgX);
        anchorPane0.getChildren().add(imgeO1);

        
   
        singleBtn.setStyle("-fx-background-color: "+ColorPalette.lightYellow+"; -fx-background-radius: 30px;");
        multiBtn.setStyle("-fx-background-color: "+ColorPalette.darkBlue+"; -fx-background-radius: 30px;");
        onlineBtn.setStyle("-fx-background-color: "+ColorPalette.lightBlue+"; -fx-background-radius: 30px;");
        exitBtn.setStyle("-fx-background-color: "+ColorPalette.darkRed+"; -fx-background-radius: 30px;");
      
        


        
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
            try {
                    Navigation.openPage(ViewController.ONLINEVIEWCONTROLLER, onlineBtn);
            } catch (IOException ex) {
                Logger.getLogger(MainViewController.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
             /*
             multiBtn.setOnAction((event) -> {
            try {
                    Navigation.openPage(ViewController.MULTIVIEWCONTROLLER, multiBtn);
            } catch (IOException ex) {
                Logger.getLogger(MainViewController.class.getName()).log(Level.SEVERE, null, ex);
            }
        });   
*/
             
             exitBtn.setOnAction((event) -> {
                 Navigation.closePage(exitBtn);
        });
             
            

         

    }
}
 

