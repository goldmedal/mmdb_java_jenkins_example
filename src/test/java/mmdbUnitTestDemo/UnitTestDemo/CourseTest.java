package mmdbUnitTestDemo.UnitTestDemo;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CourseTest {

	@Test
	public void test() {
		Course test = new Course();
		int[] par = {2, 2};
		test.setPar(par);
		int leng = test.getNumberOfHoles();
		assertEquals(2, leng);
	}
	
}
