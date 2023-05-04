package tictactoe.core;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import tictactoe.online_multi_player.presentation.OnlineViewController;


public class Navigation {
    
    public static void openDialog(Object dialog)
    {
    
    
       Scene dialogScene = new Scene((Parent)dialog, 400, 300);
              Stage dialogStage = new Stage();
              dialogStage.initModality(Modality.APPLICATION_MODAL);
              dialogStage.setScene(dialogScene);
              dialogStage.initStyle(StageStyle.UNDECORATED);
              dialogStage.show();
    }
  
    public static void closePage(Node node)
    {
          Stage stage = (Stage) node.getScene().getWindow();
         stage.close();
    
    }
    
    public  static Stage openPage(ViewController viewController,Node node) throws IOException
    {
      
        
        Object viewControllerObject =  ViewControllerFactory.getViewController(viewController);
        if(node != null){   
           closePage(node);
        }
     
        Scene scene = null ;
        Parent root = null ;
        root = (Parent)viewControllerObject;
        Stage stage = new Stage();
        stage.setMaxWidth(800);
        stage.setMaxHeight(600);
        stage.setTitle(viewControllerObject.getClass().getSimpleName());
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    return stage;
    }

   
    
}
