
package tictactoe.core;


import tictactoe.multi_player.presentation.MultiPlayerViewModel;
import tictactoe.authentication.login.presentation.LoginViewController;
import tictactoe.authentication.login.presentation.LoginViewModel;
import tictactoe.authentication.registration.presentation.RegistrationViewController;
import tictactoe.authentication.registration.presentation.RegistrationViewModel;
import tictactoe.available_players.presentation.AvailablePlayersViewController;
import tictactoe.available_players.presentation.AvailablePlayersViewModel;
import tictactoe.main_menu.presentation.MainViewController;
import tictactoe.main_menu.presentation.MainViewModel;
import tictactoe.main_menu.presentation.multi_mode.MultiModeViewController;
import tictactoe.main_menu.presentation.multi_mode.MultiModeViewModel;
import tictactoe.main_menu.presentation.single_mode.SingleModeViewController;
import tictactoe.main_menu.presentation.single_mode.SingleModeViewModel;
import tictactoe.multi_player.presentation.MultiPlayerViewController;
import tictactoe.online_multi_player.presentation.OnlineMultiPlayerViewController;
import tictactoe.online_multi_player.presentation.OnlineMultiPlayerViewModel;
import tictactoe.online_multi_player.presentation.menu_dialog.MenuDialogController;
import tictactoe.online_multi_player.presentation.winner_dialog.MultiPlayerWinnerDialogController;
import tictactoe.single_player.presentation.SinglePlayerController;
import tictactoe.single_player.presentation.SinglePlayerViewModel;
import tictactoe.single_player.presentation.winnerDialog.SingleWinnerDialogController;



public class ViewControllerFactory {

    public static Object getViewController(ViewController viewController)
    {
        Object viewModel = ViewModelFactory.getViewModel(viewController);
        
        switch(viewController)
        {
        
            case MAINVIEWCONTROLLER :{
            
              return new MainViewController((MainViewModel)viewModel);
         
            }
            
            case ONLINEMULTIPLAYERVIEWCONTROLLER:{
                return new OnlineMultiPlayerViewController((OnlineMultiPlayerViewModel)viewModel);
            }
            
            
             case MENUDIALOGCONTROLLER:{
                return new MenuDialogController();
            }
             
             
              case WINNERDIALOGCNTROLLER:{
                return new MultiPlayerWinnerDialogController();
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
         
         
         case MULTIMODEVIEWCONTROLLER:{
                return new MultiModeViewController((MultiModeViewModel)viewModel);
            } 
         
         
           case SINGLEMODEVIEWCONTROLLER:{
                return new SingleModeViewController((SingleModeViewModel)viewModel);
            }  
         
         
             case SINGLEPLAYERVIEWCONTROLLER:{
                return new SinglePlayerController((SinglePlayerViewModel)viewModel);
            }  
         
            case MULTIPLAYERVIEWCONTROLLER:{
                return new MultiPlayerViewController((MultiPlayerViewModel)viewModel);
            }  
            
          case  SINGLEWINNERDIALOGCONTROLLER:{
                return new SingleWinnerDialogController();
            }  
            
             case MULTIPLAYERWINNERDIALOG:{
                return new MultiPlayerWinnerDialogController();
            }  
            
          
            
            
            //todo add your own controller name in enum class and add your case here
            
            
            default:{
                 return new MainViewController((MainViewModel)viewModel);
            }
        
        
        }
       
    
    }
    
    
}
