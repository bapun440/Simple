package com.count_annotation;

import java.util.ArrayList;
import java.util.List;

import org.testng.IMethodInstance;
import org.testng.IMethodInterceptor;
import org.testng.ITestContext;
import org.testng.annotations.Test;

public class Count_Annotation implements IMethodInterceptor {

	@Override
	public List<IMethodInstance> intercept(List<IMethodInstance> methods, ITestContext context) {
		List<IMethodInstance> result = new ArrayList<IMethodInstance>();
		int count=0;
		for (IMethodInstance method : methods) {
			Test testMethod = method.getMethod().getConstructorOrMethod().getMethod().getAnnotation(Test.class);
			if (testMethod.priority()!=0) {
				result.add(method);
				count++;
			}
		}
		System.out.println("Number of Test Method Present:"+count);
		System.out.println();
		return result;
	}

}
