package in.ineuron.comp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component(value="fFlight")
@Primary
public class FirstFlight implements Courier {
	
	static {
		System.out.println("FirstFlight .class file is loading...");
	}
	
	public FirstFlight() {
		System.out.println("FirstFlight::Zero Param Constructor..");
	}

	@Override
	public String deliver(int oid) {
		System.out.println("FirstFlight Deliver()...");
		return "FirstFlight Courier Oid::" + oid;
	}

	@Override
	public String toString() {
		return "FirstFlight []";
	}
	
	

}
