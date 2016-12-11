package dog.date.models;

public class Profile {
	
	private static final long serialVersionUID = 41L;
	
	private String city;
	private String state;
	private String zip;

	public Profile() {
		
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
