package in.ineuron.test;

import java.io.IOException;
import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.ineuron.cfg.AppConfig;
import in.ineuron.comp.WishMessageGenerator;


	
public class ClientApp {

	public static void main(String[] args) throws IOException {
	
		//Activating the container
		System.out.println("***********Container Starting**********");
		AnnotationConfigApplicationContext factory=new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("Bean ID Information::"+Arrays.toString(factory.getBeanDefinitionNames()));
		WishMessageGenerator wmg=factory.getBean("wmg",WishMessageGenerator.class);
		System.out.println(wmg.generateMessage("Maru"));
		
		System.out.println("***********Container is Closing***********");
	}

}
