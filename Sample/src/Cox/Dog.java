package Cox;

class tiger {

static int i;	
	void eat(int j){
		
	 i=j;
		System.out.println("chicken");
		
		System.out.println(i);
	}
	void drink() {
		
		System.out.println("Water");
	}
	
	
	
}
public class Dog extends tiger {

public static void main(String... args) {
	
	Dog g=new Dog();
	
	g.eat(10);
	
	
}

public static void main(int[] args) {
	
	System.out.println("asdsad");
}
	
}
