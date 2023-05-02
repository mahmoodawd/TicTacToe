
package tictactoe.core.designsystem;

import javafx.scene.text.Font;
import tictactoe.main_menu.presentation.TicTacToe;

public class Typography {
    
    static int headerSize = 24; 
    static int subtitle1 = 18;
    static int subtitle2 = 16;
    static int body1 = 14;
    static int body2 = 12;
    
    
    static String boldRef  =  "/tictactoe/core/designsystem/resources/fonts/Roboto-Bold.ttf";
    static String mediumRef = "/tictactoe/core/designsystem/resources/fonts/Roboto-Medium.ttf";
    static String regularRef = "/tictactoe/core/designsystem/resources/fonts/Roboto-Regular.ttf";
    
    
public  static   Font  headerBoldFont = Font.loadFont(
      TicTacToe.class.getResource(boldRef).toExternalForm(),headerSize);

public  static   Font  headerMediumFont =   Font.loadFont(
      TicTacToe.class.getResource(mediumRef).toExternalForm(),headerSize);

public  static   Font  subtitleOneRegularFont =   Font.loadFont(
      TicTacToe.class.getResource(regularRef).toExternalForm(),subtitle1 );

public  static   Font  subtitleOneMediumFont =   Font.loadFont(
      TicTacToe.class.getResource(mediumRef).toExternalForm(),subtitle1 );


public  static   Font  subtitleTwoRegularFont =   Font.loadFont(
      TicTacToe.class.getResource(regularRef).toExternalForm(),subtitle2 );

public  static   Font  subtitleTwoMediumFont =   Font.loadFont(
      TicTacToe.class.getResource(mediumRef).toExternalForm(),subtitle2 );


public  static   Font  bodyOneRegularFont =   Font.loadFont(
      TicTacToe.class.getResource(regularRef).toExternalForm(),body1 );


public  static   Font  BodyOneRegularFont =   Font.loadFont(
      TicTacToe.class.getResource(mediumRef).toExternalForm(),body1 );


public  static   Font  bodyTwoRegularFont =   Font.loadFont(
      TicTacToe.class.getResource(regularRef).toExternalForm(),body2);
     


    
   
}
