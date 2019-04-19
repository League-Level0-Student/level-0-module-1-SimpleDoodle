package ifs_ints_and_loops;
//    Copyright (c) The League of Amazing Programmers 2013-2017

//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String riddle = JOptionPane.showInputDialog(null,
				"An Interpol detective who was mere days from cracking an international smuggling ring has suddenly gone missing. While inspecting his last-known location, you find a note: 710 57735 34 5508 51 7718. Currently there are 3 suspects: Bill, Billiam, Billy.");
		// 4. If they got the answer right, pop up "correct!" and increase the score by
		// one
		if (riddle.equalsIgnoreCase("Bill")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score = score + 1;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong! The answer was Bill.");
		}
		JOptionPane.showMessageDialog(null, "The score is " + score + ".");
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.

	}
}
