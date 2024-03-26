package in.ineuron.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.comp.PersonInfo;

public class ClientApp {

	public static void main(String[] args) {
	
		//Activating the container
		System.out.println("***********Container Starting**********");
		ClassPathXmlApplicationContext factory=new ClassPathXmlApplicationContext("in/ineuron/cfg/applicationContext.xml");
		
		PersonInfo personInfo=factory.getBean("personInfo",PersonInfo.class);
		System.out.println(personInfo);
		System.out.println("***********Container is Closing***********");
	}

}
