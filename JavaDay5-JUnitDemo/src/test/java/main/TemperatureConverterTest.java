package main;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TemperatureConverterTest {
	
	TemperatureConverter temp;
	
	@Before
	public void setup() {
		temp = new TemperatureConverter();
		
	}
	
	@Test
public void convertFahrenheitToCelsiusTest() {
		int input1 =  32;
		float expected = 0;

		assertEquals(expected, temp.convertFahrenheitToCelsius(input1),0);
	}
	
	@Test
public void convertCelsiusToFahrenheitTest() {
		int input1 =  0;
		float expected = 32;
		
		assertEquals(expected, temp.convertCelsiusToFahrenheit(input1),0.1);
		
	}
	
	@Test
	public void convertKelvinToCelsiusTest() {
		int input1 =  373;
		float expected = 100;
		
		assertEquals(expected, temp.convertKelvinToCelsius(input1),0.1);
			
		}
	
	@Test
	public void convertCelsiusToKelvinTest() {
		int input1 =  100;
		float expected = 373;
		
		assertEquals(expected, temp.convertCelsiusToKelvin(input1),0.1);
			
		}
	@Test
	public void convertKelvinToFahrenheitTest() {
		int input1 =  300;
		float expected = 80f;
		
		assertEquals(expected, temp.convertKelvinToFahrenheit(input1),1);
			
		}
	
	@Test
	public void convertFahrenheitToKelvinTest() {
		int input1 =  100;
		float expected = 310.7f;
		
		assertEquals(expected, temp.convertFahrenheitToKelvin(input1),1);
			
		}
	
	@Test
	public void isConverter() {
	assertTrue(temp instanceof TemperatureConverter); // this checks if it is an instance of the temp converter
		}
	
	@Test
	public void dataType() {
		
		
														//check the data being passed in is the right type of data
	}
	
	
	@After
public void after() {
		
	}

}
