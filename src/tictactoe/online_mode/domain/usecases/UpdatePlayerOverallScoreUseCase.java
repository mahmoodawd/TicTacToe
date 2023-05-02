
package tictactoe.online_mode.domain.usecases;

public class UpdatePlayerOverallScoreUseCase {
   static UpdatePlayerOverallScoreUseCase instance ; 
    private UpdatePlayerOverallScoreUseCase()
    {
    
    
    }
    
    
    
    public static synchronized UpdatePlayerOverallScoreUseCase getInstance()
    {
        
        if(instance == null){
            instance = new UpdatePlayerOverallScoreUseCase();
        }
        return instance;
    }
    
}
