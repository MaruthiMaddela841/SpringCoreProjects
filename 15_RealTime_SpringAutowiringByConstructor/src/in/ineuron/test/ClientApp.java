package in.ineuron.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientApp {

	public static void main(String[] args) {
	
		//Activating the container
		System.out.println("***********Container Starting**********");
		ApplicationContext factory=new ClassPathXmlApplicationContext("in/ineuron/cfg/applicationContext.xml");
	
		System.out.println("***********Container is Closing***********");
	}

}
