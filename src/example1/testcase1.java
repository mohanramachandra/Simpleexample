package example1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testcase1 {
@BeforeMethod
public void before() {
	System.out.println(" before method "+"\n****************************");
}
@Test
public void testcase1()
{
	System.out.println(" mohan kumar "+"\n******************************");
}

@AfterMethod
public void After() {
	System.out.println(" After method "+"\n*****************************");
}
}
