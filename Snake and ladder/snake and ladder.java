import java.util.Scanner;

public class Main
{
    static int player1Score = 0;
    static int player2Score = 0;
   
    static int randomNumber(){
        while(true){
            int x = (int) (Math.random() * 10);
            if(x>=1 && x<=6)
            return x;
        }
    }
   
    static void player1() {
        int diceNumber = randomNumber();
        player1Score = scoreGreaterThan100(player1Score,diceNumber);
        player1Score = scoreGenerator(player1Score);
        displayScore();
       
    }
   
    static void player2() {
        int diceNumber = randomNumber();
        player2Score = scoreGreaterThan100(player2Score,diceNumber);
        player2Score = scoreGenerator(player2Score);
       
        displayScore();
    }
   
    static int scoreGreaterThan100(int score, int diceNumber){
        if((score+diceNumber) > 100)
            return score;
        score += diceNumber;
        return score;
    }
   
    static void displayScore(){
        System.out.println("Player 1 score: " + player1Score);
        System.out.println("Player 2 score: " + player2Score);
    }
   
    static void checkWinner(int score, int playerNumber){
        if(score == 100)
            System.out.println("The winner is player " + playerNumber);
            System.exit(0);
    }
   
    static int scoreGenerator(int score){
        if(score == 7)
            score += 14;
        else if(score == 18)
            score += 16;
        else if(score == 38)
            score += 30;
        else if(score == 58)
            score += 30;
        else if(score == 72)
            score += 24;
        else if(score == 23)
            score -= 20;
        else if(score == 37)
            score -= 20;
        else if(score == 55)
            score -= 30;
        else if(score == 70)
            score -= 51;
        else if(score == 98)
            score -= 90;
   
        return score;
    }
public static void main(String[] args) {
   
   Scanner sc = new Scanner(System.in);
   int playerNumber = 1;
   System.out.println("*******Welcome to Snake and ladder game*******");
  displayScore();
   while(true) {
      System.out.println("Enter the player number: ");
      playerNumber = sc.nextInt();
      if(playerNumber == 1){
          player1();
          checkWinner(player1Score,playerNumber);
         
      }
      else if(playerNumber == 2){
          player2();
          checkWinner(player2Score,playerNumber);
      }
  }
}


}
