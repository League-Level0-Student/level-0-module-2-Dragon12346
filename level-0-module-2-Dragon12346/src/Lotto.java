import java.util.Random;

import javax.swing.JOptionPane;

public class Lotto {
	public static void main(String[] args) {
		Random D0geL0rd = new Random();
		int werd = D0geL0rd.nextInt(51);
		int word = D0geL0rd.nextInt(51) + 50;
		int wcrd = D0geL0rd.nextInt(76) + 100;
		int wprd = D0geL0rd.nextInt(65) + 175;
		int weed = D0geL0rd.nextInt(9011) - 1410;
		JOptionPane.showMessageDialog(null, werd + "," + word + "," + wcrd + "," + wprd + "," + weed);
	}
}
