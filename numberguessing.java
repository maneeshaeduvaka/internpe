import java.util.Scanner;
import java.util.Random;
public class numberguessing {
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        String play = "yes";
        while(play.equals("yes")){
            Random rand = new Random();
            int randNum = rand.nextInt(100);
            int guess = -1;
            int tries = 0;
            while(guess != randNum){
                System.out.println("Guess a number between 1 and 100");
                guess = reader.nextInt();
                tries++;
                if(guess == randNum)
                {
                    System.out.println("Hurray!you guessed the number");
                    System.out.println("It took you" + tries + "guesses!");
                    System.out.println("would you like to play another game? yes or no");
                    play = reader.next().toLowerCase();
                }
                else if(guess > randNum)
                {
                    System.out.println("your number is too high! tryagain");
                }
                else
                {
                    System.out.println("your number is too low! tryagain");
                }
            }
        }

    }
}
