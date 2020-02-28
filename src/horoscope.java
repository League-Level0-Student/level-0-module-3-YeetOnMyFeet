import javax.swing.JOptionPane;

public class horoscope {
public static void main(String[] args) {
	String horoscope = JOptionPane.showInputDialog("What is your star sign?");
	if (horoscope.equals("ram")) {
		JOptionPane.showMessageDialog(null, "You are a Aries");
	}
	if (horoscope.equals("bull")) {
		JOptionPane.showMessageDialog(null, "You are a Taurus");
	}
	if (horoscope.equals("children")) {
		JOptionPane.showMessageDialog(null, "You are a Gemini");
	}
	if (horoscope.equals("lobster")) {
		JOptionPane.showMessageDialog(null, "You are a Cancer");
	}
	if (horoscope.equals("women")) {
		JOptionPane.showMessageDialog(null, "You are a Virgo");
	}
	if (horoscope.equals("scale")) {
		JOptionPane.showMessageDialog(null, "You are a Libra");
	}
	if (horoscope.equals("scorpion")) {
		JOptionPane.showMessageDialog(null, "You are a Scorpio");
	}
	if (horoscope.equals("crossbow women")) {
		JOptionPane.showMessageDialog(null, "You are a Sagittarius");
	}
	if (horoscope.equals("deer")) {
		JOptionPane.showMessageDialog(null, "You are a Capricorn");
	}
	if (horoscope.equals("jellyfish women")) {
		JOptionPane.showMessageDialog(null, "You are a Aquarius");
	}
	if (horoscope.equals("dolphins")) {
		JOptionPane.showMessageDialog(null, "You are a Pisces");
	}
	
	
	else {
		JOptionPane.showMessageDialog(null, "That's not a star sign!");
	}
}
}
