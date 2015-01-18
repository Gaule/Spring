package com.min.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {
	
	public static void main(String arg[]){
		//Triangle triangle =new Triangle();
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		//Triangle triangle = (Triangle) factory.getBean("Triangle");
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring1.xml");
		context.registerShutdownHook();
		//Triangle triangle = (Triangle) context.getBean("Triangle");
		
		Triangle1 triangle = (Triangle1) context.getBean("Triangle1");
		triangle.draw();
		
		Triangle1 triangle2 = (Triangle1) context.getBean("Triangle2");
		triangle2.drawFromCollectionPoints();;
		 System.out.println("Example of bean inheritance");
		Triangle1 triangle3 = (Triangle1) context.getBean("Triangle3");
		triangle3.draw();
		
		
	}

}
