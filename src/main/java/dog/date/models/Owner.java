package dog.date.models;

import java.util.UUID;

/**
 * 
 * @author RedBird1
 *
 */
public class Owner {

	private String uid;
	private String name;
	private static final long serialVersionUID = 43L;
	
	/**
	 * Default constructor for empty instance.
	 */
	public Owner() {
		
	}
	
	/**
	 * Initializes object with a unique id.
	 */
	public Owner(String uid, String name) {
		this.uid = uid;
		this.name = name;
	}
	
	/**
	 * Initializes object without a unique id.
	 */
	public Owner(String name) {
		this.name = name;
	}
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	
}
