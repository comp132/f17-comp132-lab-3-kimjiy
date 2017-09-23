package lab03.shapes;

import static org.junit.Assert.*;
import java.awt.Color;

import org.junit.Before;
import org.junit.Test;


public class RectangleTest {

    private Rectangle r1;
    
    @Before
    public void setUp() throws Exception {
        r1 = new Rectangle(3,5,10,20,Color.blue);
    }

    @Test
    public void testConstructor() {
        assertEquals("wrong x", 3, r1.getX());
        assertEquals("wrong y", 5, r1.getY());
        assertEquals("wrong height", 10, r1.getHeight());
        assertEquals("wrong width", 20, r1.getWidth());
        assertEquals("wrong color", Color.blue, r1.getColor());
        assertTrue("should be visible", r1.isVisible());
    }
    
    @Test
    public void testSetColor() {
        r1.setColor(Color.red);
        assertEquals("wrong color", Color.red, r1.getColor());     
    }
    
    @Test
    public void testSetVisible() {
        r1.setVisible(false);
        assertFalse("should be invisible", r1.isVisible());
        
        r1.setVisible(true);
        assertTrue("should be visible", r1.isVisible());
    }
    
    @Test 
    public void testSetHeight() {
        r1.setHeight(20);
        assertEquals("wrong height", 20, r1.getHeight());
        
        r1.setHeight(-20);
        assertEquals("wrong height", 20, r1.getHeight());
    }
    
    @Test 
    public void testSetWidth() {
        r1.setWidth(10);
        assertEquals("wrong width", 10, r1.getWidth());
        
        r1.setWidth(-10);
        assertEquals("wrong width", 10, r1.getWidth());
    }
    
   
    @Test
    public void testTranslate() {
        r1.translate(5,10);
        assertEquals("wrong x", 8, r1.getX());
        assertEquals("wrong y", 15, r1.getY());
    }
    
    @Test
    public void testScale() {
        r1.scale(2.0);
        assertEquals("wrong height", 20, r1.getHeight());
        assertEquals("wrong width", 40, r1.getWidth());
        
        r1.scale(0.5);
        assertEquals("wrong height", 10, r1.getHeight());
        assertEquals("wrong width", 20, r1.getWidth());
        
        r1.scale(-2.0);
        assertEquals("wrong height", 10, r1.getHeight());
        assertEquals("wrong width", 20, r1.getWidth());
    }
    
    @Test
    public void testContainsTrue() {
    	assertTrue("the point is not in the rectangle", r1.contains(5, 7));
    }
    
    @Test
    public void testContainsFalse() {
    	assertFalse("the point is in the rectangle", r1.contains(50, 7));
    	assertFalse("the point is in the rectangle", r1.contains(0, 7));
    	assertFalse("the point is in the rectangle", r1.contains(5, 70));
    	assertFalse("the point is in the rectangle", r1.contains(5, 1));
    }
}
