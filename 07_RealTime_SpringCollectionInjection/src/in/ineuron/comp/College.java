package in.ineuron.comp;

import java.util.Date;
import java.util.List;

public class College {
	
	private List<String> sname;
	private List<Date> sdate;
	
	
	public List<String> getSname() {
		return sname;
	}


	public void setSname(List<String> sname) {
		this.sname = sname;
		System.out.println("Implementation class name::"+sname.getClass().getName());
	}


	public List<Date> getSdate() {
		return sdate;
	}


	public void setSdate(List<Date> sdate) {
		this.sdate = sdate;
	}


	@Override
	public String toString() {
		return "College [sname=" + sname + ", sdate=" + sdate + "]";
	}
	
	

}
