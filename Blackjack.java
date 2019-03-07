public class Blackjack {
  //make "stay" into a boolean
  //create values for points of player
  
  public void playGame() {
    d1.deal();
    d1.deal();
    while (!gameOver) {
      /*porint the cards dealt      
      points1== card1 pointvalue+card2 pointvalue 
      ask if they want to hit 
      if yes deal another card 
      points1== points1+ card3 point value 
      repeat until stay 
      whowins()*/
     
  }
  
  public boolean gameOver() {
    if (points1 > 21) {
      return true;
    }
    else if ( stay1==true ) {
      return true;
    }
    else if (pInitial1==21) {
      return true;
    }
    return false;
    
  }
  
  public void whoWon() {
    if (points1<=21 && points1>=18) {      
        System.out.println("You win!!");
    }
    else if (points1>21) {
      System.out.println("Toooo aggressive.");
    }
    System.out.println("Why didn't you hit, bruh?");
  }
}
    
