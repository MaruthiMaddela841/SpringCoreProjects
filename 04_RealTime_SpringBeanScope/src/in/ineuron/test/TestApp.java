package in.ineuron.test;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.comp.WishMessageGenerator;

public class TestApp {

	public static void main(String[] args) throws IOException {
		
			ClassPathXmlApplicationContext factory=new ClassPathXmlApplicationContext("in/ineuron/cfg/applicationContext.xml");
			//System.in.read();
			WishMessageGenerator wmg= factory.getBean("wmg",WishMessageGenerator.class);
			System.out.println(wmg+" avaialable at::"+wmg.hashCode());
			
			WishMessageGenerator wmg2= factory.getBean("wmg",WishMessageGenerator.class);
			System.out.println(wmg2+" avaialable at::"+wmg2.hashCode());

	}

}
