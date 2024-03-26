package in.ineuron.comp;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

//Target Object
public class Flipkart {

	private Courier courier;
	private Float discount;
	
	static {
		System.out.println("Flipkart .class file is loading...");
	}
	
	@Autowired
	public Flipkart(@Qualifier("bDart") Courier courier, @Value("30") Float discount) {
	    this.courier = courier;
	    this.discount = discount;
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
