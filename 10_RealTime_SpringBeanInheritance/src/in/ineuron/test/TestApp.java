package in.ineuron.test;

import java.io.IOException;


import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.comp.Car;


public class TestApp {

	public static void main(String[] args) throws IOException {
		
			ClassPathXmlApplicationContext factory=new ClassPathXmlApplicationContext("in/ineuron/cfg/applicationContext.xml");
			
			System.out.println("Container Started...");
			System.out.println("Bean ID::"+Arrays.toString(factory.getBeanDefinitionNames()));
			
			Car car1=factory.getBean("car1",Car.class);
			System.out.println(car1);
			Car car2=factory.getBean("car2",Car.class);
			System.out.println(car2);
			
			Car baseCar=factory.getBean("baseCar",Car.class);
			System.out.println(baseCar);
			
			factory.close();
			System.out.println("Container Stopped...");
	}

}
