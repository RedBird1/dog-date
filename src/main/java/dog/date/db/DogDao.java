package dog.date.db;


import dog.date.models.Dog;

/**
 * <p>The  data access object used for CRUD functionality on the Dog model.<p>
 * 
 * @See dog.date.models.Dog
 * 
 * @author RedBird1
 *
 */
public class DogDao {
	
	private static final long serialVersionUID = 10L;

	/**
	 * <p>Creates a dog record in the database</p> 
	 */
	public void createDog(Dog dog) {
		// TODO: create a dog record
	}
	
	/**
	 * <p>Read a dog record from the database</p>
	 * @return
	 */
	public Dog readDog(String dogUid) {
		// TODO: read a dog record
		return null;
	}
	
	/**
	 * <p>Updates a dog record in the database</p> 
	 */
	public void updateDog(Dog dog) {
		// TODO: update a dog record
	}
	
	/**
	 * <p>Deletes a dog record from the database</p>
	 */
	public void deleteDog(String dogUid) {
		// TODO: delete a dog record
	}
}
