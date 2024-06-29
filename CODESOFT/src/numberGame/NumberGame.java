package numberGame;
import java.util.Scanner;
import java.util.Random;

public class NumberGame {
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		Random ran=new Random();
		int minRange=1;
		int maxRange=100;
		int attempt=5;
		boolean again=true;
		int score=0;
		System.out.println("Number game");
		while(again) {
			int rannum=ran.nextInt(maxRange-minRange+1)+minRange;
			int guess;
			System.out.println("I guessed a number between 1 and 100.You have 5 attempts to guess it");
			for(int i=1;i<=5;i++) {
				System.out.println("Attempt No:"+i+",Enter your guessed number");
				guess=a.nextInt();
				if(guess==rannum) {
					System.out.println("Congrats! You won the game!");
					score++;
					break;
				}
				else if (guess < rannum) {
                    if (rannum - guess > 10) {
                        System.out.println("Too low. Try again.");
                    } else {
                        System.out.println("Low. Try again.");
                    }
                } else {
                    if (guess - rannum > 10) {
                        System.out.println("Too high. Try again.");
                    } else {
                        System.out.println("High. Try again.");
                    }
                }

                if (i == attempt) {
                    System.out.println("Sorry, Game Over. The correct number was: " + rannum);
                }
			}
			System.out.print("Do you want to play again? (yes/no): ");
            String playAgainResponse = a.next();
            if (!playAgainResponse.equalsIgnoreCase("yes")) {
                again = false;
            }
		}
		System.out.println("Game over. Your score: " + score);
        a.close();
	}
}
