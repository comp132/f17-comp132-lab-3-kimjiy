package lab03.shapes;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangle implements Drawable, Scaleable{
	
	private int x;
    private int y;
    private int height;
    private int width;
    private Color theColor;
    private boolean isVisible;
    
    /**
     * Construct a new Rectangle centered at initX, initY with height and width of
     * initHeight and initWidth and color indicated by initColor. The new Rectangle is visible by
     * default.
     * 
     * @param initX the x coordinate of the lower left corner of the rectangle.
     * @param initY the y coordinate of the lower left corner of the rectangle.
     * @param initHeight the height of the rectangle.
     * @param initWidth the width of the rectangle.
     * @param initColor the color of the rectangle.
     */
    public Rectangle(int initX, int initY, int initHeight, int initWidth,Color initColor) {
        x = initX;
        y = initY;
        height = initHeight;
        width = initWidth;
        theColor = initColor;
        isVisible = true;
    }
    
    /**
     * Get the x coordinate of the lower left corner of this Rectangle.
     * 
     * @return the x coordinate
     */
    public int getX() {
        return x;
    }

    /**
     * Get the y coordinate of the lower left corner of this Rectangle.
     * 
     * @return the y coordinate
     */
    public int getY() {
        return y;
    }

    /**
     * Get the radius of this Circle.
     * 
     * @return the height
     */
    public int getHeight() {
        return height;
    }
    
    /**
     * Get the width of this Rectangle.
     * 
     * @return the width
     */
    public int getWidth() {
        return width;
    }
    

    /**
     * Set the height of this Rectangle. The Rectangle's height is set to the absolute
     * value of the specified height to eliminate any negative height values.
     * 
     * @param newHeight the height of the new rectangle.
     */
    public void setHeight(int newHeight) {
        height = Math.abs(newHeight);
    }
    
    /**
     * Set the width of this Rectangle. The Rectangle's width is set to the absolute
     * value of the specified width to eliminate any negative width values.
     * 
     * @param newWidth the width of the new rectangle.
     */
    public void setWidth(int newWidth) {
        width = Math.abs(newWidth);
    }
    
    /**check if the given x and y points are contained on this rectangle.
     * @param checkX,checkY the coordinates of x and y to be checked.
     */
    public boolean contains (int checkX, int checkY) {
    	if (x <= checkX && checkX <= x+width && y<= checkY && checkY <= y+height) {
    		return true;
    	}
    	return false;
    }
    
    /**
     * Move the Rectangle relative to its current location. The lower left corner of the
     * rectangle is moved by adding the parameters to the Rectangle's current
     * location.
     * 
     * @param deltaX the change in the x coordinate. Positive values move the
     *            Rectangle to the right, negative values move it to the left.
     * @param deltaY the change in the y coordinate. Positive values move the
     *            Rectangle down, negative values move it up.
     */
    public void translate(int deltaX, int deltaY) {
        x = x + deltaX;
        y = y + deltaY;
    }
    
    
	@Override
	public void scale(double factor) {
		 if (factor > 0) {
	            height = (int) (Math.round(height * factor));
	            width = (int) (Math.round(width * factor));
	        }
	}

	@Override
	public void draw(Graphics g) {
        g.setColor(getColor());
        g.fillRect(x, y, width, height);
		
	}

	/**
     * Get the Color of this Rectangle.
     * 
     * @return the color.
     */
	@Override
	public Color getColor() {
		return theColor;
	}
	/**
     * Set the Color of this Rectangle.
     * 
     * @param newColor the new color
     */
	@Override
	public void setColor(Color newColor) {
		theColor = newColor;
	}

	/**
     * Set whether or not this Rectangle will be visible. If it is visible its draw
     * method will be invoked when the DrawingTablet is repainted. If it is not
     * visible its draw method will not be invoked.
     * 
     * @param visible true to make this Rectangle visible, false to make it
     *            invisible.
     */
	@Override
	public void setVisible(boolean visible) {
		isVisible = visible;
	}

    /**
     * Find out if this Rectangle is visible or not.
     * 
     * @return true if the Rectangle is visible, false if it is not.
     */
	@Override
	public boolean isVisible() {
		return isVisible;
	}

}
