package Cox;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Hashtable;

public class Test4 {

	
	public static void main(String[] args) {
		
	

	String s1="Anbunithi";
	
	String s3="Anbunithi";
	
	String s2=new String("Anbunithi");
	
	if(s1.equals(s2)) {
		
		System.out.println("Pass");
	}

	System.out.println(System.identityHashCode(s1));
	
	System.out.println(System.identityHashCode(s2));
	
	System.out.println(System.identityHashCode(s3));
	
	String s4="    ";
	
	ArrayList<String>a=new ArrayList<String>();
	
	
	a.add("asdsad");
	
	a.add("   ");
	
	a.add("aaaa");
	
	
	String h="    ";
	String h1=h.trim();
	
	a.add(h1);
	System.out.println(a);
	
	System.out.println(a.size());
	
	
	/*
	a.removeAll(Arrays.asList("",null));
	
	System.out.println(a);*/
		/*
		  try {
		
		byte[] dec = BASE64DecoderStream.decode(str.getBytes());
		
		byte[] utf8 = dcipher.doFinal(dec);
		
		new String(utf8, "UTF8");
		
		
		  catch (Exception e) {
	
		
		    e.printStackTrace();
		
		  }
*/
	
	}
	 
	}