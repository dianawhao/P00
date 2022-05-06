import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.ArrayList;

public class CalculatorTest {
	private int a, b, c;
	Calculator cal; 

	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

	}

	@Before
	public void setUp() throws Exception {
		cal = new Calculator();
		a = 4321;
		b = 1234;
		c = 0;
	}

	@Test
	public void testAdd() {
		// Arrange
		int a = 54321;
		int b = 12345;
		Calculator cal = new Calculator();
		
		//Act
		int actual = cal.add(a, b); 
		
		//Assert
		int expected = 66666;
		assertEquals (expected, actual);
	}
	

	@Test
	public void testSubtract() {
		//fail("Not yet implemented");

		 int actual = cal.subtract(a, b);
		 int expected = 3087;
		 assertEquals (expected,actual);
	}
	
	@Test
	public void testMultiply() {
		//fail("Not yet implemented");

		 int actual = cal.multiply(a, b);
		 int expected = 5332114;
		 assertEquals (expected,actual);
	}
	@Test
	public void testMultiplyWith0() {
		//fail("Not yet implemented");

		 int actual = cal.multiply(a, c);
		 int expected = 0;
		 assertEquals (expected,actual);
	}
	@Test
	public void testDivideWithNon0Denominator () {
		//fail("Not yet implemented");

		 int actual = cal.divide(a, b);
		 int expected = 3;
		 assertEquals (expected,actual);
	}
	
	@Test
	public void testDivideWith0Denominator () {
		//fail("Not yet implemented");

		 try {
			 Calculator cal = new Calculator();
			 cal.divide(a, c);
			 fail("Expected an IllegalArgumentException to be thrown");
			  }catch(IllegalArgumentException e) {
				  assertEquals("Division by zero is not supported", e.getMessage() );
			  }catch(Throwable t) {
				  assertEquals( "Expected an IllegalArgumentException to be thrown", t.getMessage());
			  }
	}
	
	@Test
	public void testAddList() {
		Calculator cal = new Calculator();
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        
		int actual = cal.addList(arr);
		int expected = 15;
		assertEquals (expected, actual);

	}

	
	@After
	public void tearDown() throws Exception {
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
}


