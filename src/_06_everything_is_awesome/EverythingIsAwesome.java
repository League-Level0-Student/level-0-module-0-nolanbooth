package _06_everything_is_awesome;

import javax.swing.JOptionPane;

public class EverythingIsAwesome {
	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog(null, "What do you like?");
		JOptionPane.showMessageDialog(null, answer + " is awesome!!!");
	}
}
