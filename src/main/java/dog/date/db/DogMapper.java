package dog.date.db;

import java.sql.ResultSet;
import java.sql.SQLException;

import dog.date.models.Dog;

/**
 * The DogMapper is used to map the SQL results to their object.
 * 
 * @author RedBird1
 *
 */
public class DogMapper {
	
	/**
	 * mapRow method transforms a record from the DOGS table into a java object.
	 * 
	 * @param rs
	 * @return {@link Dog}
	 * @throws SQLException
	 */
	public Dog mapRow(ResultSet rs) throws SQLException {
		Dog dog = new Dog();
		dog.setUid(rs.getString("dog#"));
		dog.setOwnerUid(rs.getString("owner#"));
		dog.setBreed(rs.getString("breed"));
		dog.setHeight(rs.getDouble("height"));
		dog.setWeight(rs.getDouble("weight"));
		dog.setAge(rs.getInt("age"));
		return dog;
	}
	
}
