package in.ineuron.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;

import org.springframework.core.io.FileSystemResource;

import in.ineuron.comp.WishMessageGenerator;

public class ConstructorInjectionApp {

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
		System.out.println(wmg);
		
		String result=wmg.generateMessage("Maru");
		System.out.println(result);
		
		//Closing the container
		System.out.println();
		System.out.println("***********Container is Closing***********");
	}

}
