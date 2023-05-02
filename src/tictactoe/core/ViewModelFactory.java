package tictactoe.core;

import tictactoe.main_menu.presentation.MainViewController;
import tictactoe.online_mode.presentation.OnlineViewController;
import tictactoe.online_mode.presentation.OnlineViewModel;
import tictactoe.main_menu.presentation.MainViewModel;

public class ViewModelFactory {
        
    
    public static Object getViewModel(ViewController viewController)
    {
    
        switch(viewController)
        {
        
            case MAINVIEWCONTROLLER :{
            
              return new MainViewModel();
         
            }
            
            case ONLINEVIEWCONTROLLER:{
                return new OnlineViewModel();
            }
            
            
             case MENUDIALOGCONTROLLER:{
                return new OnlineViewModel();
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
            
            
            //todo add your own controller name in enum class and add your case here
            
            
            default:{
                 return new MainViewModel();
            }
        
        
        }
       
    
    }

}



