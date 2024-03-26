package in.ineuron.comp;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "wmg")
@Scope(scopeName = "singleton")
public class WishMessageGenerator {

	@Autowired(required = true)
	@Qualifier("date1")
	private Date date;

	static {

		System.out.println("WishMessageGenerator .class file is loading...");
	}

	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator Zero Param Constructor...");
	}

	public String generateMessage(String userName) {

		int hour = date.getHours();
		if (hour < 12)
			return "Good Morning " + userName;
		else if (hour < 16)
			return "Good Afternoon " + userName;
		else if (hour < 20)
			return "Good Evening " + userName;
		else
			return "Good Night " + userName;

	}

	@Override
	public String toString() {
		return "WishMessageGenerator [date=" + date + "]";
	}

}
