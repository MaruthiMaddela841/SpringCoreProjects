package in.ineuron.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import in.ineuron.comp.A;
import in.ineuron.comp.B;

public class TestApp {

	public static void main(String[] args) {

		DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader = null;
		factory = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("in/ineuron/cfg/applicationContext.xml");
		System.out.println("********Container Started**************\n");
		A a=factory.getBean("a1",A.class);
		//System.out.println("A:"+a);
		
		B b=factory.getBean("b1",B.class);	
		//System.out.println("B:"+b);
		
		System.out.println("\n********Container Closed**************");

	}

}
