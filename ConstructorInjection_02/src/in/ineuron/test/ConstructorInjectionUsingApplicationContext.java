package in.ineuron.test;

import java.util.Arrays;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import in.ineuron.comp.WishMessageGenerator;

public class ConstructorInjectionUsingApplicationContext {

	public static void main(String[] args) {
	
		//Activating the container
		System.out.println("***********ApplicationContext Container Starting**********");
		ClassPathXmlApplicationContext factory=new ClassPathXmlApplicationContext("in/ineuron/cfg/applicationContext.xml");
		System.out.println("***********ApplicationContext Container Started***********");
		
		
		//Getting the bean from the container
		//WishMessageGenerator wmg= (WishMessageGenerator)factory.getBean("wmg",WishMessageGenerator.class);
		System.out.println();
		WishMessageGenerator wmg= (WishMessageGenerator)factory.getBean("wmg");
		System.out.println("First Object Hashcode:"+wmg.hashCode());
		String result=wmg.generateMessage("Maruthi");
		System.out.println(result);
	
		System.out.println();
		
		
		WishMessageGenerator wmg1= (WishMessageGenerator)factory.getBean("wmg");
		System.out.println("Second Object HashCode:"+wmg1.hashCode());
		String result1=wmg1.generateMessage("Maruthi");
		System.out.println(result1);
		
		System.out.println();
		
		//Closing the container
		System.out.println("No of beans created:"+factory.getBeanDefinitionCount());
		System.out.println("Beans names are:"+Arrays.toString(factory.getBeanDefinitionNames()));
		System.out.println("***********Container is Closing***********");
	}

}
