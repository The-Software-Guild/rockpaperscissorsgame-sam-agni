import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//.useDelimiter("\n");
		boolean exit = false;
		int numRounds = 0;
		int ties = 0;
		int userWins = 0;
		int compWins = 0;
		int userMove = 0;
		int compMove = 0;
		Random r = new Random();
		String playAgain = "yes";
		while (exit == false) {
			System.out.print("How many rounds would you like to play? ");
			numRounds = sc.nextInt();
			if (numRounds < 1 || numRounds > 10) {
				System.out.println("Number of rounds must be between 1 and 10");
				exit = true;
				continue;
			}
			ties = 0;
			userWins = 0;
			compWins = 0;
			userMove = 0;
			for (int i = 0; i < numRounds; i++) {
				System.out.print("Rock (1), Paper (2) or Scissors (3)? ");
				userMove = sc.nextInt();
				compMove = r.nextInt(2) + 1;
				if (userMove == 1) {
					if (compMove == 1) {
						System.out.println("Computer chose: Rock");
						System.out.println("It's a tie");
						ties++;
					} else if (compMove == 2) {
						System.out.println("Computer chose: Paper");
						System.out.println("Computer wins");
						compWins++;
					} else if (compMove == 3) {
						System.out.println("Computer chose: Scissors");
						System.out.println("Your win");
						userWins++;
					}
				} else if (userMove == 2) {
					if (compMove == 1) {
						System.out.println("Computer chose: Rock");
						System.out.println("Your win");
						userWins++;
					} else if (compMove == 2) {
						System.out.println("Computer chose: Paper");
						System.out.println("It's a tie");
						ties++;
					} else if (compMove == 3) {
						System.out.println("Computer chose: Scissors");
						System.out.println("Computer wins");
						compWins++;
					}
				} else if (userMove == 3) {
					if (compMove == 1) {
						System.out.println("Computer chose: Rock");
						System.out.println("Computer wins");
						compWins++;
					} else if (compMove == 2) {
						System.out.println("Computer chose: Paper");
						System.out.println("Your win");
						userWins++;
					} else if (compMove == 3) {
						System.out.println("Computer chose: Scissors");
						System.out.println("It's a tie");
						ties++;
					}
				}
			}
			System.out.println("Number of ties: " + ties);
			System.out.println("Number of user wins: " + userWins);
			System.out.println("Number of computer wins: " + compWins);
			if (userWins > compWins) {
				System.out.println("Overall winner: You");
			} else if (compWins > userWins) {
				System.out.println("Overall winner: Computer");
			}
			System.out.print("Do you want to play again? ");
			playAgain = sc.next();
			if (playAgain.equalsIgnoreCase("no")) {
				exit = true;
			}
		}
		System.out.println("Thanks for playing!");
		sc.close();
	}

}
