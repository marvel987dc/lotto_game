package lottopac;

import javax.swing.JOptionPane;

public class DriverClass {
	public static void main(String[] args) {
		int userNumber = Integer.parseInt(JOptionPane.showInputDialog("Choose a number between 3 and 27"));
		boolean userWins = false;
		
		for(int i = 1; i <= 5; i++) {
			Lotto lotto = new Lotto();
			int[] numbers = lotto.getNumbers();
			
			int sum = numbers[0] + numbers[1] + numbers[2];
			
			if(sum == userNumber) {
				userWins = true;
				JOptionPane.showMessageDialog(null, "The sum is: " + sum);
				break;
			}
			int attempts = 5-i;
			JOptionPane.showMessageDialog(null, "The sum is: " + sum + " you still have " + attempts + " attempts");
			
		}
		if(userWins) {
			JOptionPane.showMessageDialog(null, "Congrats, you won.!");
		}else {
			JOptionPane.showMessageDialog(null, "I'm sorry you Lost.!");
		}
	}
}
