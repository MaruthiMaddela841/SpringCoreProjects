package in.ineuron.comp;

import org.springframework.context.annotation.Primary;

@Primary
public class DTDC implements Courier {

	static {
		System.out.println("DTDC .class file is loading...");
	}

	public DTDC() {
		System.out.println("DTDC::Zero Param Constructor..");
	}

	@Override
	public String deliver(int oid) {
		System.out.println("DTDC Deliver()...");
		return "DTDC Courier Oid::" + oid;
	}

	@Override
	public String toString() {
		return "DTDC []";
	}

}
