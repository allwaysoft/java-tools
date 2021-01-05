import java.util.Scanner;

class Guessing {
	public static void main(String[] args) {
		// Guessing code goes here
		Scanner guess = new Scanner(System.in);

		System.out.println("Guess a number between 1 and 25: ");
		int user_guess = guess.nextInt();
		int small = 0;
		int large = 25;

		int random_number = (int)(Math.random() * (large - small + 1) + small);
		if (user_guess == random_number) {
			System.out.println("You have correctly guessed the number!");
		} else {
			System.out.println("Your guess is incorrect!");
		}
	}
}