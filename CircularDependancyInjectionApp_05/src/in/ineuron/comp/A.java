package in.ineuron.comp;

public class A {
	private B b;
	
	static {
		System.out.println("A .class file is loading...");
	}

	public A() {
		System.out.println("A : Zero Param Constructor");
	}

	public A(B b) {
		super();
		this.b = b;
		System.out.println("A : 1 Param Constructor");
	}



	public void setB(B b) {
		this.b = b;
		System.out.println("Setter Method:A.setB()..");
	}

	@Override
	public String toString() {
		return "A [b=" + b + "]";
	}
	
	
	
	
}
