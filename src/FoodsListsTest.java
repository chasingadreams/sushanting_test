

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FoodsListsTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetFoodName() {
		assertEquals(new FoodsLists().getFoodName(),("√€Ë÷"));
	}

	@Test
	public void testGetFoodId() {
		assertEquals(new FoodsLists().getFoodId(),("1"));
	}

	@Test
	public void testGetFoodPrice() {
		assertEquals(new FoodsLists().getFoodPrice(),("74.4"));
	}

	@Test
	public void testGetFoodData() {
		assertEquals(new FoodsLists().getFoodData(),("2018-8-28"));
	}

}
