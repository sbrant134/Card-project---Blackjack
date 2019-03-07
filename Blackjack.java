public class Blackjack {
  //make "stay" into a boolean
  //create values for points of each player
  
  public void playGame() {
    d1.deal();
    d1.deal();
    while (!gameOver) {
      
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
    if (points1<=21 && points2<=21) {
      if (points1>points2) {
        System.out.println("Player 1 wins");
      }
      else if (points2>points1) {
        System.out.println("Player 2 wins");
      }
      System.out.println("tie");
    }
    else if (points1>21 && points2>21) {
      System.out.println("both bust");
    }
    else if (points1>21 && points2<=21) {
      System.out.println("Player 2 wins");
    }
    System.out.println("Player 1 wins");
  }
}
