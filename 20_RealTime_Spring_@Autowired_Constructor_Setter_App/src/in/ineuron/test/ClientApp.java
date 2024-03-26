package in.ineuron.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.comp.Flipkart;
	
public class ClientApp {

	public static void main(String[] args) {
	
		//Activating the container
		System.out.println("***********Container Starting**********");
		ClassPathXmlApplicationContext factory=new ClassPathXmlApplicationContext("in/ineuron/cfg/applicationContext.xml");
		
		Flipkart flipkart= factory.getBean(Flipkart.class);
		System.out.println(flipkart.doShopping(new String[] {"tissot","omega"}, new float[] {3500.46f,60000.66f}));
		
		System.out.println("***********Container is Closing***********");
	}

}
