package Task3;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;


public class R2 {
	
	public static void main(String[] args) throws NoSuchFieldException, Throwable {
		List<Field> privateFields = new ArrayList<>();
		Field[] allFields = R1.class.getDeclaredFields();
		//Field[] allFields.getAllFields(R1.class);
		for (Field f1 : allFields) {
			if (Modifier.isPrivate(f1.getModifiers())) {
				privateFields.add(f1);
			}
		}
		String result="";
		for(Field f2: privateFields){
			String fieldName=f2.getName();
			Field field = R1.class.getDeclaredField(fieldName);
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