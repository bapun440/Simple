package Start;

 class A{
	
	  A(){
		
		System.out.println("BOW");
	}
	
	void disp() {
		
		System.out.println("Class A disp");
	}
	
	protected void speak() {
		
		System.out.println("Class A Speak");
	}
	
	
	
	private void test() {
		
		System.out.println("A Test");
	}
}


public class B extends A{

	
	private void test() {
		
		System.out.println("B  sdf Test");
	}
	
	void disp() {
		
		System.out.println("Class B disp");
	}
	
	public void speak() {
		
		System.out.println("Class B Speak");
	}
	
	public static void main(String[] args) {
		
		B b=new B();
		
		b.disp();
	
		b.speak();
		
		
		
		b.test();
		
		
	
				
	}

	
	
}
