package Com;

class Parent{
   int x=10;
   void show(){
       System.out.println("parent-show");
   }
  
   void OnlyParentShow(){
       System.out.println("OnlyParentShow");
   }
   
   static void parent() {
	   
	   System.out.println("Parent");
   }
}

class Child extends Parent{
   int x=20;
   void show(){
       System.out.println("child-show");
   }
   void OnlyChildShow(){
       System.out.println("OnlyChildShow");
   }
   
 static void parent() {
	   
	   System.out.println("childparent");
   }
}

public class Z extends Child{

		
	public static void main(String[] args) {
		
	
	Parent p=new Child();
	
	p.show();
		
	System.out.println(p.x);
	
	p.OnlyParentShow();
	
	p.parent();	
		
		
	Child c=(Child)p;
	System.out.println("--------------");
	System.out.println(c.x);
	c.show();	
		
	Child c1=new Child();
	
	c1.parent();
	System.out.println(c1.x);
	
	System.out.println(p.hashCode());
	
	System.out.println(c.hashCode());
	
	System.out.println(c1.hashCode());
	
		
	}
	
	
}
