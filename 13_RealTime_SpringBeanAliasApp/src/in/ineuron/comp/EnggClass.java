package in.ineuron.comp;

import java.util.Set;

public class EnggClass {
	
	private Set<String> courses;
	
	public void setCourses(Set<String> courses) {
		this.courses = courses;
	}
	
	@Override
	public String toString() {
		return "EnggClass [courses=" + courses + "]";
	}
	
	

}
