package dog.date.models;

import java.util.UUID;

public class Dog {
	
	private static final long serialVersionUID = 42L;
	
	private UUID uid;
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
	 * Initializes object with a unique id.
	 */
	public Dog(UUID uid, String name, double height, double weight, int age) {
		this.uid = uid;
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.age = age;
	}
	
	/**
	 * Initializes object without a unique id.
	 */
	public Dog(String name, String breed, double height, double weight, int age) {
		this.name = name;
		this.breed = breed;
		this.height = height;
		this.weight = weight;
		this.age = age;
	}
	
	public UUID getUid() {
		return uid;
	}

	public void setUid(UUID uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
