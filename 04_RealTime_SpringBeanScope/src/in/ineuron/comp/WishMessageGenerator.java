package in.ineuron.comp;

import java.util.Date;

public class WishMessageGenerator {
	
	private Date date;
	
	public void setDate(Date date) {
		this.date = date;
		System.out.println("Setter Injection...");
		System.out.println(this);
	}

	static {
		
		System.out.println("WishMessageGenerator .class file is loading...");
	}
	
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator Zero Param Constructor...");
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

	@Override
	public String toString() {
		return "WishMessageGenerator [date=" + date + "]";
	}
	

}
