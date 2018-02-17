import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class CodingExercise1 {

    public static void main(String[] args) {
    	Robot roomba = new Robot();
   	 // 3. ask the user what color they would like the Robot to draw
String color = JOptionPane.showInputDialog("what color do you want to draw in?");
   	 // 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)
if(color.equals("red")) {
	roomba.setPenColor(255, 0, 0);;
}
else if (color.equals("blue")) {
	roomba.setPenColor(0, 0, 255);
}
else if (color.equals("green")){
	roomba.setPenColor(0, 255, 0);
}
   	 // 2. set the pen width to 10
roomba.setPenWidth(10);
roomba.penDown();
roomba.setSpeed(10);
   	 // 1. make the Robot draw a shape
   	 for (int i = 0; i < 4; i++) {
   		 roomba.move(100);
   		 roomba.turn(90);
		
	}
    }

}
