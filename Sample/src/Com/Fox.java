package Com;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.lang.model.util.SimpleAnnotationValueVisitor6;

public class Fox {

	public String swap(String input1,String input2) {
		
		
		if(input1.contains(input2)) {
			
		return "Yes";	
		}
		return "NO";
		
		
	}
	public static void main(String[] args) {
		Date now = new Date();
		  Calendar calendar = Calendar.getInstance();
		  SimpleDateFormat s= new SimpleDateFormat("MM/dd/YYYY");
		  
		  int i=calendar.get(Calendar.DAY_OF_WEEK); 
		  calendar.add(Calendar.DAY_OF_YEAR, i);
		
		 String m= s.format(calendar.getTime());
	
		 System.out.println(m);
	}
}
