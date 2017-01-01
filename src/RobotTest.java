import org.jointheleague.graphical.robot.Robot;

public class RobotTest {
	Robot Bender = new Robot();
	public static void main(String[] args) {
		RobotTest one = new RobotTest();
		one.drawSquare();
	
	}
	void drawSquare (){
		Bender.penDown();
		for (int i = 0; i < 4; i++) {
			Bender.move(100);
			Bender.turn(90);
		}
	}

}
