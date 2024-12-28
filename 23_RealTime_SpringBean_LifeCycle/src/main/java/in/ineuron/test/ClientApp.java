package in.ineuron.test;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.comp.Voter;

	
public class ClientApp {

	public static void main(String[] args) throws IOException {
	
		//Activating the container
		System.out.println("***********Container Starting**********");
		ClassPathXmlApplicationContext factory=new ClassPathXmlApplicationContext("in/ineuron/cfg/applicationContext.xml");
		Voter voter=factory.getBean(Voter.class);
		System.out.println(voter);
		String status=voter.checkVotingEligibility();
		System.out.println(status);
		factory.close();
		System.out.println("***********Container is Closing***********");
	}

}
