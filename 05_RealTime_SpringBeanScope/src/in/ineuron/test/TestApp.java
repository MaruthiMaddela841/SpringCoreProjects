package in.ineuron.test;

import java.io.IOException;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.comp.Printer;

public class TestApp {

	public static void main(String[] args) throws IOException {
		
			ClassPathXmlApplicationContext factory=new ClassPathXmlApplicationContext("in/ineuron/cfg/applicationContext.xml");
			System.in.read();
			Printer printer=factory.getBean("printer",Printer.class);
			System.out.println(printer);
			
			Printer printer2=factory.getBean("printer",Printer.class);
			System.out.println(printer2);
			
			factory.close();
	}

}
