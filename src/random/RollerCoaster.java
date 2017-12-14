package random;

import javax.swing.JOptionPane;

public class RollerCoaster {
public static void main(String[] args) {
	
	
	String tall = JOptionPane.showInputDialog("How tall are you?");
	int height = Integer.parseInt(tall);
	if (height > 48) {JOptionPane.showMessageDialog(null, "Go right ahead!");
	}
	
	if (height <= 48) {JOptionPane.showMessageDialog(null, "You need to grow more!");
	}
	
	
	
	
	
	
	
	
}
}
