public class Blackjack {
  //make "stay" into a boolean
  //create values for points of each player
  
  public void playGame() {
    
  }
  
  public boolean gameOver() {
    if ( (points1 > 21) || (points2 > 21) ) {
      return true;
    }
    else if ( (stay1==true) && (stay2==true) ) {
      return true;
    }
    else if ( (pInitial1==21) || (pInitial2==21) ) {
      return true;
    }
    return false;
    
  }
  
  public void whoWon() {
    
  }
}
