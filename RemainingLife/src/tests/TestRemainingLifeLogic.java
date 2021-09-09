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
public class TestRemainingLifeLogic {
	RemainingLifeCalculator calc = new RemainingLifeCalculator();
	Person person = new Person(56,"Bob","something");
	Person person2 = new Person(80,"Bob","something");

	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testRemainingLifeMale() {
		int Remaining = calc.calculateRemainingLifeMale(person);
		assertEquals(20,Remaining,0);
	}
	
	@Test
	public void testRemainingLifeFemale() {
		int Remaining = calc.calculateRemainingLifeFemale(person);
		assertEquals(25,Remaining,0);
	}
	
	@Test
	public void testRemainingLife() {
		int Remaining = calc.calculateRemainingLife(person);
		assertEquals(23,Remaining,0);
	}
	

}
