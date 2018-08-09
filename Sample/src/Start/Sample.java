package Start;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Properties;
import java.util.Set;

public class Sample {

	public static void main(String[] args) throws IOException {

		
		FileInputStream fis=new FileInputStream("D:\\Test_Practice\\Sample\\Folder\\Data.properties");
		
		Properties pro=new Properties();
		
		pro.load(fis);
		Set<Object>s=pro.keySet();
		
		for(Object obj:s) {
		String s1=pro.getProperty(obj.toString());
		
		System.out.println(s1);
		
		}
		FileOutputStream fo=new FileOutputStream("D:\\Test_Practice\\Sample\\Folder\\Data.properties");
		
		pro.setProperty("Anbunithi", "Sai");
		
		pro.put("Kannan", "RK");
		
		 pro.store(fo, "PSC Test Data");
 		 
		 fo.close();
		
		 
		 LinkedList<String>l=new LinkedList<String>();
		 
		
		 
		 System.out.println(l.poll());
		 
		 System.out.println(l);
		 
	}

}
