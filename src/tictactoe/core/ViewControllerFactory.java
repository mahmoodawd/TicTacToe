
package tictactoe.core;


import tictactoe.multiplayer.presentation.MultiPlayerViewModel;
import tictactoe.authentication.login.presentation.LoginViewController;
import tictactoe.authentication.login.presentation.LoginViewModel;
import tictactoe.authentication.registration.RegistrationViewController;
import tictactoe.authentication.registration.RegistrationViewModel;
import tictactoe.available_players.presentation.AvailablePlayersViewController;
import tictactoe.available_players.presentation.AvailablePlayersViewModel;
import tictactoe.main_menu.presentation.MainViewController;
import tictactoe.main_menu.presentation.MainViewModel;
import tictactoe.multiplayer.presentation.MultiPlayerController;
import tictactoe.online_mode.presentation.OnlineViewController;
import tictactoe.online_mode.presentation.OnlineViewModel;
import tictactoe.online_mode.presentation.menu_dialog.MenuDialogController;
import tictactoe.online_mode.presentation.winner_dialog.WinnerDialogController;

public class ViewControllerFactory {

    public static Object getViewController(ViewController viewController)
    {
        Object viewModel = ViewModelFactory.getViewModel(viewController);
        
        switch(viewController)
        {
        
            case MAINVIEWCONTROLLER :{
            
              return new MainViewController((MainViewModel)viewModel);
         
            }
            
            case ONLINEVIEWCONTROLLER:{
                return new OnlineViewController((OnlineViewModel)viewModel);
            }
            
            
             case MENUDIALOGCONTROLLER:{
                return new MenuDialogController();
            }
             
             
              case WINNERDIALOGCNTROLLER:{
                return new WinnerDialogController();
            }
              
              
              case REGISTRATIONVIEWCONTROLLER:{
                return new RegistrationViewController((RegistrationViewModel) viewModel);
            }
              
              case LOGINVIEWCONTROLLER:{
                return new LoginViewController((LoginViewModel) viewModel);
            }
              
              
         case AVAILABLEPLAYERSVIEWCONTROLLER:{
                return new AvailablePlayersViewController((AvailablePlayersViewModel)viewModel);
            }   
         
         
         case MULTIVIEWCONTROLLER:{
                return new MultiPlayerController((MultiPlayerViewModel)viewModel);
            }  
            
           
            
            
            //todo add your own controller name in enum class and add your case here
            
            
            default:{
                 return new MainViewController((MainViewModel)viewModel);
            }
        
        
        }
       
    
    }
    
    
}
