package Task3;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.BeforeMethod;


public class R2 {
	
	@BeforeMethod
	public static void retrieve_value() throws Throwable, Throwable {
		List<Field> privateFields = new ArrayList<>();
		Field[] allFields = R3.class.getDeclaredFields();
		//Field[] allFields.getAllFields(R1.class);
		for (Field f1 : allFields) {
			if (Modifier.isPrivate(f1.getModifiers())) {
				privateFields.add(f1);
			}
		}
		String result="";
		for(Field f2: privateFields){
			String fieldName=f2.getName();
			Field field = R3.class.getDeclaredField(fieldName);
			Class<?> t = field.getType();
			field.setAccessible(true);
			if(field.isAccessible() && t == int.class){
				result = (String.valueOf(field.get(null)));
				System.out.println(fieldName+" value is = "+result);
			}
			else if (field.isAccessible() && t == String.class) {
				result = (String) field.get(null);
				System.out.println(fieldName+" value is = "+result);
			}
			//System.out.println(fieldName+" value is = ");
		}
	}
}