package tictactoe.main_menu.presentation;



import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import static javafx.scene.layout.Region.USE_PREF_SIZE;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import tictactoe.core.Navigation;
import tictactoe.core.ViewController;
import tictactoe.core.designsystem.ColorPalette;
import tictactoe.core.designsystem.resources.ImagesUri;
import tictactoe.main_menu.presentation.exit_dialog.ExitDialogContoller;







public  class  MainViewController extends BorderPane {
private MainViewModel viewModel= null;  

 
  protected final VBox vBox;
    protected final Button singleButton;
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
        singleButton = new Button();
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
        setPrefHeight(600.0);
        setPrefWidth(800.0);

        BorderPane.setAlignment(vBox, javafx.geometry.Pos.CENTER);
        vBox.setAlignment(javafx.geometry.Pos.CENTER);
        vBox.setPrefHeight(130.0);
        vBox.setPrefWidth(600.0);

         singleButton.setMnemonicParsing(false);
         singleButton.setPrefHeight(25.0);
         singleButton.setPrefWidth(130.0);
         singleButton.setText("Single");
        VBox.setMargin( singleButton, new Insets(8.0, 0.0, 0.0, 50.0));

        multiBtn.setMnemonicParsing(false);
        multiBtn.setPrefHeight(25.0);
        multiBtn.setPrefWidth(130.0);
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
        exitBtn.setText("Exit");
        VBox.setMargin(exitBtn, new Insets(8.0, 0.0, 0.0, 50.0));
        setBottom(vBox);

        BorderPane.setAlignment(anchorePane, javafx.geometry.Pos.CENTER);
        anchorePane.setPrefHeight(136.0);
        anchorePane.setPrefWidth(512.0);

      
       
      
        imageLogo3.setFitHeight(150);
        imageLogo3.setFitWidth(100);
        imageLogo3.setLayoutX(300.0);
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
 imgeO0.setImage(new Image(ImagesUri.o)); 
 
        imgeX.setFitHeight(32.0);
        imgeX.setFitWidth(23.0);
        imgeX.setLayoutX(477.0);
        imgeX.setLayoutY(15.0);
        imgeX.setPickOnBounds(true);
        imgeX.setPreserveRatio(true);
         imgeX.setImage(new Image(ImagesUri.o));
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
        imgeX0.setImage(new Image(ImagesUri.x));
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
         imgeO1.setImage(new Image(ImagesUri.o));
        setRight(anchorPane0);

        vBox.getChildren().add( singleButton);
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

        
   
         singleButton.setStyle("-fx-background-color: "+ColorPalette.lightYellow+"; -fx-background-radius: 30px;");
        multiBtn.setStyle("-fx-background-color: "+ColorPalette.lightGreen+"; -fx-background-radius: 30px;");
        onlineBtn.setStyle("-fx-background-color: "+ColorPalette.lightBlue+"; -fx-background-radius: 30px;");
        exitBtn.setStyle("-fx-background-color: "+ColorPalette.lightYellow+"; -fx-background-radius: 30px;");
      
        
 singleButton.setOnAction((event) -> {

        try { 
            Navigation.openPage(ViewController.SINGLEMODEVIEWCONTROLLER,  singleButton);
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
            try {
                    Navigation.openPage(ViewController.LOGINVIEWCONTROLLER, onlineBtn);
            } catch (IOException ex) {
                Logger.getLogger(MainViewController.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
             
             multiBtn.setOnAction((event) -> {
            try {
                
                    Navigation.openPage(ViewController.MULTIMODEVIEWCONTROLLER, multiBtn);
            } catch (IOException ex) {
                Logger.getLogger(MainViewController.class.getName()).log(Level.SEVERE, null, ex);
            }
        });   

             exitBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ExitDialogContoller dialog = new ExitDialogContoller();
                Scene dialogScene = new Scene(dialog, 400, 200);
                Stage dialogStage = new Stage();
                dialogStage.initModality(Modality.APPLICATION_MODAL);
                dialogStage.setScene(dialogScene);
                dialogStage.show(); 
                
            }
        });
         
            

         

    }
}
 

