package in.ineuron.comp;

import org.springframework.context.annotation.Primary;

public class BlueDart implements Courier {
	
	static {
		System.out.println("BluDart .class file is loading...");
	}
	
	public BlueDart() {
		System.out.println("BlueDart::Zero Param Constructor..");
	}

	@Override
	public String deliver(int oid) {
		System.out.println("BlueDart Deliver()...");
		return "BlueDart Courier Oid::"+oid;
	}

	@Override
	public String toString() {
		return "BlueDart []";
	}
	
	

}
