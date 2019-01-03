package extra;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;


public class houses {
	static Robot turtle= new Robot();
public static void main(String[] args) {
	turtle.setSpeed(100);
	turtle.penDown();
	turtle.miniaturize();
	turtle.moveTo(20, 580);
	turtle.setAngle(90);
	drawHouse("small", Color.green, "flat");
	drawHouse("large", Color.cyan, "flat");
	drawHouse("medium", Color.magenta, "flat");
	drawHouse("small", Color.orange, "orb");
	drawHouse("small", Color.pink, "pointy");
	drawHouse("medium", Color.yellow, "orb");
	drawHouse("large", Color.red, "flat");
}
public static void drawHouse(String height, Color color, String roof) {
	int n=0;
	if(height.equals("small")) {
		n=60;
	}else if(height.equals("medium")) {
		n=120;
	}else if(height.equals("large")) {
		n=250;
	}
	turtle.setPenColor(color);
	turtle.turn(-90);
	turtle.move(n);
	if(roof.equals("flat")) {
		flatRoof();
	}else if(roof.equals("pointy")) {
		pointyRoof();
	}else {
		orbRoof();
	}
	turtle.move(n);
	turtle.turn(-90);
	turtle.move(25);
}
public static void flatRoof() {
	turtle.turn(90);
	turtle.move(20);
	turtle.turn(90);
}
public static void pointyRoof() {
	turtle.turn(60);
	turtle.move(12);
	turtle.turn(60);
	turtle.move(12);
	turtle.turn(60);
}
public static void orbRoof() {
	turtle.turn(-90);
	for (int i = 0; i < 40; i++) {
		turtle.move(10);
		turtle.turn(9);
	}
	turtle.turn(-90);
}
}
