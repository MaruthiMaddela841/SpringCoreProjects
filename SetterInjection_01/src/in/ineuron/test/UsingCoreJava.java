package in.ineuron.test;

import in.ineuron.comp.WishMessageGenerator;

public class UsingCoreJava {

	public static void main(String[] args) {
	
		WishMessageGenerator wmg= new WishMessageGenerator();
		java.util.Date date= new java.util.Date();
		wmg.setDate(date);
		
		System.out.println(wmg.generateMessage("Maruthi"));

	}

}
