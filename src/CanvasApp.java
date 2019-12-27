import javax.swing.JFrame;
/*
Steven Li
31647656
Assignment 8
Lab Days: Tuesday, Thursday 9:40-10:55
I did not collaborate with anyone on this assignment
 */

//Class that sets the frame and adds canvas, basically a runner class
public class CanvasApp {

	public static void main(String[] args) {

		JFrame frame = new JFrame("CanvasApp Test");
		Canvas canvas = new Canvas();
		frame.add(canvas);
		
		frame.setSize(640,  480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
