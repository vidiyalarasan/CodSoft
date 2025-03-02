import java.util.*;
class NumGuessGame{
	public static void main(String args[]){

		Scanner obj = new Scanner(System.in);
		Random random = new Random();
		boolean playgame=true;
		System.out.println("Welcome to Vidiyalarasan's Number Guessing Game - CodSoft Internship Task 1! ");
		System.out.println("Can you guess the secret number? Let's test your luck and skills! ");

		while(playgame){

			System.out.println("Guess a number between 1 to 100: ");
			System.out.println("NOTE:Max Guess attempt is 15");
			int secretNumber = random.nextInt(101);
			int attempt=0;

			while(true){

				attempt++;
				if(attempt>15){
					System.out.println("Your Guess attempt has reached the Max Attempts . The number is "+secretNumber);
					break;
					
						}
				else{
					int guessNumber = obj.nextInt();
						if(guessNumber==secretNumber){

						System.out.println("You guessed the number Wihtin " + attempt + " attempts.");
						break;

						}
						else if(guessNumber<secretNumber){

							System.out.println("Too Low ! Try Again...");

						}
						else{

							System.out.println("Too High ! Try Again...");


					
						}

				}
				
			}
			System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = obj.next().toLowerCase();

            if (!playAgain.equals("yes")) {

                    System.out.println("Thanks for playing!!\nExiting......");
                    playgame = false;

			}
		}
	}
}