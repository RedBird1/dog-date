package dog.date.db;

import java.util.UUID;

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
	 * <p></p> 
	 */
	public void createDog(Dog dog) {
		// TODO: create a dog record
	}
	
	/**
	 * <p></p>
	 * @return
	 */
	public Dog readDog(UUID dogUid) {
		// TODO: read a dog record
		return null;
	}
	
	/**
	 * <p></p> 
	 */
	public void updateDog(Dog dog) {
		// TODO: update a dog record
	}
	
	/**
	 * <p></p>
	 */
	public void deleteDog() {
		// TODO: delete a dog record
	}
}
