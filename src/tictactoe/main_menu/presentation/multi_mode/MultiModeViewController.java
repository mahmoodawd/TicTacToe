 
package tictactoe.main_menu.presentation.multi_mode;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.Blend;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import tictactoe.core.Navigation;
import tictactoe.core.ViewController;
import tictactoe.core.designsystem.ColorPalette;
import tictactoe.core.designsystem.resources.ImagesUri;
//import tictactoe.core.PassData;

public  class MultiModeViewController extends GridPane {
 MultiModeViewModel viewModel= null;
    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
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
    protected final RowConstraints rowConstraints16;
    protected final RowConstraints rowConstraints17;
    protected final RowConstraints rowConstraints18;
    protected final RowConstraints rowConstraints19;
    protected final RowConstraints rowConstraints110;
    protected final RowConstraints rowConstraints111;
    protected final Text multitxt;
    protected final Text usernameTxt;
    protected final ColorAdjust colorAdjust;
    protected final TextField usernameField;
    protected final ImageView imageFrame;
    protected final Button startBtn;
    protected final Label MotivatWord;
    protected final Blend blend;
    protected final Label player2;
    protected final TextField textField2;
    protected final ImageView multiImage;

    public MultiModeViewController(MultiModeViewModel viewModel) {
this.viewModel=viewModel;
        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
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
        rowConstraints16 = new RowConstraints();
        rowConstraints17 = new RowConstraints();
        rowConstraints18 = new RowConstraints();
        rowConstraints19 = new RowConstraints();
        rowConstraints110 = new RowConstraints();
        rowConstraints111 = new RowConstraints();
        multitxt = new Text();
        usernameTxt = new Text();
        colorAdjust = new ColorAdjust();
        usernameField = new TextField();
        imageFrame = new ImageView();
        startBtn = new Button();
        MotivatWord = new Label();
        blend = new Blend();
        player2 = new Label();
        textField2 = new TextField();
        multiImage = new ImageView();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0);
        setPrefWidth(600.0);
        setStyle("-fx-background-color: #FFFFFF;");

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(100.0);

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

        rowConstraints16.setMinHeight(10.0);
        rowConstraints16.setPrefHeight(30.0);
        rowConstraints16.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints17.setMinHeight(10.0);
        rowConstraints17.setPrefHeight(30.0);
        rowConstraints17.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints18.setMinHeight(10.0);
        rowConstraints18.setPrefHeight(30.0);
        rowConstraints18.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints19.setMinHeight(10.0);
        rowConstraints19.setPrefHeight(30.0);
        rowConstraints19.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints110.setMinHeight(10.0);
        rowConstraints110.setPrefHeight(30.0);
        rowConstraints110.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints111.setMinHeight(10.0);
        rowConstraints111.setPrefHeight(30.0);
        rowConstraints111.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setColumnIndex(multitxt, 1);
        GridPane.setHalignment(multitxt, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(multitxt, 3);
        multitxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        multitxt.setStrokeWidth(0.0);
        multitxt.setText("Multi Player");
        multitxt.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        multitxt.setFont(new Font("Arial Bold", 24.0));

        GridPane.setColumnIndex(usernameTxt, 1);
        GridPane.setHalignment(usernameTxt, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(usernameTxt, 10);
        usernameTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        usernameTxt.setStrokeWidth(0.0);
        usernameTxt.setText("Player Name 1 ");
        usernameTxt.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        usernameTxt.setWrappingWidth(147.0703125);
        usernameTxt.setFont(new Font("Arial Bold", 18.0));

        colorAdjust.setBrightness(-0.14);
        usernameTxt.setEffect(colorAdjust);

        GridPane.setColumnIndex(usernameField, 1);
        GridPane.setRowIndex(usernameField, 12);
        usernameField.setPrefHeight(26.0);
        usernameField.setPrefWidth(438.0);
        GridPane.setMargin(usernameField, new Insets(0.0, 190.0, 0.0, 190.0));

        GridPane.setColumnIndex(imageFrame, 1);
        GridPane.setRowIndex(imageFrame, 3);
        imageFrame.setFitHeight(46.0);
        imageFrame.setFitWidth(60.0);
        imageFrame.setPickOnBounds(true);
        imageFrame.setPreserveRatio(true);
        GridPane.setMargin(imageFrame, new Insets(0.0, 0.0, 0.0, 120.0));
       // imageFrame.setImage(new Image(getClass().getResource("imageb").toExternalForm()));

        GridPane.setColumnIndex(startBtn, 1);
        GridPane.setHalignment(startBtn, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(startBtn, 19);
        startBtn.setMnemonicParsing(false);
        startBtn.setPrefHeight(25.0);
        startBtn.setPrefWidth(143.0);
        startBtn.setText("Start");

        GridPane.setColumnIndex(MotivatWord, 1);
        GridPane.setHalignment(MotivatWord, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(MotivatWord, 1);
        MotivatWord.setPrefHeight(20.0);
        MotivatWord.setPrefWidth(332.0);
        MotivatWord.setText("Get ready for some friendly competition - let's play!");
        MotivatWord.setTextFill(javafx.scene.paint.Color.valueOf("#361818"));
        MotivatWord.setFont(new Font("Nirmala UI", 14.0));
  startBtn.setStyle("-fx-background-color: "+ColorPalette.lightBlue+"; -fx-background-radius: 30px;"); 
        MotivatWord.setEffect(blend);

        GridPane.setColumnIndex(player2, 1);
        GridPane.setHalignment(player2, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(player2, 14);
        player2.setPrefHeight(17.0);
        player2.setPrefWidth(177.0);
        player2.setText("   Player Name 2");
        player2.setFont(new Font("Arial Bold", 18.0));

        GridPane.setColumnIndex(textField2, 1);
        GridPane.setRowIndex(textField2, 16);
        textField2.setPrefHeight(25.0);
        textField2.setPrefWidth(546.0);
        GridPane.setMargin(textField2, new Insets(0.0, 190.0, 0.0, 190.0));

        GridPane.setColumnIndex(multiImage, 1);
        GridPane.setHalignment(multiImage, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(multiImage, 6);
        multiImage.setFitHeight(63.0);
        multiImage.setFitWidth(84.0);
        multiImage.setPickOnBounds(true);
        multiImage.setPreserveRatio(true);
          imageFrame.setImage(new Image(ImagesUri.retry));
         multiImage.setImage(new Image(ImagesUri.retry));
       // multiImage.setImage(new Image(getClass().getResource("../../../../Multi_player.jpg").toExternalForm()));
        GridPane.setMargin(multiImage, new Insets(0.0));

        getColumnConstraints().add(columnConstraints);
        getColumnConstraints().add(columnConstraints0);
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
        getRowConstraints().add(rowConstraints16);
        getRowConstraints().add(rowConstraints17);
        getRowConstraints().add(rowConstraints18);
        getRowConstraints().add(rowConstraints19);
        getRowConstraints().add(rowConstraints110);
        getRowConstraints().add(rowConstraints111);
        getChildren().add(multitxt);
        getChildren().add(usernameTxt);
        getChildren().add(usernameField);
        getChildren().add(imageFrame);
        getChildren().add(startBtn);
        getChildren().add(MotivatWord);
        getChildren().add(player2);
        getChildren().add(textField2);
        getChildren().add(multiImage);

        
        
        
        
        
        
        
        
        
        
        
      
        
        imageFrame.addEventHandler(MouseEvent.MOUSE_CLICKED, event-> {
   
       
            try {
                Navigation.openPage(ViewController.SINGLEPLAYERVIEWCONTROLLER, this);
            } catch (IOException ex) {
                Logger.getLogger(MultiModeViewController.class.getName()).log(Level.SEVERE, null, ex);
            }
  
});

        
    }
}
