import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JComponent;
/*
Steven Li
31647656
Assignment 8
Lab Days: Tuesday, Thursday 9:40-10:55
I did not collaborate with anyone on this assignment
 */

//class that has all the listeners and methods for the canvas
public class Canvas extends JComponent implements MouseListener, MouseMotionListener, KeyListener {
	Point XYCoor;
	boolean clicked; // for non key listener purposes
	boolean key; // for key listener purposes
	int xMouse;
	int yMouse;

	int pos;
	int colorChange;
	public Canvas() {
		super();
		addMouseListener(this);
		addMouseMotionListener(this);
		addKeyListener(this);
		setFocusable(true);
		key = false;
		clicked = false;
		XYCoor = new Point();
		pos = 0;
		colorChange = 0;
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("CanvasWithMouseListener.mouseClicked");
		// FOR PROBLEM 2
//				int x = e.getX();
//				int y = e.getY();
//				XYCoor.setX(x);
//				XYCoor.setY(y);
//				Graphics g = getGraphics();
//				g.setColor(Color.RED);
//				g.fillOval(x-25, y-25, 50, 50);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("CanvasWithMouseListener.mousePressed");
		key = true;
		pos = e.getX();
//		For Problem 4
//		int x = e.getX();
//		int y = e.getY();
//		XYCoor.setX(x);
//		XYCoor.setY(y);
//		Graphics g = getGraphics();
//		g.setColor(Color.RED);
//		g.fillOval(x-25, y-25, 50, 50);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("CanvasWithMouseListener.mouseReleased");
//		For Problem 4
//		Graphics g = getGraphics();
//		clicked = true;
//		g.clearRect(0, 0, getWidth(), getHeight());
//		if(clicked) {
//			int x = e.getX();
//			int y = e.getY();
//			g.setColor(Color.RED);
//			g.fillOval(XYCoor.getX()-25, XYCoor.getY()-25, 50, 50);
//			g.drawLine(XYCoor.getX(), XYCoor.getY(), x, y);
//		}
//		clicked = false;
		key = false;
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("CanvasWithMouseListener.mouseEntered");

	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("CanvasWithMouseListener.mouseExited");

	}
	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println("CanvasWithMouseMotionListener.mouseDragged");
//		For Problem 4
//		Graphics g = getGraphics();
//		int x = e.getX();
//		int y = e.getY();
//		if(!clicked) {
//			g.setColor(Color.RED);
//			g.drawLine(XYCoor.getX(), XYCoor.getY(), x, y);
//		}
		
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		System.out.println("CanvasWithMouseMotionListener.mouseMoved");	
		 xMouse = e.getX();
		 yMouse = e.getY();
		XYCoor.setX(xMouse);
		XYCoor.setY(yMouse);
		
//		For Problem 3
//		Graphics g = getGraphics();
//		g.setColor(Color.RED);
//		g.fillOval(xMouse-25, yMouse-25, 50, 50);
	}
	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("CanvasWithKeyListener.keyPressed: " + e.getKeyCode());
		char[] data = new char[1];
		char type = e.getKeyChar();
		data[0] = type;
		Graphics g = getGraphics();
		
		if(e.getExtendedKeyCode() == 49) {
			colorChange = 49;
		}
		if(e.getExtendedKeyCode() == 50) {
			colorChange = 50;
		}
		if(e.getExtendedKeyCode() == 51) {
			colorChange = 51;
		}
		if(e.getExtendedKeyCode() == 52) {
			colorChange = 52;
		}
		if(e.getExtendedKeyCode() == 53) {
			colorChange = 53;
		}
		if(e.getExtendedKeyCode() == 54) {
			colorChange = 54;
		}
		if(colorChange == 49) {
			g.setColor(Color.RED);
			if(!key) {
				System.out.println(e.getKeyCode());
				pos = pos + 10;
				g.drawChars(data, 0, 1, XYCoor.getX()+pos, XYCoor.getY());
			}else {
				g.drawChars(data, 0, 1, XYCoor.getX(), XYCoor.getY());

			}
		}
		else if(colorChange == 50) {
			g.setColor(Color.BLUE);
			if(!key) {
				System.out.println(e.getKeyCode());
				pos = pos + 10;
				g.drawChars(data, 0, 1, XYCoor.getX()+pos, XYCoor.getY());
			}else {
				g.drawChars(data, 0, 1, XYCoor.getX(), XYCoor.getY());

			}
		}
		else if(colorChange == 51) {
			g.setColor(Color.GREEN);
			if(!key) {
				System.out.println(e.getKeyCode());
				pos = pos + 10;
				g.drawChars(data, 0, 1, XYCoor.getX()+pos, XYCoor.getY());
			}else {
				g.drawChars(data, 0, 1, XYCoor.getX(), XYCoor.getY());

			}
		}
		else if(colorChange == 52) {
			g.setColor(Color.ORANGE);
			if(!key) {
				System.out.println(e.getKeyCode());
				pos = pos + 10;
				g.drawChars(data, 0, 1, XYCoor.getX()+pos, XYCoor.getY());
			}else {
				g.drawChars(data, 0, 1, XYCoor.getX(), XYCoor.getY());

			}
		}
		else if(colorChange == 52) {
			g.setColor(Color.ORANGE);
			if(!key) {
				System.out.println(e.getKeyCode());
				pos = pos + 10;
				g.drawChars(data, 0, 1, XYCoor.getX()+pos, XYCoor.getY());
			}else {
				g.drawChars(data, 0, 1, XYCoor.getX(), XYCoor.getY());

			}
		}
		else if(colorChange == 53) {
			g.setColor(Color.PINK);
			if(!key) {
				System.out.println(e.getKeyCode());
				pos = pos + 10;
				g.drawChars(data, 0, 1, XYCoor.getX()+pos, XYCoor.getY());
			}else {
				g.drawChars(data, 0, 1, XYCoor.getX(), XYCoor.getY());

			}
		}
		else if(colorChange == 54) {
			g.setColor(Color.BLACK);
			if(!key) {
				System.out.println(e.getKeyCode());
				pos = pos + 10;
				g.drawChars(data, 0, 1, XYCoor.getX()+pos, XYCoor.getY());
			}else {
				g.drawChars(data, 0, 1, XYCoor.getX(), XYCoor.getY());

			}
		}else {
			if(!key) {
				System.out.println(e.getKeyCode());
				pos = pos + 10;
				g.drawChars(data, 0, 1, XYCoor.getX()+pos, XYCoor.getY());
			}else {
				g.drawChars(data, 0, 1, XYCoor.getX(), XYCoor.getY());

			}
		}
	}
	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("CanvasWithKeyListener.keyReleased: " + e.getKeyCode());
	}
	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("CanvasWithKeyListener.keyTyped: " + e.getKeyChar());
	}
}
