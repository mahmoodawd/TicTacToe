package tictactoe.single_player.presentation;
import java.awt.image.SampleModel;
import java.util.Random;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import tictactoe.online_multi_player.presentation.Turn;

/**
 *
 * @author ASUS
 */
public class SinglePlayerViewModel {

  
    
    
    
        private int  board [][] =  new int [3][3];
    SimpleIntegerProperty boardNotifier = new SimpleIntegerProperty();
   private SimpleStringProperty winnerName = new SimpleStringProperty();
   private SimpleIntegerProperty playerOneSymbol = new SimpleIntegerProperty();
   private SimpleIntegerProperty computerSymbol = new SimpleIntegerProperty();
   private SimpleStringProperty playerOneName = new SimpleStringProperty();
   private SimpleStringProperty computer = new SimpleStringProperty();
  private SimpleIntegerProperty playerOneScore = new SimpleIntegerProperty();
   private SimpleIntegerProperty computerScore = new SimpleIntegerProperty(); 
   private SimpleIntegerProperty numberOfPlayedMoves = new SimpleIntegerProperty();
   
   // Turn playerTurn = Turn.FIRSTPLAYER;
  private SimpleIntegerProperty playerTurn = new SimpleIntegerProperty();
    public SinglePlayerViewModel( )
    {
   
        playerTurn.set(1);
       boardNotifier.set(1);
       winnerName.set("");
 
  
    }
    
    
     
    
   
    
    public void setPlayerOneName(String name)
    {
    
       playerOneName.set(name);
    }
    
     public void setPlayerTwoName(String name)
    {
       computer.set(name);
    }
     
     
     public SimpleStringProperty getPlayerOneName()
     {
     
         return playerOneName;
     
     }
     
      public SimpleStringProperty getPlayerTwoName()
     {
     
         return computer;
     
     }
      
       public SimpleStringProperty getWinnerName()
     {
     
         return winnerName;
     
     }
       
         public void resetWinnerName()
     {
     
        winnerName.set("");
     
     }
      
      public SimpleIntegerProperty getPlayerOneSymbol()
      {
          return playerOneSymbol;
      
      }
       public SimpleIntegerProperty getComputerSymbol()
      {
          return computerSymbol;
      
      }
      
      public void setPlayerOneSymbol(int value)
      {
           playerOneSymbol.set(value);
      
      }
      
       public void setPlayerTurn(int value)
      {
           playerTurn.set(value);
      
      }
      
       public void setPlayerTwoSymbol(int value)
      {
           computerSymbol.set(value);
      
      }

      
       public SimpleIntegerProperty getPlayerTwoSymbol()
      {
          return computerSymbol;
      
      }
       
      
        public SimpleIntegerProperty getPlayerOneScore()
      {
          return playerOneScore;
      
      }
        
        
         public SimpleIntegerProperty getPlayerTwoScore()
      {
          return computerScore;
      
      } 
         
         
         public SimpleIntegerProperty getPlayerTurn()
      {
          return  playerTurn;
      
      }
       
         
         
             public void setPalyerOneScore(int score)
      {
           playerOneScore.set(score);
      
      }
       
             
      public void setPalyerTwoScore(int score)
      {
          computerScore.set(score);
      
      } 
      
       
    public int[][] getBoard()
    {
    
        return board;
    
    } 
      
      
    

    
    
  public void setBoard(int row, int column) {
    if (board[row][column] != 0 || !winnerName.get().isEmpty()  || playerTurn.get() == computerSymbol.get()  ) {
        return;
    }

    setXorO(row, column, playerOneSymbol.get());
   
    
    checkWinner();


     boardNotifier.set(boardNotifier.get() + 1);
}

      
      
   
    
    private void setXorO(int row, int column, int playerSymbol)
    { 
        
              board[row][column]= playerSymbol;  
              
              if(playerTurn.get() ==1) {
                   playerTurn.set(2 );
              }else{
                 playerTurn.set(1);  
              }
            numberOfPlayedMoves.set(numberOfPlayedMoves.get()+1); 
    } 
    
    
    
    
   
   
   
   
   
   
    
    private void checkWinner()
    {
       // rows checker
       for (int row = 0; row < 3; row++) {
    if (board[row][0] == board[row][1] && board[row][1] == board[row][2] && board[row][0] != 0 ) { 
     
       setWinnerName(row, 0);
 
    }
  }
        // columns checker
         for (int column = 0; column < 3; column++) {
     if (board[0][column] == board[1][column] && board[1][column] == board[2][column] && board[0][column] != 0 ) { 
   
         setWinnerName(0, column);
    }
  }
         
         
       //  diagonals checkers
   if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != 0) { 
   
         
       setWinnerName(0, 0);
        }

     if (board[0][2] == board[1][1] && board[1][1] == board[2][0]&& board[0][2] != 0) { 
    
         setWinnerName(0, 2);
    } 
     
     if(numberOfPlayedMoves.get() == 9 && winnerName.get().isEmpty()){
     winnerName.set("draw");
     }
        } 
    
    
   public void computerPlay(){
       
       computerMove(computerSymbol.get() );
       computerMove(playerOneSymbol.get() );
       
        if (playerTurn.get() != computerSymbol.get()) return;
        for(int row = 0 ; row < 3 ; row++){
               for(int column = 0 ; column < 3 ; column++)
               { 
                   if(board[row][column] == 0  ){
                       setXorO(row, column, computerSymbol.get()); 
                       return;
                   }
               
               }
           }
       
       
   }
    
    
    
    
    public void computerMove(int num)
    {  
        if (playerTurn.get() != computerSymbol.get()) return;
        System.out.println(num);
       // rows checker
       for (int row = 0; row < 3; row++) {
    
     if (board[row][0] == board[row][1]  && board[row][0] == num ) { 
     if(board[row][2] ==0){  
         
       setXorO(row, 2,computerSymbol.get()); 
       
       return;
     }
     }
 if (board[row][1] == board[row][2]  && board[row][1] == num ) { 
     if(board[row][0] ==0){
       setXorO(row, 0,computerSymbol.get()); 
       
       return;
     }
     
     
     
    } 
 
 
 
     
 if (board[row][0] == board[row][2]  && board[row][0] == num ) { 
     if(board[row][1] ==0){
       setXorO(row, 1,computerSymbol.get()); 
       
       return;
     }
     
     
     
    }
  } 
       
       
       
       
         for (int col = 0; col < 3; col++) {
    
     if (board[0][col] == board[1][col]  && board[0][col] == num ) { 
     if(board[2][col] ==0){  
         
       setXorO(2, col,computerSymbol.get()); 
       
       return;
     }
     }
 if (board[1][col] == board[2][col]  && board[1][col] == num ) { 
     if(board[0][col] ==0){
       setXorO(0, col,computerSymbol.get()); 
       
       return;
     }
     
     
     
    } 
 
 if (board[0][col] == board[2][col]  && board[0][col] == num ) { 
     if(board[1][col] ==0){
       setXorO(1, col,computerSymbol.get()); 
       
       return;
     }
     
     
     
    }
 
 
  }
         
     
         
         
       //  diagonals checkers
   if (board[0][0] == board[1][1]&& board[0][0] == num) { 
   
       if( board [2][2] ==0){
           
           setXorO(2, 2, computerSymbol.get());
           return;
       }
       
         
      
        }
      
    if (board[1][1] == board[2][2]&& board[1][1] == num) {  
        
        if( board [0][0] ==0){
           
           setXorO(0, 0, computerSymbol.get());
           return;
       }
    }
   
     if (board[0][2] == board[1][1] && board[0][2] == num) { 
    
         if(board [2][0]==0) {
            
             setXorO(2, 0, computerSymbol.get()); 
             return;
         } 
         
             
        
    } 
     
     
      if( board[1][1] == board[2][0] && board[1] [1] ==num) {
     
          if(board[0][2] ==0){
              setXorO(0, 2, computerSymbol.get()); 
              
              return;
        } 
    
    } 
      
    }
    
    
    private void setWinnerName(int row , int column)
    {
      if(board[row][column] == playerOneSymbol.get())
     {
      winnerName.set(playerOneName.get());
      playerOneScore.set(playerOneScore.get()+1);
     }else
     {
        winnerName.set(computer.get());
        computerScore.set(computerScore.get()+1);
     }
    }
    

    
    
    
    public void swapNames()
    {
        int temp = playerOneSymbol.get();
        playerOneSymbol.set(computerSymbol.get());
        computerSymbol.set(temp);
    }
    
  

    void resetBorad() {
          for(int row = 0 ; row < 3 ; row++){
               for(int column = 0 ; column < 3 ; column++)
               {
                 board[row][column] = 0;
               }
           } 
          winnerName.setValue(""); 
          numberOfPlayedMoves.set(0);
       //  playerTurn.set(computerSymbol.get());
    
}

}