import javax.swing.JOptionPane;

public class yearsalive {
public static void main(String[] args) {
	String years = JOptionPane.showInputDialog("What year were you born?");
	int alive = Integer.parseInt(years);
	for (int i = 0; i < 2020; i--) {
	
		System.out.println(i-- + alive);
	}
}
}
