package Task2;

import java.lang.reflect.Field;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Get_Value {
	
	Field field;
	@BeforeTest
	public void b1() throws Throwable, SecurityException {
	field = Task2.My_Class.class.getDeclaredField("staticField");
	field.setAccessible(true); // Suppress Java language access checking
	}
	
	@Test
	public void t1() throws Throwable, IllegalAccessException {
	String fieldValue = (String) field.get(null);
	System.out.println(fieldValue); // -> A
	}
	
	/*@AfterTest
	public void a1() throws Throwable, IllegalAccessException {
	field.set(null, "B");
	System.out.println(Task2.My_Class.getStaticField()); // -> B
	}*/
}
