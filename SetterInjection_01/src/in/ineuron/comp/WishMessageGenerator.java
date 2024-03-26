package in.ineuron.comp;

import java.util.Date;

public class WishMessageGenerator {
	
	static {
		
		System.out.println("WishMessageGenerator .class file is loading...");
	}
	
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator object is created...");
	}
	
	private Date date;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		System.out.println("Setter method is called to perform setter injection...");
		this.date = date;
	}
	
	public String generateMessage(String userName) {
		
		int hour=date.getHours();
		if(hour<12)
			return "Good Morning "+userName;
		else if(hour<16)
			return "Good Afternoon "+userName;
		else if(hour<20)
			return "Good Evening "+userName;
		else
			return "Good Night "+userName;
			
	}
	

}
