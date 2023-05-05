package  tictactoe.main_menu.presentation.single_mode;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
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

public  class SingleModeViewController extends GridPane {
SingleModeViewModel viewModel= null;
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
    protected final Text singleText;
    protected final Text usernameTxt;
    protected final ColorAdjust colorAdjust;
    protected final TextField usernameField;
    protected final ImageView imageFrame;
    protected final GridPane gridPane;
    protected final ColumnConstraints columnConstraints1;
    protected final ColumnConstraints columnConstraints2;
    protected final ColumnConstraints columnConstraints3;
    protected final RowConstraints rowConstraints112;
    protected final Button startBtn;
    protected final Label MotvitText;
    protected final Blend blend;
    protected final ImageView imge_single;

    public SingleModeViewController(SingleModeViewModel viewModel) {
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
        singleText = new Text();
        usernameTxt = new Text();
        colorAdjust = new ColorAdjust();
        usernameField = new TextField();
        imageFrame = new ImageView();
        gridPane = new GridPane();
        columnConstraints1 = new ColumnConstraints();
        columnConstraints2 = new ColumnConstraints();
        columnConstraints3 = new ColumnConstraints();
        rowConstraints112 = new RowConstraints();
        startBtn = new Button();
        MotvitText = new Label();
        blend = new Blend();
        imge_single = new ImageView();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0);
        setPrefWidth(600.0);
        setStyle("-fx-background-color: #FFFFFF;");
             imageFrame.setImage(new Image(ImagesUri.retry));

        
 imge_single.setImage(new Image(ImagesUri.logo));
         startBtn.setStyle("-fx-background-color: "+ColorPalette.lightBlue+"; -fx-background-radius: 30px;"); 
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

        GridPane.setColumnIndex(singleText, 1);
        GridPane.setHalignment(singleText, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(singleText, 3);
        singleText.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        singleText.setStrokeWidth(0.0);
        singleText.setText("Single Player");
        singleText.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        singleText.setFont(new Font("Arial Bold", 36.0));

        GridPane.setColumnIndex(usernameTxt, 1);
        GridPane.setHalignment(usernameTxt, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(usernameTxt, 10);
        usernameTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        usernameTxt.setStrokeWidth(0.0);
        usernameTxt.setText("Player Name");
        usernameTxt.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        usernameTxt.setFont(new Font("Arial Bold Italic", 18.0));

        colorAdjust.setBrightness(-0.14);
        usernameTxt.setEffect(colorAdjust);

        GridPane.setColumnIndex(usernameField, 1);
        GridPane.setHalignment(usernameField, javafx.geometry.HPos.CENTER);
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

        GridPane.setColumnIndex(gridPane, 1);
        GridPane.setRowIndex(gridPane, 20);

        columnConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1.setMinWidth(10.0);
        columnConstraints1.setPrefWidth(100.0);

        columnConstraints2.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints2.setMaxWidth(193.5999755859375);
        columnConstraints2.setMinWidth(10.0);
        columnConstraints2.setPrefWidth(184.00002441406252);

        columnConstraints3.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints3.setMaxWidth(240.79997558593743);
        columnConstraints3.setMinWidth(10.0);
        columnConstraints3.setPrefWidth(240.79997558593743);

        rowConstraints112.setMinHeight(10.0);
        rowConstraints112.setPrefHeight(30.0);
        rowConstraints112.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setColumnIndex(startBtn, 1);
        GridPane.setHalignment(startBtn, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(startBtn, 15);
        startBtn.setMnemonicParsing(false);
        startBtn.setPrefHeight(25.0);
        startBtn.setPrefWidth(143.0);
        startBtn.setText("Start");

        GridPane.setColumnIndex(MotvitText, 1);
        GridPane.setHalignment(MotvitText, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(MotvitText, 1);
        MotvitText.setPrefHeight(20.0);
        MotvitText.setPrefWidth(332.0);
        MotvitText.setText("Get ready for some friendly competition - let's play!");
        MotvitText.setTextFill(javafx.scene.paint.Color.valueOf("#361818"));
        MotvitText.setFont(new Font("Nirmala UI", 14.0));

        MotvitText.setEffect(blend);

        GridPane.setColumnIndex(imge_single, 1);
        GridPane.setHalignment(imge_single, javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(imge_single, 6);
        imge_single.setFitHeight(60.0);
        imge_single.setFitWidth(500.0);
        imge_single.setPickOnBounds(true);
        imge_single.setPreserveRatio(true);
    
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
        getChildren().add(singleText);
        getChildren().add(usernameTxt);
        getChildren().add(usernameField);
        getChildren().add(imageFrame);
        gridPane.getColumnConstraints().add(columnConstraints1);
        gridPane.getColumnConstraints().add(columnConstraints2);
        gridPane.getColumnConstraints().add(columnConstraints3);
        gridPane.getRowConstraints().add(rowConstraints112);
        getChildren().add(gridPane);
        getChildren().add(startBtn);
        getChildren().add(MotvitText);
        getChildren().add(imge_single); 
        // MotvitText.setStyle("-fx-background-color: "+ColorPalette.lightRed); 
       // MotvitText.setStyle("-fx-background-color: yellow");
        /*
         imageFrame.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
            try {
               Stage stage =  Navigation.openPage(ViewController.MAINVIEWCONTROLLER,null);
               PassData.getInstance()
                    .menuDialogReturn.addListener(new ChangeListener<Boolean>() {
                @Override
                public void changed(ObservableValue<? extends Boolean> observable
                        , Boolean oldValue, Boolean newValue) {  
                    if(newValue != null){
                      ((Stage) stage.getScene().getWindow()).close();

                    }
                }
       

    }); 
            } catch (IOException ex) {
                Logger.getLogger(SingleVieweController.class.getName()).log(Level.SEVERE, null, ex);
            }
     });
        */ 
        
        
        
        
        // Assuming this code is in the SingleVieweController class

// Add a button to the UI that triggers the transition


// Add the button to the UI
//parentContainer.getChildren().add(backButton);

        
        startBtn.setOnAction(event -> {
    String name = usernameField.getText();
    if (name.isEmpty()) {
        // If the name field is empty, show an error message
        Alert alert = new Alert(AlertType.ERROR);
        alert.setContentText("Please enter your name.");
        alert.showAndWait();
    } else if (name.length() < 5) {
        // If the name is less than 5 characters long, show an error message
        Alert alert = new Alert(AlertType.ERROR);
        alert.setContentText("Name must be at least 5 characters long.");
        alert.showAndWait();
    } else {
        // If the name is valid, do something with it
        System.out.println("Hello, " + name + "!");
    }
}); 

        

    }
}
