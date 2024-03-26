package in.ineuron.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.bo.CustomerBo;
import in.ineuron.dao.ICustomerDAO;
import in.ineuron.dto.CustomerDto;

@Service(value="service")
public class CustomerMgmntServiceImpl implements ICustomerMgmntService{
	
	@Autowired
	private ICustomerDAO dao;
	
	static {
		System.out.println("CustomerMgmntServiceImpl .class file is loading...");
	}
	
	public CustomerMgmntServiceImpl() {
		System.out.println("CustomerMgmntServiceImpl:: zero param constructor...");
	}

	@Override
	public String calculateSimpleInterest(CustomerDto dto) throws Exception {
			float intrAmount=(dto.getPamt()*dto.getTime()*dto.getRate())/100.0f;
			CustomerBo customerBo= new CustomerBo();
			customerBo.setCustomerName(dto.getCustomerName());
			customerBo.setCustomerAddress(dto.getCustomerAddress());
			customerBo.setPamt(dto.getPamt());
			customerBo.setRate(dto.getRate());
			customerBo.setTime(dto.getTime());
			customerBo.setIntrAmount(intrAmount);
			int count=dao.save(customerBo);
		return count==0?"Customer Registration Failed":"Customer Registration Successfull-->Intrerest Amount::"+intrAmount;
	}
}
