package in.ineuron.comp;

public class Printer {
	
	private static Printer INSTANCE=null;
	
	private Printer() {
		
	}
	
	static {
		System.out.println("Printer .class file is loading...");
	}
	
	public static Printer getInstance() {
		if(INSTANCE==null) {
			INSTANCE=new Printer();
		}
		return INSTANCE;
	}

	@Override
	public String toString() {
		return "Printer [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	

}
