import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}


	@Before
	public void setUp() throws Exception {
	}


	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		int a = 4321;
		int b = 1234;
		
		 Calculator cal = new Calculator();
		 int actual = cal.add(a, b); //returns 9999
		 
		 int expected = 5555;
		 assertEquals (expected,actual);
	}
	
	@Test
	public void testSubtract() {
		//fail("Not yet implemented");
		int a = 9876;
		int b = 4321;
		 Calculator cal = new Calculator();
		 int actual = cal.subtract(a, b);
		 int expected = 5555;
		 assertEquals (expected,actual);
	}
	
	@Test
	public void testMultiply() {
		//fail("Not yet implemented");
		int a = 9876;
		int b = 0;
		 Calculator cal = new Calculator();
		 int actual = cal.multiply(a, b);
		 int expected = 0;
		 assertEquals (expected,actual);
	}
	@Test
	public void testDivideWithNon0Denominator () {
		//fail("Not yet implemented");
		int a = 6666;
		int b = 3333;
		 Calculator cal = new Calculator();
		 int actual = cal.divide(a, b);
		 int expected = 2;
		 assertEquals (expected,actual);
	}
	
	@Test
	public void testDivideWith0Denominator () {
		//fail("Not yet implemented");
		int a = 3333;
		int b = 0;
		 try {
			 Calculator cal = new Calculator();
			 cal.divide(a, b);
			 fail("Expected an IllegalArgumentException to be thrown");
			  }catch(IllegalArgumentException e) {
				  assertEquals("Division by zero is not supported", e.getMessage() );
			  }catch(Throwable t) {
				  assertEquals( "Expected an IllegalArgumentException to be thrown", t.getMessage());
			  }
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	
	@After
	public void tearDown() throws Exception {
	}
}
