package Task3;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class R3 {

	private static final String naa=null;
	private static final String ncc="Java";
	private static final int nvate=12;

	/*public static void main(String[] args) throws Throwable {
		R2.retrieve_value();
	}*/
	/*@BeforeMethod
	public void r3_retv_before() throws Throwable {
		R2.retrieve_value();
	}*/

	@Test
	public void r3_retv() throws Throwable {
		System.out.println("changed");
		String naa= new String("new String");
		System.out.println(naa);
	}
	
	@Test
	public void r4_retv() throws Throwable {
		
	}

	/*@AfterMethod
	public void r3_retv_after() throws Throwable {
		R2.retrieve_value();
	}*/
}
