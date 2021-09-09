package model;

/**
 * @author jakem - jrmeyer4
 * CIS175 - Fall 2021
 * Sep 9, 2021
 */
public class Person {
	private int age;
	private String name;
	private String gender;
	
	public Person() {
		super();
	}

	public Person(int age, String name, String gender) {
		super();
		this.age = age;
		this.name = name;
		this.gender = gender;
	}

	public String getGender() {
		return gender;
	}

	
	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	
	public void setAge(int age) {
		this.age = age;
	}

	
	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	

}
