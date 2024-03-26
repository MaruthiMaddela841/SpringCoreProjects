package in.ineuron.test;

import java.io.IOException;
import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.controller.MainController;
import in.ineuron.vo.CustomerVO;

public class TestApp {

	public static void main(String[] args) throws IOException {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Customer Name::");
		String customerName=sc.next();
		System.out.print("Enter Customer Address::");
		String customerAddress=sc.next();
		System.out.print("Enter Principle Amount::");
		String pamt=sc.next();
		System.out.print("Enter Rate Of Interest::");
		String rate=sc.next();
		System.out.print("Enter Time Period::");
		String time=sc.next();
		
		CustomerVO customerVO = new CustomerVO();
		customerVO.setCustomerName(customerName);
		customerVO.setCustomerAddress(customerAddress);
		customerVO.setPamt(pamt);
		customerVO.setRate(rate);
		customerVO.setTime(time);
		
//		DefaultListableBeanFactory factory= new DefaultListableBeanFactory();
//		XmlBeanDefinitionReader reader= new XmlBeanDefinitionReader(factory);
//		reader.loadBeanDefinitions("in/ineuron/cfg/applicationContext.xml");
		ClassPathXmlApplicationContext factory=new ClassPathXmlApplicationContext("in/ineuron/cfg/applicationContext.xml");
		System.out.println("****************Container Started*****************\n");
		
		MainController controller=factory.getBean("customerController",MainController.class);
		try {
			String result=controller.processCustomer(customerVO);
			System.out.println(result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Internal Problem Try Again..."+e.getMessage());
			e.printStackTrace();
		}
		factory.close();
		System.out.println("\n****************Container Stopped*****************");
		sc.close();
	}

}
