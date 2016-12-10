package dog.date.models;

public class Dog {
	
	private String name;
	private String breed;
	private double height;
	private double weight;
	private int age; // Human Years
	
	/**
	 * Default constructor
	 */
	public Dog() {
		
	}
	
	/**
	 * Special constructor
	 */
	public Dog(String name, String breed, double height, double weight, int age) {
		this.name = name;
		this.breed = breed;
		this.height = height;
		this.weight = weight;
		this.age = age;
	}
}
