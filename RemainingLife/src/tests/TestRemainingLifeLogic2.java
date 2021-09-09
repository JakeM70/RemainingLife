package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Person;
import model.RemainingLifeCalculator;

/**
 * @author jakem - jrmeyer4
 * CIS175 - Fall 2021
 * Sep 9, 2021
 */
public class TestRemainingLifeLogic2 {
	RemainingLifeCalculator calc = new RemainingLifeCalculator();
	Person person = new Person(56,"Bob","something");
	Person person2 = new Person(80,"Bob","something");

	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testIsPastAvgLifeSpane() {
		
		assertTrue(calc.pastAvgLifeSpane(person2));
	}
	
	@Test
	public void testIsNotPastAvgLifeSpane() {
		
		assertFalse(calc.pastAvgLifeSpane(person));
	}
	
	@Test
	public void testIsNotNull() {
		
		assertNotNull(person);
	}

}
