package _07_last_summer;

import javax.swing.JOptionPane;

public class LastSummer {
public static void main(String[] args) {
	String userInput = JOptionPane.showInputDialog(null ,"What is your name?");
		JOptionPane.showMessageDialog(null, "I (don't) know what you did last summer, " + userInput);

	}
}
