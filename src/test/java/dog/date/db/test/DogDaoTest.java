package dog.date.db.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import dog.date.db.DogDao;
import dog.date.models.Dog;
import junit.framework.TestCase;

public class DogDaoTest extends TestCase {

	private DogDao dogDao; // System under test
	private Dog dog; // Test object
	
	@Before
	public void setUp() {
		dog = new Dog("54947df8-0e9e-4471-a2f9-9af509fb5889","Dachshund", 12, 6, 2);
		dogDao = new DogDao();
		dogDao.createDog(dog);
	}
	
	@After
	public void tearDown() {
		dogDao.deleteDog(dog.getUid());
		dogDao = null;
		dog = null;
	}
	
	@Test
	public void createDogTest() {
		// TODO: Code create method
		Dog actual = dogDao.readDog(dog.getUid());
		
		Assert.assertEquals(dog.getBreed(), actual.getBreed());
		Assert.assertTrue(dog.getHeight() == actual.getHeight());
		Assert.assertTrue(dog.getWeight() == actual.getWeight());
		Assert.assertTrue(dog.getAge() == actual.getAge());
		
	}
	
	@Test
	public void readDogTest() {
		// TODO: Code read method
		
	}
	
	@Test
	public void updateDogTest() {
		// TODO: Code update method
	}
	
	@Test
	public void deleteDogTest() {
		// TODO: Code delete method
	}
}
