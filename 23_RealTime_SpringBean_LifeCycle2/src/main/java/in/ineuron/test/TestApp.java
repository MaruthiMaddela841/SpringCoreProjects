package in.ineuron.test;

import java.io.IOException;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.ineuron.cfg.AppConfig;
import in.ineuron.controller.MainController;
import in.ineuron.vo.EmployeeVO;

public class TestApp {

	public static void main(String[] args) throws IOException {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the name of the Employee::");
		String name=sc.next();
		System.out.print("Enter the age of the Employee::");
		String age=sc.next();
		System.out.print("Enter the address of the Employee::");
		String address=sc.next();
		System.out.print("Enter the salary of the Employee::");
		String salary=sc.next();
		
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		MainController controller=context.getBean(MainController.class);
		System.out.println(controller);
		EmployeeVO vo= new EmployeeVO();
		vo.setEname(name);
		vo.setEage(age);
		vo.setEaddress(address);
		vo.setEsalary(salary);
		EmployeeVO result=controller.getHike(vo);
		System.out.println(result);
		
		((AbstractApplicationContext) context).close();
	}

}
