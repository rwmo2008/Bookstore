package com.fdmgroup.bookstore.data;

import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fdmgroup.bookstore.model.AudioBook;
import com.fdmgroup.bookstore.model.Book;
import com.fdmgroup.bookstore.model.Order;
import com.fdmgroup.bookstore.model.User;
import com.fdmgroup.bookstore.model.BookGenre;

public class UserArrayListRepositoryTest {
	private static final BookGenre FICTION = null;
	private UserArrayListRepository testUserArrayListRepo;
	private User testUser;
	private Order testOrder;
	private AudioBook testBook;
	private BookGenre testGenre = FICTION;
	private LocalDateTime time;
	private List<Order> testOrderList;
	private List<User> testUserList;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		time.now();
		testOrderList = new ArrayList<Order>();
		testBook = new AudioBook(1, 1.99, "Audio", "Jim Dale", testGenre , 300);
		testUserList = new ArrayList<User>();
		testOrder = new Order(1, testBook, testUser, time);
		testOrderList.add(testOrder);
		testUser = new User(1, "First", "Last", "username", "password", "gmail", testOrderList);
		testUserList.add(testUser);
		testUserArrayListRepo = new UserArrayListRepository(testUserList);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testValidateReturnTrueFromMatchingUsernamePassword() {
		//Arrange
		//done at setup
		//Act
		boolean result = testUserArrayListRepo.validate("username", "password");
		//Assert
		assertTrue(result);
	}
	
	@Test
	public void testValidateReturnFalseFromNonMatchingUsernamePassword() {
		//Arrange
		//done at setup
		//Act
		boolean result = testUserArrayListRepo.validate("user1", "pass1");
		//Assert
		assertFalse(result);
	}

	@Test
	public void testFindByUsernameReturnTrueIfMatch() {
		//Arrange
		User expected = testUserArrayListRepo.findById(0);
		//Act
		User result = testUserArrayListRepo.findByUsername("username");
		//Assert
		assertEquals(expected.getUsername(), result.getUsername());
	}
	
	@Test
	public void testFindByUsernameReturnNullIfNoMatch() {
		//Arrange
		User expected = null;
		//Act
		User result = testUserArrayListRepo.findByUsername("user1");
		//Assert
		assertEquals(expected, result);
	}
}
