public class GuessGame {
  Player p1;
  Player p2;
  Player p3;
  //GuessGame has three instance variables for the three Player objects

  public void startGame() {
    p1 = new Player();
    p2 = new Player();
    p3 = new Player();
    //create three Player objects and assign them to the three Player instances

    //declare three variables to hold the three guesses the Players make
    int guessp1 = 0;
    int guessp2 = 0;
    int guessp3 = 0;

    //declare three variables to hold a true or false based on the player's answer
    boolean p1isRight = false;
    boolean p2isRight = false;
    boolean p3isRight = false;

    //make a 'target' number that the players have to guess
    int targetNumber = (int) (Math.random() * 10);
    System.out.println("I'm thinking of a number between 0 and 9...");

    while(true) {
      System.out.println("Number to guess is " + targetNumber);

      //call each player's guess method
      p1.guess();
      p2.guess();
      p3.guess();

      //get each player's guess (the result of their guess() method running) by accessing the number variable of each Players
      guessp1 = p1.number;
      System.out.println("Player one guessed " + guessp1);

      guessp2 = p2.number;
      Sytem.out.println("Player two guessed ") + guessp2);

      guessp3 = p3.number;
      System.out.println("Player three guessed " + guess3);

      //check each player's guess to see if it matches the targetNumber. If a player is right, then set that player's variable to be true (remember, we set it false by default)
      if (guessp1 == target) {
        p1isRight = true;
      }
      if (guessp2 == target) {
        p2isRight = true;
      }
      if (guessp3 == target) {
        p3isRight = true;
      }

      if (p1isRight || p2isRight || p3isRight) {
        //if player one OR player two OR player three is right...
        System.out.println("We have a winner!");
        System.out.println("Player one got it right? " + p1isRight);
        System.out.println("Player two got it right? " + p2isRight);
        System.out.println("Player three got it right? " + p3isRight);
        System.out.println("Game is over.");
        break; //game over, so break out of the loop

      } else {
        //we must keep going because nobody got it p1isRight
        System.out.println("Players will have to try again.");
      }// end of if/else

    } // end loop
  } // end method
} // end class

public class Player {

  int number = 0; //where the guess goes

  public void guess() {
    number = (int) (Math.random() * 10);
    System.out.println("I'm guessing " + number);
  }

}

public class GameLauncher {
  public static void main(String[] args) {
    GuessGame game = new GuessGame();
    game.startGame();
  }
}
