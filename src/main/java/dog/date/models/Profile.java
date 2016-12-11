package dog.date.models;

import java.util.UUID;

/**
 * <p> A profile belongs to a dog. </p>
 * 
 * <p>The profile contains information about a specific dog.</p>
 * 
 * <p>These characteristics include name, city, state, and zip. </p>
 * 
 * @author RedBird1
 *
 */
public class Profile {
	
	private static final long serialVersionUID = 41L;
	
	private UUID uid; // Primary key
	private UUID dogUid; // Foreign key for dog to profile relationship
	private String bio;
	private String name;
	private String city;
	private String state;
	private String zip;

	/**
	 * Default constructor for empty instance.
	 */
	public Profile() {
		
	}
	
	/**
	 * Initializes object with a uid.
	 */
	public Profile(UUID uid, String bio, String name, String city, String state, String zip){
		this.uid = uid;
		this.bio = bio;
		this.name = name;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	
	/**
	 * Initializes object without a uid.
	 */
	public Profile(String bio, String name, String city, String state, String zip) {
		this.bio = bio;
		this.name = name;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	
}
