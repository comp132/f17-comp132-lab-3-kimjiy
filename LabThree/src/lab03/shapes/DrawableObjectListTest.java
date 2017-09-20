package lab03.shapes;

import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.Before;
import org.junit.Test;

public class DrawableObjectListTest {

private DrawableObjectList d1;
private Circle c1;
	
	@Before
    public void setUp() throws Exception {
        /*
         * Construct all of the objects being used in the test fixture here.
         */
        d1 = new DrawableObjectList();
        c1 = new Circle(5,3,4,Color.black);
    }
	@Test
	public void testDrawableObjectList() {
		assertEquals("Wrong size value", 0, d1.getSize());
	}
	
	@Test
	public void testGetSize() {
		d1.addDrawable(c1);
		assertEquals("Wrong size value", 1, d1.getSize());
	}
	
	@Test
	public void testAddDrawable() {
		assertEquals("Wrong size value", 0, d1.getSize());
		d1.addDrawable(c1);
		assertEquals("Wrong size value", 1, d1.getSize());
	}
	
	@Test
	public void testRemoveDrawable() {

		d1.addDrawable(c1);
		assertEquals("Wrong size value", 1, d1.getSize());
		d1.removeDrawable(c1);
		assertEquals("Wrong size value", 0, d1.getSize());
	}
	
	@Test
	public void testScaleAll() {
		d1.addDrawable(c1);
		assertEquals("Wrong radius value", 4, c1.getRadius());
		d1.scaleAll(0.5);
		assertEquals("Wrong radius value", 2, c1.getRadius());
	}

}
