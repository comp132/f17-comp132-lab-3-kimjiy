package lab03.shapes;

import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.Before;
import org.junit.Test;

public class TriangleTest {
	 private Triangle t1;
	    
	    @Before
	    public void setUp() throws Exception {
	        t1 = new Triangle(0,0,4,3,0,0, Color.CYAN);
	    }

	    @Test
	    public void testConstructor() {
	        assertEquals("wrong xPoint in index 0", 0, t1.xPoint[0]);
	        assertEquals("wrong xPoint in index 1", 0, t1.xPoint[1]);
	        assertEquals("wrong xPoint in index 2", 4, t1.xPoint[2]);
	        assertEquals("wrong yPoint in index 0", 3, t1.yPoint[0]);
	        assertEquals("wrong yPoint in index 1", 0, t1.yPoint[1]);
	        assertEquals("wrong yPoint in index 2", 0, t1.yPoint[2]);
	        assertEquals("wrong color", Color.CYAN, t1.getColor());
	        assertTrue("should be visible", t1.isVisible());
	    }
	    
	    @Test
	    public void testTranslate() {
	    	t1.translate(8,2);
	    	assertEquals("wrong xPoint in index 0",8, t1.xPoint[0]);
	    	assertEquals("wrong xPoint in index 1",8, t1.xPoint[1]);
	    	assertEquals("wrong xPoint in index 2",12,t1.xPoint[2]);
	    	assertEquals("wrong yPoint in index 0",5, t1.yPoint[0]);
	    	assertEquals("wrong yPoint in index 1",2, t1.yPoint[1]);
	    	assertEquals("wrong yPoint in index 2",2, t1.yPoint[2]);
	    }
	    
	    
	    @Test
	    public void testSetColor() {
	        t1.setColor(Color.BLUE);
	        assertEquals("wrong color", Color.BLUE, t1.getColor());     
	    }
	    
	    @Test
	    public void testSetVisible() {
	        t1.setVisible(false);
	        assertFalse("should be invisible", t1.isVisible());
	        
	        t1.setVisible(true);
	        assertTrue("should be visible", t1.isVisible());
	    }

}
