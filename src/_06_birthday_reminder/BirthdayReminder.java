
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _06_birthday_reminder;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "November 28th";
		String dadsBirthday = "April 22nd";
		String myBirthday = "June 18th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String birthday = JOptionPane.showInputDialog("Which birthday do you want out \n of yourself, dad, or mom?");
		// 3. Print out what the user typed
		System.out.println(birthday);
		// 4. if user asked for "mom"
			//print mom's birthday
		if (birthday.equals("mom")) {
			JOptionPane.showMessageDialog(null, momsBirthday);
		}
		// 5. if user asked for "dad"
			// print dad's birthday
		if (birthday.equals("dad")) {
			JOptionPane.showMessageDialog(null, dadsBirthday);
		}
		// 6. if user asked for your name
			// print myBirthday
		if (birthday.equals("mine")) {
			JOptionPane.showMessageDialog(null, myBirthday);
		}
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		else {
			JOptionPane.showMessageDialog(null, "Sorry, i don't remember that person's birthday!");
		}
	} 
}
