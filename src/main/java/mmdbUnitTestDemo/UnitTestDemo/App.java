package mmdbUnitTestDemo.UnitTestDemo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	int[] par = { 1, 2, 3};
    	Course test = new Course();
    	test.setName("Course1");
    	test.setPar(par);
        System.out.println( test.getNumberOfHoles() );
    }
}
