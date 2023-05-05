package winnerDialog;

import javafx.geometry.Insets;
import javafx.geometry.Rectangle2D;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import tictactoe.core.Navigation;
import tictactoe.core.PassData;
import tictactoe.core.designsystem.ColorPalette;
import tictactoe.core.designsystem.resources.ImagesUri;

public  class SingleWinnerDialogController extends GridPane {

    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final ColumnConstraints columnConstraints1;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final RowConstraints rowConstraints2;
    protected final RowConstraints rowConstraints3;
    protected final GridPane gridPane;
    protected final ColumnConstraints columnConstraints2;
    protected final ColumnConstraints columnConstraints3;
    protected final ColumnConstraints columnConstraints4;
    protected final RowConstraints rowConstraints4;
    protected final Text winnerNameTextView;
    protected final ImageView iconLeftImageView;
    protected final ImageView iconrightImageView;
    protected final Button mainMenuButton;
    protected final GridPane gridPane0;
    protected final ColumnConstraints columnConstraints5;
    protected final ColumnConstraints columnConstraints6;
    protected final RowConstraints rowConstraints5;
    protected final ImageView homeImageView;
    protected final Text text;
    protected final Button replayButton;
    protected final GridPane gridPane1;
    protected final ColumnConstraints columnConstraints7;
    protected final ColumnConstraints columnConstraints8;
    protected final RowConstraints rowConstraints6;
    protected final ImageView retryImageView;
    protected final Text text0;

    public SingleWinnerDialogController() {

        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        columnConstraints1 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        rowConstraints2 = new RowConstraints();
        rowConstraints3 = new RowConstraints();
        gridPane = new GridPane();
        columnConstraints2 = new ColumnConstraints();
        columnConstraints3 = new ColumnConstraints();
        columnConstraints4 = new ColumnConstraints();
        rowConstraints4 = new RowConstraints();
        winnerNameTextView = new Text();
        iconLeftImageView = new ImageView();
        iconrightImageView = new ImageView();
        mainMenuButton = new Button();
        gridPane0 = new GridPane();
        columnConstraints5 = new ColumnConstraints();
        columnConstraints6 = new ColumnConstraints();
        rowConstraints5 = new RowConstraints();
        homeImageView = new ImageView();
        text = new Text();
        replayButton = new Button();
        gridPane1 = new GridPane();
        columnConstraints7 = new ColumnConstraints();
        columnConstraints8 = new ColumnConstraints();
        rowConstraints6 = new RowConstraints();
        retryImageView = new ImageView();
        text0 = new Text();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(250.0);
        setPrefWidth(400.0);

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMaxWidth(128.20001220703125);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(77.0);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMaxWidth(437.79998779296875);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(421.0);

        columnConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1.setMaxWidth(195.199951171875);
        columnConstraints1.setMinWidth(10.0);
        columnConstraints1.setPrefWidth(68.79998779296875);

        rowConstraints.setMaxHeight(128.60001220703126);
        rowConstraints.setMinHeight(10.0);
        rowConstraints.setPrefHeight(46.399993896484375);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints0.setMaxHeight(276.79999008178714);
        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setPrefHeight(68.79998779296875);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints1.setMaxHeight(276.79999008178714);
        rowConstraints1.setMinHeight(10.0);
        rowConstraints1.setPrefHeight(65.6);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints2.setMaxHeight(218.99999084472654);
        rowConstraints2.setMinHeight(10.0);
        rowConstraints2.setPrefHeight(62.599951171875006);
        rowConstraints2.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints3.setMaxHeight(218.99999084472654);
        rowConstraints3.setMinHeight(10.0);
        rowConstraints3.setPrefHeight(15.400048828124994);
        rowConstraints3.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setColumnIndex(gridPane, 1);

        columnConstraints2.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints2.setMinWidth(10.0);
        columnConstraints2.setPrefWidth(100.0);

        columnConstraints3.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints3.setMinWidth(10.0);
        columnConstraints3.setPrefWidth(100.0);

        columnConstraints4.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints4.setMinWidth(10.0);
        columnConstraints4.setPrefWidth(100.0);

        rowConstraints4.setMinHeight(10.0);
        rowConstraints4.setPrefHeight(30.0);
        rowConstraints4.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setColumnIndex(winnerNameTextView, 1);
        GridPane.setHalignment(winnerNameTextView, javafx.geometry.HPos.CENTER);
        GridPane.setValignment(winnerNameTextView, javafx.geometry.VPos.CENTER);
        winnerNameTextView.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        winnerNameTextView.setStrokeWidth(0.0);
        winnerNameTextView.setText("Winner");
        winnerNameTextView.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        winnerNameTextView.setFont(new Font(24.0));

        GridPane.setHalignment(iconLeftImageView, javafx.geometry.HPos.RIGHT);
        GridPane.setValignment(iconLeftImageView, javafx.geometry.VPos.CENTER);
        iconLeftImageView.setFitHeight(30.0);
        iconLeftImageView.setFitWidth(30.0);
        iconLeftImageView.setPickOnBounds(true);
        iconLeftImageView.setPreserveRatio(true);
        GridPane.setMargin(iconLeftImageView, new Insets(0.0));
       // iconLeftImageView.setImage(new Image(getClass().getResource("../../../core/designsystem/resources/images/trophy.png").toExternalForm()));

        GridPane.setColumnIndex(iconrightImageView, 2);
        iconrightImageView.setFitHeight(30.0);
        iconrightImageView.setFitWidth(30.0);
        iconrightImageView.setPickOnBounds(true);
        iconrightImageView.setPreserveRatio(true);
        GridPane.setMargin(iconrightImageView, new Insets(0.0));
       // iconrightImageView.setImage(new Image(getClass().getResource("../../../core/designsystem/resources/images/trophy.png").toExternalForm()));

        GridPane.setColumnIndex(mainMenuButton, 1);
        GridPane.setRowIndex(mainMenuButton, 1);
        mainMenuButton.setMnemonicParsing(false);
        mainMenuButton.setPrefHeight(50.0);
        mainMenuButton.setPrefWidth(450.0);
        mainMenuButton.setFont(new Font(18.0));
        GridPane.setMargin(mainMenuButton, new Insets(20.0, 0.0, 0.0, 0.0));

        columnConstraints5.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints5.setMaxWidth(232.79998779296875);
        columnConstraints5.setMinWidth(10.0);
        columnConstraints5.setPrefWidth(132.39998779296874);

        columnConstraints6.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints6.setMaxWidth(260.0);
        columnConstraints6.setMinWidth(10.0);
        columnConstraints6.setPrefWidth(209.20001220703128);

        rowConstraints5.setMinHeight(10.0);
        rowConstraints5.setPrefHeight(30.0);
        rowConstraints5.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setHalignment(homeImageView, javafx.geometry.HPos.RIGHT);
        homeImageView.setFitHeight(30.0);
        homeImageView.setFitWidth(30.0);
        homeImageView.setPickOnBounds(true);
        homeImageView.setPreserveRatio(true);
      //  homeImageView.setImage(new Image(getClass().getResource("../../../core/designsystem/resources/images/home.png").toExternalForm()));
        GridPane.setMargin(homeImageView, new Insets(0.0, 20.0, 0.0, 0.0));

        GridPane.setColumnIndex(text, 1);
        text.setFill(javafx.scene.paint.Color.WHITE);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Main Menu");
        text.setFont(new Font(18.0));
        mainMenuButton.setGraphic(gridPane0);

        GridPane.setColumnIndex(replayButton, 1);
        GridPane.setRowIndex(replayButton, 2);
        replayButton.setAlignment(javafx.geometry.Pos.CENTER);
        replayButton.setMnemonicParsing(false);
        replayButton.setPrefHeight(50.0);
        replayButton.setPrefWidth(450.0);
        replayButton.setFont(new Font(18.0));

        columnConstraints7.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints7.setMaxWidth(211.20001220703125);
        columnConstraints7.setMinWidth(10.0);
        columnConstraints7.setPrefWidth(180.799951171875);

        columnConstraints8.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints8.setMaxWidth(254.4000244140625);
        columnConstraints8.setMinWidth(10.0);
        columnConstraints8.setPrefWidth(252.80004882812503);

        rowConstraints6.setMinHeight(10.0);
        rowConstraints6.setPrefHeight(30.0);
        rowConstraints6.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setHalignment(retryImageView, javafx.geometry.HPos.RIGHT);
        retryImageView.setFitHeight(30.0);
        retryImageView.setFitWidth(30.0);
        retryImageView.setPickOnBounds(true);
        retryImageView.setPreserveRatio(true);
      //  retryImageView.setImage(new Image(getClass().getResource("../../../core/designsystem/resources/images/retry.png").toExternalForm()));
        GridPane.setMargin(retryImageView, new Insets(0.0, 20.0, 0.0, 0.0));

        GridPane.setColumnIndex(text0, 1);
        text0.setFill(javafx.scene.paint.Color.WHITE);
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("Replay");
        text0.setFont(new Font(18.0));
        replayButton.setGraphic(gridPane1);
        GridPane.setMargin(replayButton, new Insets(0.0, 0.0, -70.0, 0.0));

        getColumnConstraints().add(columnConstraints);
        getColumnConstraints().add(columnConstraints0);
        getColumnConstraints().add(columnConstraints1);
        getRowConstraints().add(rowConstraints);
        getRowConstraints().add(rowConstraints0);
        getRowConstraints().add(rowConstraints1);
        getRowConstraints().add(rowConstraints2);
        getRowConstraints().add(rowConstraints3);
        gridPane.getColumnConstraints().add(columnConstraints2);
        gridPane.getColumnConstraints().add(columnConstraints3);
        gridPane.getColumnConstraints().add(columnConstraints4);
        gridPane.getRowConstraints().add(rowConstraints4);
        gridPane.getChildren().add(winnerNameTextView);
        gridPane.getChildren().add(iconLeftImageView);
        gridPane.getChildren().add(iconrightImageView);
        getChildren().add(gridPane);
        gridPane0.getColumnConstraints().add(columnConstraints5);
        gridPane0.getColumnConstraints().add(columnConstraints6);
        gridPane0.getRowConstraints().add(rowConstraints5);
        gridPane0.getChildren().add(homeImageView);
        gridPane0.getChildren().add(text);
        getChildren().add(mainMenuButton);
        gridPane1.getColumnConstraints().add(columnConstraints7);
        gridPane1.getColumnConstraints().add(columnConstraints8);
        gridPane1.getRowConstraints().add(rowConstraints6);
        gridPane1.getChildren().add(retryImageView);
        gridPane1.getChildren().add(text0);
        getChildren().add(replayButton);

        
   String winnerName  = PassData.getInstance().winnerName.get();
        winnerNameTextView.setText(winnerName);
        
        mainMenuButton.setStyle("-fx-background-color: "+ColorPalette.lightBlue+"; -fx-background-radius: 15px;");
         replayButton.setStyle("-fx-background-color: "+ColorPalette.lightRed+"; -fx-background-radius: 15px;");
       //  watchMovesButton.setStyle("-fx-background-color: "+ColorPalette.lightYellow+"; -fx-background-radius: 15px;");
            if( winnerName != "draw" ){
           iconLeftImageView.setImage(new Image(ImagesUri.trophy));
           iconrightImageView.setImage(new Image(ImagesUri.trophy)); 
            } 
            
            homeImageView.setImage(new Image(ImagesUri.home));
            retryImageView.setImage(new Image(ImagesUri.retry));
           // cameraImageView.setImage(new Image(ImagesUri.camera));
            actions();
            
          
    }
    
    
    private void actions()
    {
          mainMenuButton.setOnAction((event) -> {
            
              
                 setReturnAndClose("main");
            });
            
            
             replayButton.setOnAction((event) -> {
            
       
                 setReturnAndClose("replay");
            
            });
             
            
    }
    
    
    private void setReturnAndClose(String dialogReturn)
    {
            PassData.getInstance().dialogReturn.set("");
            PassData.getInstance().dialogReturn.set(dialogReturn);
            Navigation.closePage(this);
    }
}
