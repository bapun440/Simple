package Start;


abstract class AD{
	
	AD(){
		
		System.out.println("Constrcutor");
	}
	
AD(int i){
		
		System.out.println(i);
	}
	void jam() {
		 
		 System.out.println("Welcome");
	 }
	 
	 abstract void milk();
	
	/* public static void main(String[] args) {
		System.out.println("Main");
	}*/
}
public class D extends AD {

	D(){
		
		super(10);
	}
	
	private void jam1() {
		 
		 System.out.println("Welcome1");
	 }
	 
	
	public static void main(String[] args) {
		
		D d=new D();
		d.jam();
		d.milk();
		
	}

	
	void milk() {
		System.out.println("Milk");
		
	}
}
