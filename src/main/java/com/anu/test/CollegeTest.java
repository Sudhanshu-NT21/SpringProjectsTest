package com.anu.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.anu.bean.College;

public class CollegeTest {

	public static void main(String[] args) {
		//  property
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader =null;
		College college1=null, college2=null, college3=null;
		//IOC Container
		factory=new DefaultListableBeanFactory();
		reader= new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/anu/cfg/applicationContext.xml");
		
		//get beans property
		college1=factory.getBean("clg", College.class);
		System.out.println(college1);
		System.out.println();
		
		college2=factory.getBean("clg1", College.class);
		System.out.println(college1);
		System.out.println();
		
		college3=factory.getBean("clg2", College.class);
		System.out.println(college3);
		System.out.println();
	}

}
