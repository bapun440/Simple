
public class Demo1 {

	public static void main(String[] args) {
		
		
		int[] j= {1,0,1,0,1,0};
		
		
		
		for(int i=0;i<j.length;i++) {
			
			
			for(int k=i+1;k<j.length;k++) {
				
				if(j[i]>j[k]) {
					
					int temp=j[i];
					
					j[i]=j[k];
					
					j[k]=temp;
				}
			}
		}
		
		for(int l:j) {
			
			System.out.println(l);
		}
		
		String s="Anbu";
		
		String s1=new String("Anbu");
		
		String a="Anbu";
		
		String s2=new String(a);
		
		String b="Anbu";
		
		
		
		System.out.println(System.identityHashCode(s));
		
		System.out.println(System.identityHashCode(s1));
		
		System.out.println(System.identityHashCode(a));
		
		
		
		System.out.println(System.identityHashCode(s2));
		
		System.out.println(System.identityHashCode(b));
	}
	
}
