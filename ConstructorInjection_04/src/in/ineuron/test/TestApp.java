package in.ineuron.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import in.ineuron.comp.Student;

public class TestApp {
	
	public static void main(String[] args) {
		FileSystemResource resource=new FileSystemResource("src/in/ineuron/cfg/applicationContext.xml");
		XmlBeanFactory factory=new XmlBeanFactory(resource);
		Student student=factory.getBean("student",Student.class);
		System.out.println(student);
	}

}
