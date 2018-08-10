
class Eampl121 {
	void method()throws ArithmeticException{  
		  throw new ArithmeticException("ArithmeticException Occurred");  
		 }  
		}  
		public class Coflict1{  
		   public static void main(String args[])throws ArithmeticException{
			   Eampl121 obj=new Eampl121();  
		     obj.method();  
		    System.out.println("ram");
		    System.out.println("End Of Program");  
		  }  
}
