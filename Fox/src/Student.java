import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.plaf.synth.SynthSpinnerUI;

class Student{
	
	public static void main(String[] args) {
		
		
	String s="iaazibbdjccdiee";
	
	char [] c=s.toCharArray();
	
	char ch = 0;

	Arrays.sort(c);
	int j;
	for(int i=0;i<c.length;i++) {
		
		for(j=i+1;j<c.length;j++) {
			
			if(c[i]!=c[j]) {
				
			
				
				ch=c[i];
				
				
			}
		
		}
	
	}
	System.out.println(ch);
}
}
	
		
	

