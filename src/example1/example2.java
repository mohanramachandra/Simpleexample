package example1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class example2 {
	@AfterClass
	public void Aftercalss() {
		System.out.println(" After class");
	}
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println(" beforemethod ");
	}
	@Test
	public void testcase1() {
		System.out.println(" test case 1");
	}
	
	@Test
	public void testcase2() {
		System.out.println(" test case 2");
	}


	@AfterMethod
	public void aftermethod() {
		
		System.out.println(" Aftermethod ");
		System.out.println(" Aftermethod ");
		System.out.println(" Aftermethod ");
		System.out.println(" Aftermethod ");
		System.out.println(" Aftermethod ");System.out.println(" Aftermethod ");
		System.out.println(" Aftermethod ");
		
	}
	
	
	
	@BeforeClass
	public void beforeclass() {
		System.out.println(" before calss ");
		System.out.println(" before calss ");
		System.out.println(" before calss ");
		System.out.println(" before calss ");
		System.out.println(" before calss ");
		System.out.println(" before calss ");
		System.out.println(" before calss ");
		System.out.println(" before calss ");
	}
}
