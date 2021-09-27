package main;
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;			// use ctrl shift to to import them all
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
	
//	@BeforeClass							dont need to use this for our calculator as we arent connecting to anything
//	public static void init() {
//		//init because initialising 
//		System.out.println("Before Class");
//	}
	
	Calculator calc; 	// this will create a new instance of the calculator every time the test is run
	
	
	@Before
	public void setup() {
		System.out.println("Before Test");
		calc = new Calculator();		// before every test make calc a new instance of a calculator
	}
	@Test
	public void testAddition() { 			// there is a structure that you should adhere to iin your test
		System.out.println("Test Addition");
		double input1 = 2.0d;		// set up what you are expecting
		double input2 = 2.0d;
		double expected = 4.0d;
		
		assertEquals(expected, calc.add(input1, input2), 0); 	// then use assertions that will do the test for you - dont need to write custom logic
																// should be expected result then actual
																// the 0 on the end is a delta, its needed as these are doubles and the method is depreciated for these
	}															// the delta is the amount of variation from the expected you can allow
																// useful for testing maths and science etc to check the accuracy 
	@Test
	public void testSubtraction() {
		System.out.println("Test Subtraction");
		double input1 = 5.0d;
		double input2 = 3.0d;
		double expected = 2.0d;
		
		assertEquals(expected, calc.sub(input1, input2),0);
	}
	
	@Test
	public void testDivision() {
		System.out.println("Test Division");
		double input1 = 6.0d;
		double input2 = 3.0d;
		double expected = 2.0d;
		
		assertEquals(expected, calc.div(input1, input2),0);
	}
	
	@Test
	public void testMultiplication() {
		System.out.println("Test Multiplication");
		double input1 = 3.0d;
		double input2 = 3.0d;
		double expected = 9.0d;
		
		assertEquals(expected, calc.multi(input1, input2),0);
	}
	
	@After
	public void afterTest() {
		System.out.println("After test");
	
	}
//	@AfterClass									// dont need this for calculator
//	public static void afterClass() {  // before and after class need to be static as they exist outside the class
//		System.out.println("After Class");
//	}

}
