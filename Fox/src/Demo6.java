import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {

		
		String s="Hello";
		
		int i=0;
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter a value");
		int j=s1.nextInt();
		
		for(int k=1;k<=j;k++) {
			
			System.out.println(k);
			
			i++;
			if(i==2) {
				
				System.out.println(s);
				
				i=0;
			}
		}
		
	}

}
