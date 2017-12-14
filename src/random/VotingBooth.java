package random;

import javax.swing.JOptionPane;

public class VotingBooth {
public static void main(String[] args) {
	
	String tall = JOptionPane.showInputDialog("How old are you?");
    int height = Integer.parseInt(tall);
	if (height < 18) {JOptionPane.showMessageDialog(null, "Nobody cares what you think!");
	}
	
	if (height >= 18) {JOptionPane.showInputDialog("Who should the next president be?");
	}
	
	
	
	
	
	
	
	
	
	
}
}
