package dog.date.db.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import dog.date.db.DogDao;
import dog.date.models.Dog;
import junit.framework.TestCase;

/**
 * 
 * @author RedBird1
 *
 */
public class DogDaoTest extends TestCase {

	private DogDao dogDao; // System under test
	private Dog dog; // Test object
	
	@Before
	public void setUp() {
		System.out.println("hello world");
		dog = new Dog("54947df8-0e9e-4471-a2f9-9af509fb5889","Dachshund", 12, 6, 2);
		dogDao = new DogDao();
	}
	
	@After
	public void tearDown() {
		dogDao.deleteDog(dog.getUid());
		dogDao = null;
		dog = null;
	}
	
	@Test
	public void createDogTest() {

		System.out.println("hello world");
		// TODO: Code create method
		dogDao.createDog(dog);
		Dog actual = dogDao.readDog(dog.getUid());
		
		Assert.assertTrue(null != actual.getBreed());
	}
	
	@Test
	public void readDogTest() {
		// TODO: Code read method
		dogDao.createDog(dog);
		Dog actual = dogDao.readDog(dog.getUid());
		Assert.assertEquals(dog.getUid(), actual.getUid());
		Assert.assertEquals(dog.getBreed(), actual.getBreed());
		Assert.assertTrue(dog.getHeight() == actual.getHeight());
		Assert.assertTrue(dog.getWeight() == actual.getWeight());
		Assert.assertTrue(dog.getAge() == actual.getAge());	
	}
	
	@Test
	public void updateDogTest() {
		// TODO: Code update method
	}
	
	@Test
	public void deleteDogTest() {
		// TODO: Code delete method
		// Test may change with implementation.
		dogDao.createDog(dog);
		Assert.assertTrue(dogDao.readDog(dog.getUid()) != null);
		dogDao.deleteDog(dog.getUid());
		Assert.assertTrue(dogDao.readDog(dog.getUid()) == null);
	}
}
