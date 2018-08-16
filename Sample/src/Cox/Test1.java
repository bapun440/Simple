package Cox;


class A{
	
	A(){
		
		System.out.println("Constructor A");
	}
}

class B extends A{
	
	B(){
		this(10);
		System.out.println("Constructor B");
	}
	
	B(int x){
		super();
		System.out.println("Varable "+x);
	}
}
public class Test1 {

	public static void main(String[] args) {

		
	B b1 = new B();
	
	}

}
