import java.util.Random;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Random Random_number= new Random();
    int rightguess=Random_number.nextInt(100);
    int t=0;
    Scanner scan=new Scanner(System.in);
    System.out.println("Guess a number between 1 to 100" );
    
    int guess;
    int i=0;
    boolean win=false;
    while(win==false) {
      guess=scan.nextInt();
      t++;
    
    if(guess==rightguess) {
      win=true;
    }
    else if(i>8){
      System.out.println("You loose!: "+rightguess);
      return;
    }
    else if(guess<rightguess){
      i++;
      System.out.println("Yor Guess is lower than the right guess "+(10-i));
      
      
      
    }
    else if(guess>rightguess) {
      i++;
      System.out.println("Your Guess Is Higher Than THe Right Guess "+(10-i));
      
    }
    
    

  }
    System.out.println("won the match!");
    System.out.println("Then number was "+rightguess);
    System.out.println("You used "+t+" turns to guess the right number");
    System.out.println("Your score is "+((11-t)*10)+" out of 100");
    

}
}