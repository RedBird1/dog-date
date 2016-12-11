package dog.date.models;

/**
 * 
 * @author RedBird1
 *
 */
public class User {
	
	private static final long serialVersionUID = 25L;

	private String uid;
	private String userName;
	private String password;
	
	/**
	 * Default constructor for empty instance.
	 */
	public User() {
		
	}
	
	/**
	 * Initializes object with a unique id.
	 */
	public User(String uid, String userName, String password) {
		this.uid = uid;
		this.userName = userName;
		this.password = password;
	}
	
	/**
	 * Initializes object without a unique id.
	 */
	public User(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
