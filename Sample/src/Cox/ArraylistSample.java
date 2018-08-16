package Cox;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.TreeSet;

import javax.swing.JComboBox.KeySelectionManager;

public class ArraylistSample {

	public static void main(String[] args) throws AWTException {

	
	ArrayList<String>arr=new ArrayList<String >();
	
	arr.add("Anbunithi");
	
	arr.add("Car");
	
	arr.add("Boy");
	
	arr.add("Anbunithi");
	
	System.out.println(arr);
	
	
	ArrayList<String>arr1=new ArrayList<String >();
	
	arr1.add("Anbunithi");
	
	System.out.println("Car"+arr.contains("Car"));
	
	boolean b=arr.containsAll(arr1);
	
	System.out.println(b);
	
	arr.removeAll(arr1);
	
	System.out.println(arr);
	
	System.out.println(arr1);
	
	TreeSet<String>tr=new TreeSet<String>(arr);
	
	System.out.println(tr);
	
	
	ArrayList arr3=new ArrayList<>();
	
	arr3.add(10);
	
	arr3.add("Anabunithi");
	
	arr3.add('c');
	
	
	System.out.println(arr3);
	

	
	
	
	

}
}