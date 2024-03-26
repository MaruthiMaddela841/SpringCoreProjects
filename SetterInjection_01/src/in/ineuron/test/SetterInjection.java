package in.ineuron.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import in.ineuron.comp.WishMessageGenerator;

public class SetterInjection {

	public static void main(String[] args) {
	
		//Activating the container
		FileSystemResource resource= new FileSystemResource("src/in/ineuron/cfg/applicationContext.xml");
		System.out.println("***********Bean Factory Container Starting**********");
		XmlBeanFactory factory= new XmlBeanFactory(resource);
		System.out.println("***********Bean Factory Container Started***********");
		
		
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
		
		
		//Closing the container
		System.out.println("***********Container is Closing***********");
	}

}
