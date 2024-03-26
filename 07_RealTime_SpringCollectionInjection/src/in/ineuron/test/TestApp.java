package in.ineuron.test;

import java.io.IOException;
import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.comp.College;
import in.ineuron.comp.ContactsInfo;
import in.ineuron.comp.MarksInfo;
import in.ineuron.comp.UniversityInfo;

public class TestApp {

	public static void main(String[] args) throws IOException {
		
			ClassPathXmlApplicationContext factory=new ClassPathXmlApplicationContext("in/ineuron/cfg/applicationContext.xml");
			
			System.out.println("Container Started...");
			System.out.println("Bean ID::"+Arrays.toString(factory.getBeanDefinitionNames()));
			
			MarksInfo marks=factory.getBean("marks",MarksInfo.class);
			System.out.println(marks);
			
			College clg=factory.getBean("clg",College.class);
			System.out.println(clg);
			
			ContactsInfo contacts=factory.getBean("contact",ContactsInfo.class);
			System.out.println(contacts);
			
			UniversityInfo uInfo=factory.getBean("uInfo",UniversityInfo.class);
			System.out.println(uInfo);
			
			factory.close();
			System.out.println("Container Stopped...");
	}

}
