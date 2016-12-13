package dog.date.db;

import java.sql.ResultSet;

import dog.date.models.Dog;

/**
 * The DogMapper is used to map the SQL results to their object.
 * 
 * @author RedBird1
 *
 */
public class DogMapper {
	
	public Dog mapDog(ResultSet rs) {
		Dog dog = new Dog();
		// TODO: Map the results
		return dog;
	}

}
