package Task3;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class R1 {
	private static final String naa=null;
	private static final String ncc="Java";
	private static final int nvate=12;
	
	@BeforeMethod
	public void before_Exec() throws Throwable, Throwable {
		R2.retrieve_value();
	}
	
	@Test
	public static String change_value() {
		String naa= new String("new String");
		return naa;
	}
	
	@AfterMethod
	public void after_Exec() throws Throwable, Throwable {
		R2.retrieve_value();
	}
}
