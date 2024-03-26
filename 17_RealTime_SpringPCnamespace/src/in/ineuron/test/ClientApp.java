package in.ineuron.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.comp.Employee;

public class ClientApp {

	public static void main(String[] args) {
	
		//Activating the container
		System.out.println("***********Container Starting**********");
		ClassPathXmlApplicationContext factory=new ClassPathXmlApplicationContext("in/ineuron/cfg/applicationContext.xml");
		
		Employee employee=factory.getBean("employee",Employee.class);
		System.out.println(employee);
		System.out.println("***********Container is Closing***********");
	}

}
