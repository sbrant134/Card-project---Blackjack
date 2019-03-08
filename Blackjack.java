public class Blackjack {
  //make "stay" into a boolean
  //create values for points of player
  
  public void playGame() { 
    d1.deal();
    d1.deal();
    while (!gameOver) {
      /*print the cards dealt      
      points1== card1 pointvalue+card2 pointvalue */
      Scanner scan = new Scanner(System.in);
      System.out.print(" Would you like to hit (press 1) or stay (press 2)? ");
      int move = scan.nextInt();
      if (move == 1){
        // points1== points1+ card3 point value 
      }
      else {
      whoWins();
      }
    }
    whoWins();
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
    
