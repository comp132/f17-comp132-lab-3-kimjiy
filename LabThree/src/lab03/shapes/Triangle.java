package lab03.shapes;

import java.awt.Color;
import java.awt.Graphics;

		
/**
 * A Triangle is an object representing a triangle. A Triangle has a three points
 * (x1,y1), (x2,y2), (x3,y3) and a color. It can be moved, translated, scaled and drawn, draw line.
 */
	public class Triangle implements Drawable{

		int [] xPoint = new int[3];
		int [] yPoint = new int[3];
		private Color theColor;
		private boolean isVisible;

		 /**
	     * Construct a new Triangle centered at initX, initY with a radius of
	     * initRadius and color indicated by initColor. The new Triangle is visible by
	     * default.
	     * 
	     * @param initX the x coordinate of the center of the circle.
	     * @param initY the y coordinate of the center of the circle.
	     * @param initRadius the radius of the circle.
	     * @param initColor the color of the circle.
	     */
	    public Triangle(int initX1, int initX2, int initX3, int initY1, int initY2, int initY3,
	    			  Color initColor) {
	    	xPoint[0] = initX1;
	    	xPoint[1] = initX2;
	    	xPoint[2] = initX3;
	    	yPoint[0] = initY1;
	    	yPoint[1] = initY2;
	    	yPoint[2] = initY3;
	    	
	        theColor = initColor;
	        isVisible = true;
	    }

	    // === Implementation of the Drawable interface ===

	    /**
	     * Draw this DrawableTriangle onto the specified Graphics object.
	     * 
	     * @param g the Graphics object on which to draw this DrawableTriangle.
	     */
		@Override
		public void draw(Graphics g) {
			 g.setColor(getColor());
		     g.fillPolygon(xPoint,yPoint, 3);
		}

		/**
	     * Get the Color of this Triangle.
	     * 
	     * @return the color.
	     */
		@Override
		public Color getColor() {
			return theColor;
		}

	    /**
	     * Change the color of this Triangle to the newColor.
	     * 
	     * @param newColor the new color.
	     */
		@Override
		public void setColor(Color newColor) {
			theColor = newColor;
		}

	    /**
	     * Set whether or not this Triangle will be visible. If it is visible its draw
	     * method will be invoked when the DrawingTablet is repainted. If it is not
	     * visible its draw method will not be invoked.
	     * 
	     * @param visible true to make this Triangle visible, false to make it
	     *            invisible.
	     */
		@Override
		public void setVisible(boolean visible) {
			isVisible = visible;
			
		}

	    /**
	     * Find out if this Triangle is visible or not.
	     * 
	     * @return true if the Triangle is visible, false if it is not.
	     */
		@Override
		public boolean isVisible() {

			return isVisible;
		}

}
