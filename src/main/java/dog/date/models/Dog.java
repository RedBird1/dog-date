package dog.date.models;

import java.util.UUID;

/**
 * Dog
 * 
 * @author Redbird1
 *
 */
public class Dog {
	
	private static final long serialVersionUID = 42L;
	
	private String uid;
	private String breed;
	private double height;
	private double weight;
	private int age; // Human Years
	
	/**
	 * Default constructor for empty instance.
	 */
	public Dog() {
		
	}
	
	/**
	 * Initializes object with a unique id.
	 */
	public Dog(String uid, String breed, double height, double weight, int age) {
		this.uid = uid;
		this.height = height;
		this.weight = weight;
		this.age = age;
	}
	
	/**
	 * Initializes object without a unique id.
	 */
	public Dog(String breed, double height, double weight, int age) {
		this.breed = breed;
		this.height = height;
		this.weight = weight;
		this.age = age;
	}
	
	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
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
