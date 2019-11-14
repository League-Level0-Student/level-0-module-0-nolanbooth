package _02_robot_graffiti;

import org.jointheleague.graphical.robot.Robot;

public class billy {
public static void main(String[] args) {
	

	Robot billly = new Robot () ;
billly.penDown();
	billly.setPenWidth(10);
billly.setY(450);
	billly.setX(20);
billly.setSpeed(80);
	billly.hide();
	for (int i = 0; i < 20; i++) {
	billly.move(20);
billly.turn(140);
billly.move(25);
billly.turn(-140);
billly.move(20);





} }}