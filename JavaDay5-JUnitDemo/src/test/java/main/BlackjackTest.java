package main;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BlackjackTest {
	
Blackjack black; 	// this will create a new instance of Blackjack every time the test is run
	
	
	@Before
	public void setup() {
		
	Blackjack black = new Blackjack();
	}
		
		
	@Test
	public void testPlayDealerWin() {
		int input1 = 21;
		int input2 = 20;
		int expected = 21; 
		
		assertEquals(expected, black.play(input1, input2));  
	}		
	
	@Test
	public void testPlayPlayerWin() {
		int input1 = 20;
		int input2 = 21;
		int expected = 21; 
		
		assertEquals(expected, black.play(input1, input2));  
	}		
		
	@Test
	public void testPlayDraw() {
		int input1 = 20;
		int input2 = 20;
		int expected = 20; 
		
		assertEquals(expected, black.play(input1, input2));  
	}		
		
	
	@After
	public void afterTest() {
	
	}    
	
	}


