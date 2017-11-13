package com.Aartek;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SampleLogic {

	public static void main(String[] args)  {
		ApplicationContext appContext=new ClassPathXmlApplicationContext("Spri"
				+ "g-Sample.xml");
			SampleDTO sample=(SampleDTO) appContext.getBean("sampleDTO");
			
			System.out.println(sample.getName());
		
		
		}

}
