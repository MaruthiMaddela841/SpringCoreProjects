package in.ineuron.comp;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

//Target Object
public class Flipkart {
	
	//@Autowired
	//@Qualifier("fFlight");
	private Courier courier;
	private Float discount;
	
	static {
		System.out.println("Flipkart .class file is loading...");
	}
	
	public Flipkart() {
		System.out.println("Flipkart:: Zero param Constructor");
	}
	
	@Autowired
	public void setCourier(@Qualifier("fFlight") Courier courier) {
		this.courier = courier;
		System.out.println("setCourier()...");
		System.out.println(this);
	}
	
	public void setDiscount(Float discount) {
		this.discount = discount;
		System.out.println("setDiscount()...");
	}
	
	@Override
	public String toString() {
		return "Flipkart [courier=" + courier + ", discount=" + discount + "]";
	}

	public String doShopping(String[] items,float[] fs) {
		System.out.println("Flipkart doShopping()...");
		System.out.println("Implementation class is ::"+courier.getClass().getName());
		System.out.println("Discount Amount is::"+discount);
		
		int oid=0;
		Random random=null;
		float billAmt=0f;
		for(Float price:fs) {
			billAmt+=price;
		}
		billAmt-=discount;
		random=new Random();
		oid=random.nextInt(1000);
		System.out.println("Order Id is::"+oid);
		String msg=courier.deliver(oid);
		return Arrays.toString(items)+" are purchased having prices "+Arrays.toString(fs)
		+" with total bill amount of "+billAmt+" received from::"+msg;
	}
}
