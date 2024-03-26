package in.ineuron.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.comp.EnggClass;

public class ClientApp {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("in/ineuron/cfg/applicationContext.xml");
		System.out.println("****************Container Started*****************\n");
		EnggClass enggClass=context.getBean("ComputerScience",EnggClass.class);
		System.out.println(enggClass);
		System.out.println(enggClass.hashCode());
		System.out.println();
		EnggClass enggClass2=context.getBean("CS",EnggClass.class);
		System.out.println(enggClass2);
		System.out.println(enggClass2.hashCode());
		
		System.out.println("****************Container Stopped*****************\n");
	}

}
