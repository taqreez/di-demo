package com.taqy.learning.didemo;

import com.taqy.learning.didemo.controllers.ConstructorInjectedController;
import com.taqy.learning.didemo.controllers.MyController;
import com.taqy.learning.didemo.controllers.PropertyInjectedController;
import com.taqy.learning.didemo.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
		MyController controller = (MyController) ctx.getBean("myController");
		System.out.println(controller.hello());

		System.out.println(((PropertyInjectedController)ctx.getBean("propertyInjectedController")).sayHello());
		System.out.println(((SetterInjectedController)ctx.getBean("setterInjectedController")).sayHello());
		System.out.println(((ConstructorInjectedController)ctx.getBean("constructorInjectedController")).sayHello());
	}

}
