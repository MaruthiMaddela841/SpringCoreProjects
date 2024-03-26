package in.ineuron.test;

import in.ineuron.comp.WishMessageGenerator;

public class UsingCoreJava {

	public static void main(String[] args) {
	
		java.util.Date date= new java.util.Date();
		WishMessageGenerator wmg= new WishMessageGenerator(date);
		System.out.println(wmg.generateMessage("Maruthi"));

	}

}
