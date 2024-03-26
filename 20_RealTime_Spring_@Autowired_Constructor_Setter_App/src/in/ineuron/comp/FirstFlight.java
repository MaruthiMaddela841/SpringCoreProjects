package in.ineuron.comp;

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
