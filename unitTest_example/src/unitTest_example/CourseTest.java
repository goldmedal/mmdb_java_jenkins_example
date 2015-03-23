package unitTest_example;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CourseTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("a");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("b");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("c");
	}

	@After
	public void tearDown() throws Exception {

		
	}

	@Test
	public void test() {
		Course test = new Course();
		int[] par = {2, 2};
		test.setPar(par);
		int leng = test.getNumberOfHoles();
		assertEquals(2, leng);
	}

}
