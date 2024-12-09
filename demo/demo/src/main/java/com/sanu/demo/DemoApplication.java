package com.sanu.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

	ApplicationContext context=	SpringApplication.run(DemoApplication.class, args);
		//Alien obj=new Alien();
		//suppose we want that our object is created by spring not by ourself
		//run returns an object of type context and in other class we use annotation @Component to specify the class for which we are making object to spring
		//Alien obj= context.getBean(Alien.class);//.getBean() method is used to create the object as object is known as bean in java and we specify the class inside it()
		//obj.code();
		//Alien obj1=context.getBean(Alien.class);
		//obj1.code();//we are checking whether we can create multiple objects
	//adding one more layer of class
		Laptop lap=context.getBean(Laptop.class);
	lap.compile();
	}

}
