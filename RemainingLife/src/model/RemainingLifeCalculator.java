package model;

/**
 * @author jakem - jrmeyer4
 * CIS175 - Fall 2021
 * Sep 9, 2021
 */
public class RemainingLifeCalculator {
	private final int AVGHUMANELIFESPANE = 79;
	private final int AVGMALELIFESPANE = 76;
	private final int AVGFEMALELIFESPANE = 81;
	
	
	public int calculateRemainingLifeMale(Person person) {
		int remLife = 0;
		remLife = AVGMALELIFESPANE - person.getAge();
		return remLife;
	}
	public int calculateRemainingLifeFemale(Person person) {
		int remLife = 0;
		remLife = AVGFEMALELIFESPANE - person.getAge();
		return remLife;
	}
	
	
	public int calculateRemainingLife(Person person) {
		int remLife = 0;
		remLife = AVGHUMANELIFESPANE - person.getAge();
		return remLife;
	}
	
	public boolean pastAvgLifeSpane(Person person) {

		if(person.getAge()> AVGHUMANELIFESPANE) {
			return true;
		} else {
			return false;
		}
	}
	
}
