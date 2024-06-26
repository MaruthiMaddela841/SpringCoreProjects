package in.ineuron.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.ineuron.dto.CustomerDto;
import in.ineuron.service.ICustomerMgmntService;
import in.ineuron.vo.CustomerVO;

@Component(value="controller")
public class MainController {
	
	@Autowired
	private ICustomerMgmntService service;
	
	static {
		System.out.println("MainController .class file is loading...");
	}
	
	public MainController() {
		System.out.println("MainController:: zero param constructor...");
	}

	public String processCustomer(CustomerVO vo) throws Exception {
		CustomerDto customerDTO=new CustomerDto();
		customerDTO.setCustomerAddress(vo.getCustomerAddress());
		customerDTO.setCustomerName(vo.getCustomerName());
		customerDTO.setPamt(Float.parseFloat(vo.getPamt()));
		customerDTO.setRate(Float.parseFloat(vo.getRate()));
		customerDTO.setTime(Float.parseFloat(vo.getTime()));
		
		String result=service.calculateSimpleInterest(customerDTO);
		return result;
	}

	@Override
	public String toString() {
		return "MainController [service=" + service + "]";
	}
	
	

}
