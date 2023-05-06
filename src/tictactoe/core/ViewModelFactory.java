package tictactoe.core;

import tictactoe.multi_player.presentation.MultiPlayerViewModel;
import tictactoe.authentication.login.presentation.LoginViewModel;
import tictactoe.authentication.registration.RegistrationViewModel;
import tictactoe.available_players.presentation.AvailablePlayersViewModel;
import tictactoe.online_multi_player.presentation.OnlineMultiPlayerViewModel;
import tictactoe.main_menu.presentation.MainViewModel;
import tictactoe.main_menu.presentation.multi_mode.MultiModeViewModel;
import tictactoe.main_menu.presentation.single_mode.SingleModeViewModel;
import tictactoe.single_player.presentation.SinglePlayerViewModel;


public class ViewModelFactory {
        
    private static Remote remote  = new Remote();
    public static Object getViewModel(ViewController viewController)
    {
        
        
        
    
        
        switch(viewController)
        {
        
            case MAINVIEWCONTROLLER :{
            
              return new MainViewModel();
         
            }
            
            case ONLINEMULTIPLAYERVIEWCONTROLLER:{
                return new OnlineMultiPlayerViewModel(remote);
            }
            
            
             case MENUDIALOGCONTROLLER:{
                return new OnlineMultiPlayerViewModel(remote);
            }
             
             
             case REGISTRATIONVIEWCONTROLLER:{
                return new RegistrationViewModel();
            }

            case LOGINVIEWCONTROLLER:{
                return new LoginViewModel();
            }
            
            case AVAILABLEPLAYERSVIEWCONTROLLER:{
                    return new AvailablePlayersViewModel();
                
            }
            
            
             case MULTIMODEVIEWCONTROLLER:{
                    return new MultiModeViewModel();
                
            }
             
             
           
            
              case SINGLEMODEVIEWCONTROLLER:{
                    return new SingleModeViewModel();
                
            }
              
                 case SINGLEPLAYERVIEWCONTROLLER:{
                    return new SinglePlayerViewModel();
                
            }
                 
                 
                    case MULTIPLAYERVIEWCONTROLLER:{
                    return new MultiPlayerViewModel();
                
            }
            //todo add your own controller name in enum class and add your case here            //todo add your own controller name in enum class and add your case here
            
            
            default:{
                 return new MainViewModel();
            }
        
        
        }
       
    
    }

}



