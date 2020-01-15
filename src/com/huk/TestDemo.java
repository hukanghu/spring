package com.huk;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ApplicationContext context = 
	             new ClassPathXmlApplicationContext("Beans.xml");
	    //  HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
	    //  obj.getMessage();
		
		TextEditor te = (TextEditor) context.getBean("textEditor");
	    te.spellCheck();
		
		te.setName("胡康");
		System.out.println(te.getName());
		*/
		/*
		ApplicationContext context = 
	             new ClassPathXmlApplicationContext("Beans_context.xml");
		
		Student student = (Student) context.getBean("student");
	      System.out.println("Name : " + student.getName() );
	      System.out.println("Age : " + student.getAge() );
		
	      Profile profile = (Profile) context.getBean("profile");
	      profile.printAge();
	      profile.printName();
		*/
		
		ApplicationContext context = 
	             new ClassPathXmlApplicationContext("Beans_aop.xml");
	      Student_aop student = (Student_aop) context.getBean("student");
	      
	      student.getName();
	      
	      student.getAge();      
	      //student.printThrowException();
		
	}

}
