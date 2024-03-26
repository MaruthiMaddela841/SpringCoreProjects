package in.ineuron.comp;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component(value="voter")
@PropertySource(value="in/ineuron/commons/application.properties")
public class Voter {
	
	@Value("${voter.info.name}")
	private String name;
	@Value("${voter.info.age}")
	private int age;
	private Date dov;
	
	static {
		System.out.println("Voter .class is loading....");
	}
	
	public Voter() {
		System.out.println("Voter :: zero param constructor...");
	}


	@Override
	public String toString() {
		return "Voter [name=" + name + ", age=" + age + ", dov=" + dov + "]";
	}
	
	@PostConstruct
	public void myInit() {
		
		System.out.println("Voter myInit()");
		dov=new Date();
		boolean flag=false;
		if(name==null) {
			System.out.println("Name shouldn't be null");
			flag=true;
		}
		if(age<0) {
			age=age*-1;
		}
		if(age>100) {
			System.out.println("Age must be less than 100");
			flag=true;
		}
		if(flag) {
			throw new IllegalArgumentException("Invalid Inputs...");
		}
		
	}
	
	//Business logic method
	public String checkVotingEligibility() {
		
		if(age>=18) {
			return "Hey "+name+":: You're eligible for voting..Age="+age+"---> on "+dov;
		}
		else {
			return "Hey "+name+":: You're not eligible for voting..Age="+age+"---> on "+dov;
		}
		
	}
	
	@PreDestroy
	public void myDestroy() {
		System.out.println("Voter myDestroy()");
	}
}
