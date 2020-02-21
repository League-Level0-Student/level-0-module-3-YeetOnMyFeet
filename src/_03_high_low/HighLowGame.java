//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _03_high_low;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		int guess = 24;
		String guesss = JOptionPane.showInputDialog("Enter a guess");
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(100 -1)+ 1;
		
		// 2. Print out the random variable above
		System.out.println(guesss);
		// 11. Repeat steps 1 to 10 ten times
		
			// 1. Ask the user for a guess using a pop-up window, and save their response 

			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
			int answer = Integer.parseInt(guesss);
			// 5. if the guess is correct
			if (guesss.equals(24)) {
				JOptionPane.showMessageDialog(null, "You win!");
				System.exit(0);
			}
				// 6. Win
				// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
			// 7. if the guess is high
			if (answer > 24) {
				JOptionPane.showMessageDialog(null, "Your guess is too high!");
			}
				// 8. Tell them it's too high
			// 9. if the guess is low
			if (answer < 24) {
				JOptionPane.showMessageDialog(null, "Your guess is too low! \n You lose!");
				
			}
				// 10. Tell them it's too low

		// 13. Tell them they lose
		
	}

}


