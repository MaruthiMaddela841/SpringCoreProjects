package in.ineuron.test;

import java.io.IOException;
import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.comp.Student;

public class TestApp {

	public static void main(String[] args) throws IOException {
		
			ClassPathXmlApplicationContext factory=new ClassPathXmlApplicationContext("in/ineuron/cfg/applicationContext.xml");
			
			System.out.println("Container Started...");
			System.out.println("Bean ID::"+Arrays.toString(factory.getBeanDefinitionNames()));
			//System.in.read();
			
			Student student=factory.getBean("in.ineuron.comp.Student#0",Student.class);
			System.out.println(student);
			
			Student student1=factory.getBean("in.ineuron.comp.Student#1",Student.class);
			System.out.println(student1);
			
			factory.close();
	}

}
