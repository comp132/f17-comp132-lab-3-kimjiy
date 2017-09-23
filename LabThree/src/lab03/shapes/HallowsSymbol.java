package lab03.shapes;

import java.awt.Color;

/**
 * A simple example of how to create a picture and an animation.
 * This example draws a triangle at the center of the window,
 * after 2 seconds a circle is drawn inside the triangle 
 * and after one more second a rectangle is drawn in the triangle
 * After another 3 seconds the circle turns red
 *
 * @author Jiyoon Kim, Zhen Luo
 * @author Dickinson College
 * @version Sep. 24, 2017
 */
public class HallowsSymbol {
	/**
	 *Draw a triangle at the center of the window,
	 * after 2 seconds a circle is drawn inside the triangle 
	 * and after one more second a rectangle is drawn in the triangle
	 * After another 3 seconds the circle turns red
	 * 
	 * @param args none
	 */
	public static void main(String[] args) {
		/*
         * Create a DrawableObject list and use it to create a DrawingTablet.
         */
        DrawableObjectList objList = new DrawableObjectList();
        DrawingTablet tablet = new DrawingTablet("Hallows Symbol", 200, 200, objList);

        // Create a green triangle at the center of the screen.
        Triangle t1 = new Triangle(0,50,100,0,90,0, Color.orange);
        objList.addDrawable(t1);
        
        /*
         * Each time a change is made to the DrawableObjectList or to one of
         * the Drawable objects that it contains you need to invoke repaint() 
         * on the DrawingTablet.  This causes the Drawing tablet to repaint
         * the screen reflecting the changes. 
         */
        tablet.repaint();
        
        /*
         * sleep is a static method in the AnimationTimer class that causes
         * the program to pause for a specified number of milliseconds when 
         * it is invoked.  This line sleeps for 3 seconds.
         */
        AnimationTimer.sleep(2000);
        
        // Create a green circle at the center of the screen.
        Circle c1 = new Circle(50, 30, 30, Color.pink);
        objList.addDrawable(c1);
        
        //repaint!
        tablet.repaint();
        
        // sleeps for a second
        AnimationTimer.sleep(1000);
        
        // Create a rectangle at the center of the screen.
        Rectangle r1 = new Rectangle(49, 0, 90, 2, Color.GRAY);
        objList.addDrawable(r1);
        
        //repaint!
        tablet.repaint();
        
        //sleeps for three seconds
        AnimationTimer.sleep(3000);
        
     // Change the color and repaint.
        r1.setColor(Color.red);
        tablet.repaint();
	}
}
