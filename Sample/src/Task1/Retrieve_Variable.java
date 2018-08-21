package Task1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Retrieve_Variable {
	public static final int _1st = 3345678;
	
	@Test
	public void test1() {
		int data=_1st+1;
		System.out.println(data);
	}
	
	@AfterTest
	public void afterChange() {
		System.out.println(Reflection_Utils.getVariableValue(Retrieve_Variable.class, "_1st"));
	}
}
