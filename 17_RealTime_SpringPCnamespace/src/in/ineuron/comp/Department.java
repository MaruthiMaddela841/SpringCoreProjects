package in.ineuron.comp;

import java.util.Date;

public class Department {
	
	private int dno;
	private String dname;
	private Date doj;
	
	

	public void setDno(int dno) {
		this.dno = dno;
	}



	public void setDname(String dname) {
		this.dname = dname;
	}



	public void setDoj(Date doj) {
		this.doj = doj;
	}



	public Department(int dno, String dname, Date doj) {
		this.dno = dno;
		this.dname = dname;
		this.doj = doj;
	}



	@Override
	public String toString() {
		return "Department [dno=" + dno + ", dname=" + dname + ", doj=" + doj + "]";
	}
	
	

}
