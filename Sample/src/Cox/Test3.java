package Cox;

import java.util.Arrays;
import java.util.Base64;

public class Test3 {

	public static void main(String[] args) {

				
	int arr[]= {1,2,3};
	
	int brr[]= {1,2,3};
	

	int a[]=new int[5];
	System.out.println("length = " + a.length);
	System.out.println(a[0]);
	System.out.println(a[1]);
	a[0]=10;
	System.out.println(a[0]);
	int b[]=new int[5];
	
	b[0]=10;
	
	
	System.out.println(arr.hashCode());
	
	System.out.println(brr.hashCode());
	
	int x=10;
		
	int y=10;
	
	
	if(x==y) {
		
		System.out.println("Pass");
	}
		
	boolean c=Arrays.equals(arr, brr);
		
if(c) {
		
		System.out.println("Arrays.equals(arr, brr) Pass  arr & brr");
	}
if(arr==brr) {
	
	System.out.println("arr == brr Pass  arr & brr");
}else {
	System.out.println("arr == brr Fail  arr & brr");
}

	}
	/*
	public String main() {
		
	


	}*/

}
