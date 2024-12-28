package in.ineuron.test;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientApp {

	public static void main(String[] args) {
	
		//Activating the container
		System.out.println("***********Container Starting**********");
		ApplicationContext factory=new ClassPathXmlApplicationContext("in/ineuron/cfg/applicationContext.xml");
		//Locale locale=new Locale(args[0],args[1]);
		Locale locale=new Locale("hi","IN");
		System.out.println(factory.getMessage("btn1.cap", null,"msg1",locale));
		System.out.println(factory.getMessage("btn2.cap", null,"msg1",locale));
		System.out.println(factory.getMessage("btn3.cap", null,"msg1",locale));
		System.out.println(factory.getMessage("btn4.cap", null,"msg1",locale));
		
		System.out.println();
		
		System.out.println(factory.getMessage("btn1.cap", new String[] {"student"},"msg1",locale));
		System.out.println("***********Container is Closing***********");
	}

}
