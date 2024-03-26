package in.ineuron.test;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.comp.WishMessageGenerator;

public class TestApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext(
				"in/ineuron/cfg/applicationContext.xml");
		System.out.println("No of beans created:" + factory.getBeanDefinitionCount());
		System.out.println("Beans names are:" + Arrays.toString(factory.getBeanDefinitionNames()));

		WishMessageGenerator wmg = factory.getBean("wmg", WishMessageGenerator.class);
		System.out.println(wmg);

		factory.close();

	}

}
