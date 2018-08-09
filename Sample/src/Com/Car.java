package Com;


public class Car {

	WebDriver driver;
	
	
	void Launch(String name) {
	if(name.toLowerCase().equals("firefox")) {		
		
			driver=new Firefox();
			
			driver.findElement();
						
			driver.getwindow();
	}else if(name.toLowerCase().equals("chrome")) {
	
		driver=new chromeDriver();
		
		driver.findElement();
					
		driver.getwindow();
	}else {
		
		System.out.println("Enter correct variable");
	}
	}
	public static void main(String[] args) {
		
		Car c=new Car();
		
		c.Launch("chrome");
		
		
	}
	
	
	
	
}

