package com.count_annotation;
import org.testng.annotations.Test;


public class Test4 extends Count_Annotation {
	/*@BeforeTest
	 public void SetData(ITestContext context){

	  int Count = 0;
	  context.setAttribute("CountTest_Method", Count);

	 }*/

	@Test(priority=1)
	public void t1() {
		System.out.println(1);
	}

	
	@Test(priority=2)
	public void t2() {
		System.out.println(2);

	}

	@Test(priority=3)
	public void t3() {
		System.out.println(3);
	}

	@Test(priority=4)
	public void t4() {
		System.out.println(4);
	}

	@Test(priority=5)
	public void t5() {
		System.out.println(5);
	}
}
