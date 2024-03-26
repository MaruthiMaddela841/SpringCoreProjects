package in.ineuron.test;

import java.io.IOException;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.comp.PersonInfo;


public class TestApp {

	public static void main(String[] args) throws IOException {
		
			ClassPathXmlApplicationContext factory=new ClassPathXmlApplicationContext("in/ineuron/cfg/applicationContext.xml");
			
			System.out.println("Container Started...");
			System.out.println("Bean ID::"+Arrays.toString(factory.getBeanDefinitionNames()));
			
			PersonInfo pInfo=factory.getBean("pInfo",PersonInfo.class);
			System.out.println(pInfo);
			
			factory.close();
			System.out.println("Container Stopped...");
	}

}
