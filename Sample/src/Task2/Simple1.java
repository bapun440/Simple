package Task2;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class Simple1 {
	
	public static void main(String[] args) {

	    try {

	        Field testMap = FinalPrivateField.class.getDeclaredField("testMap");
	        testMap.setAccessible(true);

	        ParameterizedType type = (ParameterizedType) testMap.getGenericType();

	        Type key = type.getActualTypeArguments()[0];

	        System.out.println("Key: " + key);

	        Type value = type.getActualTypeArguments()[1];

	        System.out.println("Value: " + value);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
}
