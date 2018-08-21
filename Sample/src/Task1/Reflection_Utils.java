package Task1;

import java.lang.reflect.Field;

public class Reflection_Utils {

	public static String getVariableValue(Class<?> c,String fieldName){

		String result  = null;
		try {
			Field f = c.getDeclaredField(fieldName);
			Class<?> t = f.getType();
			f.setAccessible(true);
			if(f.isAccessible() && t == int.class){
				result = (String.valueOf(f.get(null)));
			}
			/*else if (f.isAccessible() && t == double.class) {
				result = (String.valueOf(f.get(null)));
			}
			else if (f.isAccessible() && t == String.class) {
				result = (String) f.get(null);
			}*/
			else {
				return "";
			}

		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result ;

	}

	public static void main(String[] args) {
		System.out.println(Reflection_Utils.getVariableValue(Retrieve_Variable.class, "_1st"));
	}
}
