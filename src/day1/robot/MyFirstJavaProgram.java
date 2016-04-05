package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot Jangwoo = new Robot();
int JWL =45 ;
Jangwoo.setWindowColor(Color.gray);
Jangwoo.sparkle();
Jangwoo.penDown();
Jangwoo.setPenColor(Color.red);
		Jangwoo.move(150);
		Jangwoo.turn(JWL); 
	
	}
}
