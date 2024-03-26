package in.ineuron.test;

import java.io.IOException;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import in.ineuron.comp.Flipkart;

public class TestApp {

	public static void main(String[] args) throws IOException {
		//
		DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader = null;
		factory = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("in/ineuron/cfg/applicationContext.xml");
		System.out.println("********Container Started**************\n");
		Flipkart flipkart = factory.getBean("fpkt",Flipkart.class);
		System.out.println(flipkart);
		System.out.println();
		String result=flipkart.doShopping(new String[] { "fossil", "titan" }, new Float[] { 123.5f, 432.4f });
		System.out.println(result);
		System.out.println("\n********Container Closed**************");
	}

}
