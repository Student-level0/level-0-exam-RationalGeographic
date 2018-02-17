

/* Level 0 Exam: Coding  Exercise #2 */
import javax.swing.JOptionPane;

/**
 * Write a program that asks the user for their age. 
 * Tell them which year they were born. 
 * If they are over 30, tell them they are too old to play this game.
 **/

public class CodingExercise2 {
	public static void main(String[] args) {
		String hi = JOptionPane.showInputDialog("how old are you?" );
		int jk =  Integer.parseInt(hi);
		if(jk>30) {
			System.out.println("you're too old to play this game");
			System.exit(0);
		}
		else {
		int lol = 2018 - jk;
		System.out.println(lol);
	}

	}
}

