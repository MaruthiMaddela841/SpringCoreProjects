package in.ineuron.comp;

import org.springframework.beans.factory.annotation.Required;

public class PersonInfo {
	
	private Integer pid;
	private String pname;
	private String paddress;
	
	static {
		System.out.println("PersonInfo .class file is loading....");
	}
	public PersonInfo() {
		System.out.println("PersonInfo :: zero param constructor...");
	}
	@Required
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	@Required
	public void setPname(String pname) {
		this.pname = pname;
	}
	
	public void setPaddress(String paddress) {
		this.paddress = paddress;
	}
	@Override
	public String toString() {
		return "PersonInfo [pid=" + pid + ", pname=" + pname + ", paddress=" + paddress + "]";
	}
	

}
