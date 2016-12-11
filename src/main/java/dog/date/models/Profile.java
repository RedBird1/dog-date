package dog.date.models;


/**
 * <p> A profile belongs to a dog. The profile contains information about a specific dog.</p>
 * <p>These characteristics include name, city, state, and zip-code. </p>
 * 
 * @author RedBird1
 *
 */
public class Profile {
	
	private static final long serialVersionUID = 41L;
	
	private String uid; // Primary key
	private String dogUid; // Foreign key for dog to profile relationship
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
	public Profile(String uid, String bio, String name, String city, String state, String zip){
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
	
	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getDogUid() {
		return dogUid;
	}

	public void setDogUid(String dogUid) {
		this.dogUid = dogUid;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
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
