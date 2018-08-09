package Rolls;


import javax.management.MXBean;
 class Van{
	
	
	int i=10;
	
	 void Test(int  i) {
		
		System.out.println("Test"+i);
		
	}
	
	
}

public  class Startup extends Van {

	int m=100;
	
	int n=200;
	
	void Demo1(int s) {
		
		System.out.println("Demo1"+s);
		
		System.out.println(m);
	}
	
	void Demo2(String  s) {
		
		System.out.println("Demo1"+s);
	}

	
	public static void main(String[] args) {

		
		
		Van s=new Startup();
		
	
		
		
	
	
	
	}

}