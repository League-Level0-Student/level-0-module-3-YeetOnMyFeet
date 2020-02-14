//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot rob = new Robot();
		//3. Ask the user what color they would like the robot to draw
		String color = JOptionPane.showInputDialog("What color would you like to draw?");
		//5. Use an if/else statement to set the pen color that the user requested
if (color.equals("orange")) {
	rob.setPenColor(255, 69, 0);
}
if (color.equals("purple")) {
	rob.setPenColor(128, 0, 128);
}
if (color.equals("red")) {
	rob.setPenColor(255, 0, 0);
}
if (color.equals("blue")) {
	rob.setPenColor(0, 0, 255);
}
if (color.equals("green")) {
	rob.setPenColor(0, 255, 0);
}

        //6. If the user doesn’t enter anything, choose a random color

        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		rob.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
rob.penDown();
rob.setSpeed(100);
rob.move(100);
rob.turn(-90);
rob.move(100);
rob.turn(-90);
rob.move(100);
rob.turn(-90);
rob.move(100);
rob.turn(-90);

	}
}
