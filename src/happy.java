import javax.swing.JOptionPane;

public class happy {
public static void main(String[] args) {
	
	String firstq = JOptionPane.showInputDialog("Are you happy?");
	String secondq = JOptionPane.showInputDialog("Do you want to be happy?");
	if (firstq.equals("yes")) {
		JOptionPane.showMessageDialog(null, "Keep doing what you are doing!");
	}
	if (firstq.equals("no")) {
	String secondq = JOptionPane.showInputDialog("Do you want to be happy?");
	}
	if (secondq.equals("no")) {
		JOptionPane.showMessageDialog(null, "Keep doing what you are doing!");
	}
	
	
	
	
	
	
	
}
	
	
	
	
	
}
