import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
	static private Calculator calc;
	static int actual;
	static int expected;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("set up before class");
		calc = new Calculator(); 
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tear down after class");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("set up");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("tear down");
	}
	

	@Test
	public void testAddSevenThirteen() {
		System.out.println("add 7 and 13");
		expected = 20;
		 actual = calc.add(7, 13);
		assertEquals("failed to add 7 and 13", expected, actual); 
	}
	
	@Test
	public void testAddMaxValue()
	{
		System.out.println("add MAX_VALUE and MIN_VALUE");
		actual = calc.add(Integer.MAX_VALUE, 1);
		expected = Integer.MIN_VALUE;
		assertEquals("failed to add MAX_VALUE and MIN_VALUE", expected, actual);
	}
	
	@Test
	public void testAddZero()
	{
		System.out.println("add 10 and 0");
		actual = calc.add(10,  0);
		expected = 10;
		assertEquals("failed to add 10 and 0", expected, actual);
	}
	
	@Test(expected=java.lang.ArithmeticException.class)
	public void testDivideByZero()
	{
		calc.divide(10,0);
	}

	
	//we expect this to fail!
	@Test(expected=java.lang.ArithmeticException.class)
	public void testDivideBy1()
	{
		calc.divide(10,1);
	}

	
}
