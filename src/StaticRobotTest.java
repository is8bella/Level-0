import org.jointheleague.graphical.robot.Robot;

public class StaticRobotTest {
	static Robot Bender = new Robot();
public static void main(String[] args) {
	drawSquare();
}
static void drawSquare(){
	Bender.penDown();
	for (int i = 0; i < 4; i++) {
		Bender.move(100);
		Bender.turn(90);
	}
}
}
