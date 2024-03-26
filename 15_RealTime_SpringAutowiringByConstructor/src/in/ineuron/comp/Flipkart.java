package in.ineuron.comp;

import java.util.Arrays;
import java.util.Random;

//Target Object
public class Flipkart {
	
	private Courier courier;
	private Float discount;
	
	static {
		System.out.println("Flipkart .class file is loading...");
	}
	
	public Flipkart() {
		System.out.println("Flipkart:: Zero param Constructor");
	}

	public Flipkart(Courier courier, Float discount) {
		this.courier = courier;
		this.discount = discount;
		System.out.println("Flipkart:: Two param Constructor");
	}



	@Override
	public String toString() {
		return "Flipkart [courier=" + courier + ", discount=" + discount + "]";
	}

	public String doShopping(String[] items,Float prices[]) {
		System.out.println("Flipkart doShopping()...");
		System.out.println("Implementation class is ::"+courier.getClass().getName());
		System.out.println("Discount Amount is::"+discount);
		
		int oid=0;
		Random random=null;
		float billAmt=0f;
		for(Float price:prices) {
			billAmt+=price;
		}
		billAmt-=discount;
		random=new Random();
		oid=random.nextInt(1000);
		System.out.println("Order Id is::"+oid);
		String msg=courier.deliver(oid);
		return Arrays.toString(items)+" are purchased having prices "+Arrays.toString(prices)
		+" with total bill amount of "+billAmt+" received from::"+msg;
	}
}
